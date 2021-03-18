package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: lizhenguang
 * @date: 2021/2/27 9:53 下午
 */
public class ThreadTest {

 private   ThreadPoolExecutor threadPoolExecutor;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count = new CountDownLatch(5);
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println(finalI);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    count.countDown();
                }
            }).start();
        }
        count.await();
        System.out.println("end");
        long end  = System.currentTimeMillis();
        System.out.println("用时:"+String.format("%sms", end - start));
       /* long stratTime = System.currentTimeMillis();
      //  final CountDownLatch countDownLatch = new CountDownLatch(1);
        System.out.println("统计1到100和：" + count(1));
        Thread thread001 = new Thread(() -> {
            int sum  = 1;
            for(int i =0;i<=100;i++){
                ++sum;
            }
            System.out.println("累计计数器："+sum);
        }, "线程一");
        thread001.start();
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+  (endTime - stratTime)+"ms");

        System.out.println("thread结束了=========>>>");
*/
    }


    public static int count(int num) {
        int sum = 0;
        if (num < 101) {
            sum = num + count(++num);
        }
        return sum;
    }
}

