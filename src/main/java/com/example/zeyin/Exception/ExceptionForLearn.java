package com.example.zeyin.Exception;

/**
 * @Description: 用一句话描述
 * @Author: zeyin
 * @Date: 2021年01月10日 14:13
 * @Modify:
 */
public class ExceptionForLearn {

    /**
     * @Description: 数组越界是运行时异常
     * @Author: zeyin
     * @Date: 2021/1/10 14:16
     */
    public static void ArrayException() {
        try {
            int[] arrays = new int[10];
            System.out.print(arrays[10]);
        } catch (Exception e) {
            System.out.print("运行时异常");
        }
    }

    /**
     * @Description: 数值非法也是运行时异常
     * @Author: zeyin
     * @Date: 2021/1/10 14:22
     */
    public static void mathException() {
        int res = 1 / 0;
    }

    /**
     * @Description: finally使用
     * 代码在走到第 3 行的时候遇到了一个 MathException，这时第四行的代码就不会执行了，代码直接跳转到 catch
     * 语句中，走到第 6 行的时候，异常机制有这么一个原则如果在 catch 中遇到了 return 或者异常等能使该函数终止的话
     * 那么有 finally 就必须先执行完 finally 代码块里面的代码然后再返回值。因此代码又跳到第 8 行，可惜第 8 行是一个
     * return 语句，那么这个时候方法就结束了，因此第 6 行的返回结果就无法被真正返回。如果 finally 仅仅是处理了一个
     * 释放资源的操作，那么该道题最终返回的结果就是 2。因此上面返回值是 3。
     * @Author: zeyin
     * @Date: 2021/1/10 14:20
     */
    public static int FinallyException() {
        try {
            int res = 1 / 0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static int FinallyException1() {
        try {
            System.out.println("正常逻辑处理");
            int res = 1 / 0;
            return 1;
        } catch (Exception e) {
            System.out.println("异常逻辑处理");
            return 2;
        } finally {
            System.out.println("finally逻辑处理");
        }

    }

    /**
     * @Description:
     * 只有在try里面是有System.exit(0)来退出JVM的情况下finally块中的代码才不会执行。否则finally块中的代码都会执行。
     * 一般来讲finally里面不会写return或者是throw，如果写了，会覆盖掉try里面的return和throw。
     * @Author: zeyin
     * @Date: 2021/1/10 14:39
     */
    public static int FinallyException2() {
        try {
            System.out.println("正常逻辑处理");
            int res = 1 / 0;
            return 1;
        } catch (Exception e) {
            System.out.println("异常逻辑处理");

            //退出JVM,不会指向finally
            System.exit(0);
            return 2;
        } finally {
            System.out.println("finally逻辑处理");
        }

    }
}
