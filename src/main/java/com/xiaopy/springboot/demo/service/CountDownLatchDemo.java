package com.xiaopy.springboot.demo.service;

import java.util.concurrent.*;

/**测试类
 * @author Xiaopy
 * @date 2019/6/423:10
 */
public class CountDownLatchDemo {

    public void getTest(CountDownLatch latch){
        System.out.println(Thread.currentThread().getName() + " start to check!");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            latch.countDown();
        }
    }

    public static void main(String[] args) {
        CountDownLatchDemo test=new CountDownLatchDemo();
        final CountDownLatch latch=new CountDownLatch(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 0L,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10;i++){
            executor.submit(() -> test.getTest(latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("任务完成,一共消耗时间"+(end-startTime)+"ms");
    }
}
