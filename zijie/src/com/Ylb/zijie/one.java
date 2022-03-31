package com.Ylb.zijie;

import java.util.*;

/**
 * Author：Yang Lingbo
 * Date:2022/3/29 20:52
 * Description:
 */
public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<String> result = new ArrayList<>();
        for (int i = 0;i<N;i++){
            StringBuilder builder = new StringBuilder();
            String src = input.next();
            for (int j = 0;j<src.length();j++){
                int len = builder.length();
                if (len>1&&src.charAt(j)==builder.charAt(len-1)){
//                    1、倒数第一个和倒数第二个相同（符合aaa)
//                    2、倒数第二个和倒数第三个相同（符合aabb)
                    if ((builder.charAt(len-1)==builder.charAt(len-2))||(len>2&&builder.charAt(len-2)==builder.charAt(len-3))){
                        continue;
                    }
                }
                builder.append(src.charAt(j));
            }
            result.add(builder.toString());
        }
        result.forEach(System.out::println);
        input.close();
    }
}
