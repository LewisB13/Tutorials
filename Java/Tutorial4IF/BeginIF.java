import java.util.Scanner;

public class BeginIF{
   public static void main(String[]args){
   //scanner
      Scanner keyin = new Scanner(System.in);
   
      System.out.println("What age are you?");
      int age = keyin.nextInt();
   //if over 18 person is a adult
      if (age > 18){
         System.out.println("WELCOME" );
      }  
   //underage check 
      if (age < 18){
         System.out.println("SORRY YOU ARE TOO YOUNG TO ENTER");
      }  
   //equals to  
      if (age == 18){//equals
         System.out.println("PLEASE SHOW YOUR ID Y/N");
      
         keyin.nextLine(); // clears leftover newline
      
         char checkedID = keyin.nextLine().charAt(0);
      
         if (checkedID == 'Y' || checkedID =='y'){
            System.out.println("THANK YOU YOU MAY ENTER");
         }
      
         if (checkedID =='N' || checkedID == 'n'){
            System.out.println("ENTRY DENIED PLEASE RETURN WITH ID");
         
         } 
      }//equals
 
 
  System.out.println("WHAT IS YOUR FAV GAME? ");
  keyin.nextLine(); // clears leftover newline

   String game = keyin.nextLine();
   
   
   
   if(game.equals("Minecraft")){
      System.out.println("very good choice Steve");
   }
  
   
   keyion.close();
   
   }

}