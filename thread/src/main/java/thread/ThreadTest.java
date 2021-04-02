package thread;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lizhenguang
 * @date: 2021/2/27 9:53 下午
 */
public class ThreadTest {

    /**
     * removeAll() 方法过滤
     */
    public static void removeAll() {
        List<String> aList = new ArrayList<>();
        aList.add("1");
        aList.add("2");
        aList.add("4");
        List<String> bList = new ArrayList<>();
        bList.add("1");
        bList.add("2");
        bList.add("3");
        bList.removeAll(aList);
        System.out.println(JSON.toJSONString(bList));
    }


    public static void  filter(){
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list1.stream().forEach( a -> {
            list2.stream().filter( b->  b.equals(a)).collect(Collectors.toList());

                }
        );

    }

    public static void main(String[] args) throws InterruptedException {
        removeAll();
    }

}

