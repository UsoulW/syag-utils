package cn.syag.utils;

/**
 * @Author : syag
 * @Date 2022/7/5
 * @note :
 */
public class StrUtils {
    public static boolean isBank(String content){
        if (content==null){
            return true;
        }
        for (char c : content.toCharArray()) {
            if (c!=' '){
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBank(String content){
        return !isBank(content);
    }
}
