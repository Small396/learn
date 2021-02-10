package stream;

import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: lizhenguang
 * @date: 2021/2/10 12:57 下午
 */
public class MapStream {

    private static Map<String, String> map;

    public static void main(String[] args) {
        System.out.println("初始化的数据:" + JSON.toJSONString(init()));
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });

      List<String> list = map.entrySet().stream().map(Map.Entry::getKey).distinct().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(list));
    }

    /**
     * map数据初始化
     *
     * @return
     */
    public static Map<String, String> init() {
        map = new HashMap<>(5);
        map.put("small", "sun");
        map.put("shine", "ing");
        map.put("king", "张三");
        return map;
    }
}
