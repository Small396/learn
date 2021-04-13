package string;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author: lizhenguang
 * @date: 2021/2/10 2:25 下午
 */
public class StringLearn {

    //静态对象
    private static final AtomicBoolean atomicBoolean = new AtomicBoolean();

    public static void main(String[] args) {

        System.out.println(atomicBoolean.compareAndSet(true, false));

 /*       for (int i = 1; i <= 10; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(String.format("第%s次,uuid:%s", i, uuid));
            String uuidRemove = StringUtils.remove(uuid, '-');
            System.out.println(String.format("第%s次,uuidRemove:%s%n", i, uuidRemove));
        }*/
        // Byte [] byte = new Byte[1024];

  /*      System.out.println(String.format("%d%%", 90));
        System.out.println(String.format("%b", Boolean.TRUE));
        System.out.println(String.format("%o", 16));
        if (Boolean.TRUE.equals(true)) {
            System.out.println("方法为true");
        }
        *//**
         * o-8进制，x-16进制，d-10进制
         */


/*
        Map map = new HashMap();
        map.put("small","sun");
        map.put("sun","shine");
        System.out.println(map.toString());
        map.remove("small","s");
        System.out.println(map.toString());*/


        //str字符串复制10变成一个全新的字符串对象
       /* String result = repeat("str", 10);
        System.out.println(result);*/
     /*   StringBuilder sBuilder = new StringBuilder(200);
        System.out.println(sBuilder.length());
        StringBuilder sBuilder001 = new StringBuilder("str");
        System.out.println(sBuilder001.length());

        int count = StringUtils.countMatches("3984394835435", "5");
        System.out.println(count);
        */


    }

    /**
     * 复制字符串N遍生成一个全新的字符串对象
     *
     * @param str
     * @param count
     * @return
     */
    public static String repeat(String str, int count) {
        return StringUtils.repeat(str, count);
    }


}
