package com.Ylb.mvc.Convert;

import com.Ylb.mvc.Bean.User;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/15 19:23
 * Description:
 */
public class MyUserConvert implements Converter<String, User> {
    @Override
    public User convert(String s) {
        String[] strArray = s.split(",");  //","分隔字符串进行解析
        User user = new User();
        user.setName(strArray[0]);
//        日期格式转换器
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date birthday = null;
        try {
            birthday = format.parse(strArray[1]);    //字符串转换为日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthday(birthday);
        return user;
    }
}
