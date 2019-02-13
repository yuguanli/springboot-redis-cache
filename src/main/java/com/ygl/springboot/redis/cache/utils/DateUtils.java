package com.ygl.springboot.redis.cache.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 获取某天的结束时间
     */
    public static long endOfDay() {
        final Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return ((calendar.getTime().getTime()- System.currentTimeMillis()) / 1000) + 10;
    }

}
