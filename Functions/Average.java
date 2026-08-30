// Write a Java method to compute the average of three numbers..


import java.util.Scanner;
public class Average{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        double x = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double y = sc.nextDouble();
        System.out.print("Enter Third Number: ");
        double z = sc.nextDouble();

        System.out.println("The Average of 3 Numbers: "+Avg(x,y,z)+"\n");
    }
    public static double Avg(double x,double y,double z){
        return (x+y+z)/3;
    }
}