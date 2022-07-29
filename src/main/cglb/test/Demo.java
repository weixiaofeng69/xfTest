package main.cglb.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Demo {
    public static void main(String[] args) {
 /*       int oldCapacity=22;
        int newCapacity =(oldCapacity >> 1);
        System.out.println(newCapacity);
        HashMap hashMap=new HashMap();
        hashMap.put("1","3");
        HashSet hashSet=new HashSet();
        hashSet.add("2");
        ThreadLocal threadLocal=new ThreadLocal();

        Map map=new HashMap();
        //threadLocal.*/
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }
    }
    public void f(int a) {
        if (true) {
            // 表示结束方法的执行,下方的输出语句不会执行
            return;
        }
        System.out.println(a);
    }
}
