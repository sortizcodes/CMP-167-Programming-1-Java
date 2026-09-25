//HW 4-1 Hints & Class notes
//(Region) and (CX Type) are the inputs that determine the output (Price)

//INPUT: (The region number), (The customer type) & Your prompts to the user must be: (Enter the region number:) , (Enter hunter or magician:)

// "Your prompts to the user" - we're getting INPUT from user (Scanner)
// We're given prompts - (Enter the region number:) , (Enter hunter or magician:)
// 2 Inputs for the program
// Program didn't give us the names of the variables for the inputs but we can create our own, hoewever we have hints
//Program didn't give us the data type of the inputs, however we have hints (eg. Double, Float)
//HINTS: In the OUTPUT & PROCESS part of specs 


/**
 @author: Samantha
 @date: 09/24/26 8:36PM 
 @version: 1.0
 @description: This program represents a train station.
 In which you provide the region and customer type to
 find out how much the fare is to use the system. 
 */
 

import java.util.Scanner; // I am using this for user input (Scanner)

public class NarniaTransit {
    public static void main(String[] args) {

//===========================INPUT================================//

    Scanner input = new Scanner(System.in); //Used for getting input from the user

    System.out.println("Enter region number: "); //Prompt for region number
    int regionNumber = input.nextInt(); //Get the region from the user

    System.out.println("Enter hunter or magician: "); //Prompt for customer type (hunter or magician)
    String customerType = input.next(); //Get the customer type from the user 

//===============================================================//

//PROCESS: 
// This procress does not need any calculations
// We need (control flow) in this process (if/else)
//Two inputs which control the flow of the (price)
//We need a new variable called price to be introduced in the process stage


//===========================PROCESS================================//
    //How can we set the price: 
    // (4 if statements because their are 4 bulletpoints, which will set the price)
    // 1. if (2 or smaller, hunter, price = 13.0)
    // 2. if (2 or smaller, magician, price = 16.5)


    double price = 0.0;

    if(regionNumber <= 2 && customerType.equals("Hunter")) {
 
        price = 13.0;
    } //end IF
    else{

    if(regionNumber <= 2 && customerType.equals("Magician")) {
 
        price = 16.5;
    } //end if
    else{

     if(regionNumber == 3 && customerType.equals("Hunter")) {
 
        price = 31.5;

    } //end if
    else{

    if(regionNumber > 3 && regionNumber <= 4 && customerType.equals("Magician")) {
 
        price = 22.0;


    }//end if

}

    }

    
    }
}
}




 //HW 4-2 Hints & Class notes

 //age >= 16
 //temp < 32
 //score < 60
 //speed > 65
//money == 0
//age > 12 && age <= 19 (you are a teenager (over 12 and 19 or younger)
