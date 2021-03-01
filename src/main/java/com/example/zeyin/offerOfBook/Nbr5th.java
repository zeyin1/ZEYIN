package com.example.zeyin.offerOfBook;

/**
 * @Description: 替换空格
 * @Author: zeyin
 * @Date: 2020年12月13日 14:06
 * @Modify:
 */
public class Nbr5th {

    public String replace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                sb.append("02%");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.reverse().toString();
    }

}
