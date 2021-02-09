package stream;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lizhenguang
 * @date: 2021/2/9 1:53 下午
 */

public class FilterUtil<T> {

    public  List<T> sizeFilter(List<T> list, int size) {
        //元素为空，直接返回空
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        return list.stream().limit(size).collect(Collectors.toList());
    }


}
