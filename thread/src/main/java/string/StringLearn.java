package string;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: lizhenguang
 * @date: 2021/2/10 2:25 下午
 */
public class StringLearn {


    public static void main(String[] args) {
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
