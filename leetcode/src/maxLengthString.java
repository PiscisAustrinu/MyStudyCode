import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class maxLengthString {
    public int lengthOfLongestSubstring(String s){
//        哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
//        右指针,初始值为-1,相当于字符串的左边界的左侧
        int rk = -1,ans = 0;
        for (int i = 0;i<n;++i){
            if (i!=0){
//                左指针向右移动一格,移出一个字符
                occ.remove(s.charAt(i-1));
            }
            while (rk+1<n&&!occ.contains(s.charAt(rk+1))){
//                不断移动右指针
                occ.add(s.charAt(rk+1));
                ++rk;
            }
//            第i到rk个字符是一个极长的无重复字符串
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        maxLengthString maxLengthString = new maxLengthString();
        int i = maxLengthString.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
