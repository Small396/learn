
import com.alibaba.fastjson.JSON;
import demol.Apple;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;


/**
 * @author: lizhenguang
 * @date: 2021/2/9 1:34 下午
 */
public class RunMain {

    private static List<Apple> apples;
    private static String[] color = {"red", "yello", "green", "blank"};
    private static Boolean[] enter = {true, false};
    private static Random random = new Random();
    private static int value = 6000;

    public static void main(String[] args) {
        String str = "small sun   shine 123 456  789";
        //String Str [] = str.split("\\s+");
       String Str [] = str.split(" ");
        System.out.println(JSON.toJSONString(Str));
        str.startsWith("sm");
        str.endsWith("shine");
       /* init(12);
        Map<String, List<Apple>> appleMap = apples.stream().filter(apple -> apple.isEnter() && "red".equals(apple.getColor())).collect(Collectors.groupingBy(Apple::getColor));
*/
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
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return Apple.builder().color(color[random.nextInt(4)]).isEnter(enter[random.nextInt(2)]).size(random.nextInt(13)).price(decimalFormat.format(random.nextDouble() + value)).build();
    }


}
