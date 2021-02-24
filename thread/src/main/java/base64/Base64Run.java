package base64;

import org.apache.commons.lang3.StringUtils;

import java.util.Base64;

/**
 * @author: lizhenguang
 * @date: 2021/2/10 9:08 上午
 */
public class Base64Run {

    //private static transient Logger logger = LoggerFactory.getLogger(Base64Run.class);

    public static void main(String[] args) {
int value = 12;

        System.out.println("格式话："+String.format("%012d", value));
        //一般的base64加密
        String encode = encode("知耻而后勇");
        System.err.println(encode + "加密的结果为：" + decode(encode));
        //url情况下的加解密- 转换+、/ 为 -、_
        String urlEncode = urlEncode("https://baidu.com:80/index.html?name=信息&age=9&sex=2");
        System.err.println(urlDecode(urlEncode));
    }

    /**
     * base64加密-索引查表的编码方式
     *
     * @param source
     * @return
     */
    public static String encode(String source) {
        String encode = "";
        if (StringUtils.isNoneBlank(source)) {
            encode = Base64.getEncoder().encodeToString(source.getBytes());
        }
        System.err.println(source + "base加密的结果：" + encode);
        return encode;
    }

    /**
     * base64解密-一般的字符串
     *
     * @param decode
     * @return
     */
    public static String decode(String decode) {
        return StringUtils.isNoneBlank(decode) ? new String(Base64.getDecoder().decode(decode)) : "";
    }

    /**
     * url-base64加密
     *
     * @return
     */
    public static String urlEncode(String urlSource) {
        String urlEncode = "";
        if (StringUtils.isNoneBlank(urlSource)) {
            urlEncode = Base64.getUrlEncoder().encodeToString(urlSource.getBytes());
        }
        System.err.println(urlSource + "base64加密后的结果：" + urlEncode);
        return urlEncode;
    }

    /**
     * url-base64解密
     *
     * @param urlDecode
     * @return
     */
    public static String urlDecode(String urlDecode) {
        return new String(Base64.getUrlDecoder().decode(urlDecode));
    }
}
