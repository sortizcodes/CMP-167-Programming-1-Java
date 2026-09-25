import java.util.Scanner; // This will be used for user input (keyboard)

// Name of the class this program converts change from a user (keyboard)
public class ChangeConverter{ 

// We write our code inside the main, this is used to run the program
public static void main(String[] args){ 

//=============================== INPUT START =========================//This is the area for input code

Scanner input = new Scanner(System.in); //This is the variable for the keyboard 

System.out.println("Enter the number of quarters:"); //Prompt
int quarters = input.nextInt(); //variable which holds value of quarters


System.out.println("Enter the number of dimes:"); //Prompt
int dimes = input.nextInt(); //variable which holds value of dimes


System.out.println("Enter the number of nickels:"); //Prompt
int nickels = input.nextInt(); //variable which holds value of nickels


System.out.println("Enter the number of pennies:"); //Prompt
int pennies = input.nextInt(); //variable which holds value of pennies

 //=============================== INPUT END ===============================//

 //=============================== PROCESS START ===========================// This is the area where the calculations go e.g multiplication, addition, subtraction, division, etc.)

int totalCents = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1); //Converts all the coins to pennies 


int dollars = totalCents/100; // Used division to get all of the dollars from the total cents  
int cents = totalCents%100; // Used remainder division to get the remaining cents from removing the total dollars

 //=============================== PROCESS END ============================//

 //=============================== OUTPUT START ============================//

// Using printf I am able to convert the coins into the dollar and cents amount 
System.out.printf("the total in dollars is %d,%02d%n", dollars, cents); 



//=============================== OUTPUT END ============================//
       





    } // End main
} // End class 
