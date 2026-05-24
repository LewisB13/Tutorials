import java.util.Scanner;

public class ScannerTut{
   public static void main(String[]args){
   
   //create scanner obj
   Scanner keyin = new Scanner(System.in);
   
   //string example
   System.out.println("Hello what is your name?");
   String name = keyin.nextLine();
   System.out.println("HELLO " + name  + " what age are you? ");
  
   //int example
   int age = keyin.nextInt();
   System.out.println ("you are " + age + " years old");
   
   //double example decimal
   System.out.println("How tall are you in M ? ");
   double height = keyin.nextDouble();
   System.out.println("you are " + height + " meters tall");
   
   keyin.nextLine(); // forgot this

   //char example
   System.out.println(" Hey what did you get in the last test A B C D E F");
   char grade = keyin.nextLine().charAt(0);
   System.out.println("Wow your last grade was " + grade + " how cool");
   
   //close scanner
   keyin.close();
   
   }}