import java.util.Scanner;

public class IT24101905Lab4Q1  {
     public static void main (String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter a number:");
       
       double number = scanner.nextDouble();

       if (number>0){
          System.out.print("The number is positive.");

       }else if (number<0){
           System.out.print("The number is Negative.");

       }else {
           System.out.print("The number is Zeo.");

       }

        scanner.close();
       }

 }
       
       

       