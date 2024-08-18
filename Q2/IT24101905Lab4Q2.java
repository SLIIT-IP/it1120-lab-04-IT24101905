import java.util.Scanner;
           public class IT24101905Lab4Q2  {
                   public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the exam marks(out of 100):");
          double examMarks = scanner.nextDouble();
 
          System.out.print("Enter the lab marks (out of 100):");
          double labMarks = scanner.nextDouble();

          if (examMarks < 0||examMarks>100||labMarks < 0||labMarks>100) {
          System.out.println("Invalid marks.Both marks should be between 0 and 100.");

         return;
         }

         
         System.out.print("Enter the exam precentage:");
         double examPrecentage = scanner.nextDouble();

         System.out.print("Enter the lab precentage:");
         double labPrecentage = scanner.nextDouble();

         if (examPrecentage + labPrecentage !=100) {
         System.out.println("Invalid precentage. Total precentage should be 100.");

         return;
         }

         double finalMarks = (examMarks*examPrecentage + labMarks * labPrecentage)/100;
         System.out.println("Final marks:" + finalMarks);
          }


}

              
          
 