package demol;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

/**
 * @author: lizhenguang
 * @date: 2021/2/9 2:14 下午
 */
@Data
@Builder(toBuilder = true)
public class Apple {

    private String color; //颜色
    private String price; //价格
    private int size; //大小
    private boolean isEnter; //是否进口
}
 class Run{
     public static void main(String[] args) {
         Apple apple =  Apple.builder().color("red").price("1.22").isEnter(true).size(8).build();
         String str = JSON.toJSONString(apple);
         AppleDouble appleDouble =    JSON.parseObject(str,AppleDouble.class);
         System.out.println(JSON.toJSONString(appleDouble));
        // System.out.println(str);
     }
}