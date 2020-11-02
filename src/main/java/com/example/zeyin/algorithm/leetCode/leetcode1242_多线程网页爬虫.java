package com.example.zeyin.algorithm.leetCode;

import com.example.zeyin.util.HtmlParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2020年10月18日 15:25
 * @Modify:
 */
public class leetcode1242_多线程网页爬虫 {
    /**
     * 使用 ConcurrentHashMap 存储答案 （ConcurrentHashSet 力扣上该题好像不能用）
     * 使用 LinkedBlockingQueue 存储准备解析的 URL，初始包含 startUrl, 解析过程中会动态添加、和弹出
     * 准备若干个线程，每个线程都从 非空的 LinkedBlockingQueue 弹出一个 url，进行解析
     * 如果答案中没有，并且满足相同主机名要求，则加入答案，并增加到 LinkedBlockingQueue 中 （依照题意“ 你可以假设路径都是不重复的”，这里没有考虑重复解析的情况）
     * 如果 LinkedBlockingQueue 空了，判断一下其他线程是不是也没有在工作了，如果是，中断其他线程，然后结束自己**
     * 外层阻塞等待线程结束
     * 返回答案
     */
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        final Map<String, Integer> ans = new ConcurrentHashMap<>();
        final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        ans.put(startUrl, 0);
        queue.offer(startUrl);

        int length = 7;//"http://".length();
        int endIndex = startUrl.indexOf("/", length);
        final String hostName = endIndex < 0 ? startUrl : startUrl.substring(0, endIndex);

        final int core = Math.max(Runtime.getRuntime().availableProcessors() - 1, 4);
        final Thread[] ts = new Thread[core];
        final AtomicBoolean[] tf = new AtomicBoolean[core];
        for (int i = 0; i < tf.length; i++) {
            tf[i] = new AtomicBoolean();
        }
        for (int i = 0; i < ts.length; i++) {
            final int index = i;
            Runnable r = () -> {
                boolean end = false;
                while (!end) {
                    while (!queue.isEmpty()) {
                        String toGetUrl = queue.poll();
                        tf[index].compareAndSet(false, true);
                        List<String> urls = htmlParser.getUrls(toGetUrl);
                        for (String url : urls) {
                            if (ans.containsKey(url)) {
                                continue;
                            }
                            if (url.startsWith(hostName)) {
                                ans.put(url, 0);
                                queue.offer(url);
                            }
                        }
                        tf[index].compareAndSet(true, false);
                    }
                    end = queue.isEmpty();
                    if (end) {
                        for (int k = 0; k < ts.length; k++) {
                            if (index != k && tf[k].get()) {
                                end = false;
                                break;
                            }
                        }
                        if (end) {
                            for (int k = 0; k < ts.length; k++) {
                                if (index != k) {
                                    ts[k].interrupt();
                                }
                            }
                        }
                    }
                }
            };
            ts[index] = new Thread(r);
        }
        for (Thread t : ts) {
            t.start();
        }
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>(ans.keySet());
    }
}
