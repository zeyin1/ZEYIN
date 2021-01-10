package com.example.zeyin.Parallel;

import com.example.zeyin.Parallel.sync.SyncThread1;
import com.example.zeyin.Parallel.sync.SyncThread2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 15:46
 * @Modify:
 */
@SpringBootTest
public class MySyncTest {

    @Test
    public void test1() {
        SyncThread1 syncThread1 = new SyncThread1();
        SyncThread2 syncThread2 = new SyncThread2();
        syncThread1.run();
        syncThread2.run();
    }


}
