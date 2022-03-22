package com.Ylb.bean;

public class Convert {
    public String arr2Str(String[] arr){
        StringBuffer sb = new StringBuffer();
        if(arr!=null&&arr.length>0){
            for (String s:arr){
                sb.append(s);    //将字符串追加到StringBUffer中
                sb.append(",");
            }
            if (sb.length()>0){              //判断字符串长度是否有效
                sb = sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
