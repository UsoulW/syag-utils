package cn.syag.utils;

import java.time.Clock;

/**
 * @Author : syag
 * @Date 2022/6/15
 * @note :
 */
public class DateUtils {

    public static long now(){
        return Clock.systemUTC().millis();
    }

}
