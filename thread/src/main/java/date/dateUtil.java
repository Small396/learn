package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lizhenguang
 * @date: 2021/3/8 6:36 下午
 */
public class dateUtil {

    public static void main(String[] args) {
        try{
            Map<String, String> map = new HashMap<String, String>(4) {{
                put("sing", "sing");
                put("sing", "sing");
                put("sing", "sing");
            }};
      
            
            //保单复效时间计算
            Date toDay = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date policyEndDay = sdf.parse("2020-09-14" + " 00:00:00");
            int days = (int) ((toDay.getTime() - policyEndDay.getTime()) / (60 * 60 * 24 * 1000));
            days = (toDay.getTime() - policyEndDay.getTime()) % (60 * 60 * 24 * 1000) > 0 ? days + 1 : days;
            System.out.println(days);
        }catch(Exception e){

        }
    }
}
