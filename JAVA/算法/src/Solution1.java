import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][4];
        for (int i = 0;i<3;i++)
        {
            for (int j = 0;j<4;j++)
                matrix[i][j] = input.nextInt();
        }
        int target = 6;
        int left = 0,right = matrix[0].length;
        int mid;
        int location = 9;
        int i;
        for (i = 0 ;i<3;i++)
        {
            if (target>=matrix[i][0]&&target<=matrix[i][right-1])
                location = i;
        }
        if (location==9)
            System.out.println("false!");
        else{
            while (left<=right)
            {
                mid = left+(right-left)/2;
                if(target==matrix[location][mid])
                    System.out.println("ture");
                else if(target>matrix[location][mid])
                    left = mid +1;
                else
                    right = mid - 1;
            }
        }

    }
}
