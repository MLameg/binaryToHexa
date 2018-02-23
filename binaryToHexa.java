//********************************************************
// Name: Monti Lameg                Homework 1: Prob. 3
//
// Converts binary number to hexadecimal number
//********************************************************
import java.util.Scanner;

class BinaryToHexa 
{
   public static void main(String args[])
   {
      // Scanner that stores user input into a string
      Scanner scan = new Scanner( System.in );
      System.out.print("Please enter a binary number: ");
      String binary = scan.nextLine();
       
      // Converts string to binary Int, Int to Hex number
      int value = Integer.parseInt(binary,2);
      String hexa = Integer.toHexString(value);
      
      // Prints values 
      System.out.println(binary + " is equal to a hexadecimal value of: " + hexa);
      
      // Converts Hex number to binary Int, Int to string
      int back = Integer.parseInt(hexa, 16);
      String binback = Integer.toBinaryString(back);
      
      // Prints values
      System.out.println(hexa + " is converted back to the Binary value of: " + binback);
      
    }
}