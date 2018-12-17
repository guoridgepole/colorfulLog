package com.colorfullog.log;

/**
 * 多彩的日志 <br/>
 * log.v 颜色灰色 用于输出无关紧要的内容 <br/>
 * CLog.d 颜色青色，仅输出debug调试 <br/>
 * CLog.i 颜色蓝色，用来输出提示性消息 <br/>
 * CLog.w 颜色橙色，用来作为警告信息 <br/>
 * CLog.e 颜色红色，用于error错误
 */
public class CLog {

    private CLog() {}

    /**
     * 吐槽专用
     * @param msg 无关紧要信息的内容
     */
    public static void v(String msg) {
        System.out.println("\033[37;m" + msg + "\033[0m");
    }

    /**
     * 吐槽专用
     * @param tag 无关紧要信息的标签
     * @param msg 无关紧要信息的内容
     */
    public static void v(String tag, String msg) {
        System.out.println("\033[37;1;m" + tag + ":" + "\033[0m" + "\033[37;m" + msg + "\033[0m");
    }

    /**
     * debug调试信息
     * @param msg debug调试信息的内容
     */
    public static void d(String msg) {
        System.out.println("\033[96;m" + msg + "\033[0m");
    }

    /**
     * debug调试信息
     * @param tag debug调试信息的标签
     * @param msg debug调试信息的内容
     */
    public static void d(String tag, String msg) {
        System.out.println("\033[96;1;m" + tag + ":" + "\033[0m" + "\033[96;m" + msg + "\033[0m");
    }

    /**
     * 提示性消息
     * @param msg 提示性消息的标签
     */
    public static void i(String msg) {
        System.out.println("\033[34;m" + msg + "\033[0m");
    }

    /**
     * 提示性消息
     * @param tag 提示性消息的标签
     * @param msg 提示性消息的内容
     */
    public static void i(String tag, String msg) {
        System.out.println("\033[34;1;m" + tag + ":" + "\033[0m" + "\033[34;m" + msg + "\033[0m");
    }

    /**
     * 警告信息
     * @param msg 警告信息的内容
     */
    public static void w(String msg) {
        System.out.println("\033[33;m" + msg + "\033[0m");
    }

    /**
     * 警告信息
     * @param tag 警告信息的标签
     * @param msg 警告信息的内容
     */
    public static void w(String tag, String msg) {
        System.out.println("\033[33;1;m" + tag + ":" + "\033[0m" + "\033[33;m" + msg + "\033[0m");
    }

    /**
     * error错误
     * @param msg error错误的信息
     */
    public static void e(String msg) {
        System.out.println("\033[31;m" + msg + "\033[0m");
    }

    /**
     * error错误
     * @param tag error错误的标签
     * @param msg error错误的信息
     */
    public static void e(String tag, String msg) {
        System.out.println("\033[31;1;m" + tag + ":" + "\033[0m" + "\033[31;m" + msg + "\033[0m");
    }
}