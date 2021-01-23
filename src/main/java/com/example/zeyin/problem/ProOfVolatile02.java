package com.example.zeyin.problem;

/**
 * @Description: 内存屏障
 * @Author: zeyin
 * @Date: 2021年01月23日 13:41
 * @Modify:
 */
public class ProOfVolatile02 {
    int a, b;
    volatile int v, u;

    void f() {
        int i, j;

        i = a;
        j = b;
        i = v;
        //LoadLoad
        j = u;
        //LoadStore
        a = i;
        b = j;
        //StoreStore
        v = i;
        //StoreStore
        u = j;
        //StoreLoad
        i = u;
        //LoadLoad
        //LoadStore
        j = b;
        a = i;
    }
}
