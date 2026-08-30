/*Write a Java method to compute the sum of the digits in an integer. */

import java.util.*;
public class sumofdigits {
    public static int isSum(int num){
        int sum = 0;
        while(num>0){
            int digit = num %10;
            sum+=digit;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("The Sum is: "+isSum(num));
        
    }

}
