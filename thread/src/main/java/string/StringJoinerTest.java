package string;

import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: lizhenguang
 * @date: 2021/3/4 9:37 上午
 */
public class StringJoinerTest {


    public static void main(String[] args) {
        System.out.println("字符串：" + getJoinerStr());
        System.out.println(getDelimiter());
    }

    /**
     * 逗号分隔，拼接字符串
     *
     * @return
     */
    public static String getJoinerStr() {
        StringJoiner stringJoiner = new StringJoiner(",");
        IntStream.range(1, 11).forEach(i -> stringJoiner.add(String.valueOf(i)));
        return stringJoiner.toString();
    }

    /**
     * 分隔符，前缀，后缀
     *
     * @return
     */
    public static String getDelimiter() {
        StringJoiner stringJoiner = new StringJoiner("','", "['", "']");
        Stream.of(1, 2).forEach(j -> stringJoiner.add(String.valueOf(j)));
        return stringJoiner.toString();
    }
}
