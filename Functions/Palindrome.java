/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
@-- A number is called a palindrome if the number is equal to the reverse of a number */

import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        while(num!=0){
            int digit = num %10;
            reversed= reversed*10+digit;
            num = num/10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num+"Is a Palindrome");
        }else{
            System.out.println(num+"Is not a Palindrome");
        }
        sc.close();
    }
    
}
