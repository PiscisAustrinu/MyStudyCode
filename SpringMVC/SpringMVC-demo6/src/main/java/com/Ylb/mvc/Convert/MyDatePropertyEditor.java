package com.Ylb.mvc.Convert;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/15 9:26
 * Description:
 */
@Component
public class MyDatePropertyEditor extends PropertyEditorSupport implements PropertyEditorRegistrar {
    @Override
//    字符串转换为日期格式
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
//            字符串转换为日期
            date = format.parse(text);
        } catch (ParseException e) {
        }
//        设置属性值
        setValue(date);
    }

    /**
     * 在注册器中进行类型和属性编辑器的对应关系注册
     * @param propertyEditorRegistry
     */
    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(Date.class,this);
    }
}
