package thread;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: lizhenguang
 * @date: 2021/2/27 9:53 下午
 */
public class ThreadTest {

    private static final List aList = new ArrayList<>();
    private static final List bList = new ArrayList<>();
    private static volatile AtomicInteger atomicCount = new AtomicInteger();
    /**
     * list集合初始化
     */
    public static void init(int size) {
        Random random = new Random();
        int count = atomicCount.get();
        while (count < 2*size) {
            int item = random.nextInt(100);
            if (count % 2 == 0) {
                aList.add(item);
                bList.add(item);
            } else {
                aList.add(item);
                bList.add(random.nextInt(100));
            }
            atomicCount.incrementAndGet();
        }
        System.out.println("aList========>>" + JSON.toJSONString(aList));
        System.out.println("bList========>>" + JSON.toJSONString(bList));
    }

    /**
     * removeAll() 方法过滤
     */
    public static List removeAll(final List aList, final List bList) {
        List emptyList = new ArrayList();
        if (bList == null) return emptyList;
        if (aList == null || aList.size() == 0) {
            return bList != null ? bList : emptyList;
        }
        bList.removeAll(aList);
        return bList;
    }


    public static void filter() {

    }

    public static void main(String[] args) throws InterruptedException {
        Thread aThread = new Thread(() -> {
            init(5);
            System.out.println(removeAll(aList, bList));
        });
        Thread bThread = new Thread(() -> {
            init(5);
            System.out.println(removeAll(aList, bList));
        });
        aThread.start();
        //bThread.start();
        Thread.currentThread().sleep(1000);
        System.out.println("主线程结束===========>>>>>>");
    }

}

