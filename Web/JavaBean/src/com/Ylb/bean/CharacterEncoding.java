package com.Ylb.bean;

import java.io.UnsupportedEncodingException;

public class CharacterEncoding {
    public CharacterEncoding(){
    }
    public String toString(String tr){
        String text = "";
        if(tr!=null&&!"".equals(tr)){
            try {
                text = new String(tr.getBytes("ISO-8859-1"),"UTF-8");
            }catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
        }
        return text;
    }
}
