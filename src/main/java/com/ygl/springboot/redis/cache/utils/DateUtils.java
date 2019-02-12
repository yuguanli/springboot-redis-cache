package com.ygl.springboot.redis.cache.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 获取某天的结束时间
     *
     * @param date 日期
     */
    public static long endOfDay(Date date) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime().getTime();
    }

}
