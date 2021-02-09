import com.alibaba.fastjson.JSON;
import demol.Apple;
import stream.FilterUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author: lizhenguang
 * @date: 2021/2/9 1:34 下午
 */
public class RunMain {
    private static List<Apple> apples;

    public static void main(String[] args) {
        init(12);
        System.out.println(apples);
    }

    /**
     * 苹果数据初始化
     *
     * @return
     */
    private static List<Apple> init(int size) {
        apples = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            apples.add(produceApple());
        }
        return apples;
    }

    /**
     * 出产苹果
     *
     * @return
     */
    private static Apple produceApple() {
        Random random = new Random();
        String[] color = {"red", "yello", "green", "blank"};
        Boolean[] enter = {true, false};
        Apple apple = Apple.builder().color(color[random.nextInt(4)]).isEnter(enter[random.nextInt(2)]).size(random.nextInt(13)).price(random.nextDouble()).build();
        return apple;
    }


}
