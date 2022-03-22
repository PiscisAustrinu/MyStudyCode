package com.Ylb.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateBean {
    private String dateTime;
    private String week;

    private Calendar calendar = Calendar.getInstance();

    /**
     * 获取当前日期和时间
     * @return 返回当前日期和时间
     */
    public String getDataTime(){
        //获取当前时间
        Date currDate = Calendar.getInstance().getTime();
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        //格式化日期时间
        dateTime = sdf.format(currDate);
        return dateTime;
    }

    /**
     * 获取星期几
     * @return 返回星期几字符串
     */
    public String getWeek(){
        String[] weeks = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        //获取一个星期的第几天
        int index = calendar.get(Calendar.DAY_OF_WEEK);
        //获取星期几
        week = weeks[index-1];
        return week;
    }
}
