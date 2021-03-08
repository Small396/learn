package stream;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: lizhenguang
 * @date: 2021/2/9 1:53 下午
 */

public class FilterUtil<T> {
    private static String str = "abbccccaaddaggb";
    public  List<T> sizeFilter(List<T> list, int size) {
        //元素为空，直接返回空
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        return list.stream().limit(size).collect(Collectors.toList());
    }

    public static  String toStr() {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Stream.of(chars).distinct().collect(Collectors.toList()).forEach(i -> stringBuilder.append(i));

        System.out.println(stringBuilder.toString());
        return "";
    }

    public static void main(String[] args) {
        toStr();
    }

}
