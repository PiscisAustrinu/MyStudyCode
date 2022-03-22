import java.util.Scanner;

public class Integer {
    public static void main(String[] args)
    {
        Scanner input  =new Scanner(System.in);
        String S = input.nextLine();
        int a = S.compareTo("127");

        int b = S.compareToIgnoreCase("127");
        System.out.println(a+' '+b);
    }
}
