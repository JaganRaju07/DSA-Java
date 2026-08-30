/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method. */

import java.util.Scanner;
public class Even{
    public static boolean isEven(int num){
        return(num%2==0);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Is a Even Number: "+num);
        }else{
            System.out.println("Is a Odd Number: "+num);
        }
    }
    
}
