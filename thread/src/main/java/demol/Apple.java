package demol;

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
