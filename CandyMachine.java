package DanmarkCandyMachine;

import java.util.Scanner;
public class CandyMachine {

  public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  System.out.print("Welcome to Candy Machine!!!");
  scan.next();
  
 
  //String CandyMachine[] = {"candy", "chips", "gum", "cookies"};
  //String Price[] = {"2", "5", "3", "10"};
  
  System.out.println("CandyMachine items!");
  
  System.out.println("candy");
  System.out.println("chips");
  System.out.println("gum");
  System.out.println("cookies");
  
  
  System.out.println("What do you want to buy");
   String name = scan.next();
  

  System.out.println("How many?");
  scan.next();
  
 
  System.out.println("Pay your bill");
   scan.next();
  
  
  
}

}
