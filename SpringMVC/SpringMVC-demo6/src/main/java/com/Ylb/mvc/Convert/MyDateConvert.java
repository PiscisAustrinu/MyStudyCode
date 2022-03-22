package com.Ylb.mvc.Convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/16 8:59
 * Description:
 */
@Component
public class MyDateConvert implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
//        日期格式化转换器
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}
