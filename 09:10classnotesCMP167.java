/** 
@author: Samantha 
@date: 09/10/2026
@version: 1.0
@description: The following program is showing how to do computations in java.
@resources: Add in any links to ai chats you used or code from others you borrowed to give credit and cite. 

*/


import java.util.Scanner; 

public class Arthmetic_Operations{

    public static void main(){

   //==================== INPUT ===================//
     Scanner input = new Scanner(System.in);
     System.out.println("Enter number 1"); //Prompt 
     float  number_one = input.nextFloat();  // First Input

     Scanner input = new Scanner(System.in);
     System.out.println("Enter number 2"); //Prompt 
     float  number_two = input.nextFloat();  // Second Input

     Scanner input = new Scanner(System.in);
     System.out.println("Enter number 3"); //Prompt 
     float  number_three = input.nextFloat();  // Third Input






     float  number_two = 4.0;  // First Input
     float  number_two = 5.0;  // Second Input
     float  number_three = -10.0;  // Third Input
   //==============================================//

   
   //==================== PROCESS =================//

     float sum = number_one + number_two;
     float difference = number_two - number_three;
     float product = number_two * number_three;
     float quotient = number_three / number_two;


   //=============================================//

   //==================== OUTPUT =================//

    System.out.println(number_one number_two "This is the sum" + sum); 

    System.out.println("The sum of " + number_one + " and " + number_two " is " + sum);  

    

     System.out.println("The sum of 5.0 and 4.0 is: " + sum);
     System.out.println("The difference of 4.0 and -10.0 is: " + difference);
     System.out.println("The product of 4.0 and -10.0 is: " + product);
     System.out.println("The quotient of -10.0 and 4.0 is: " + quotient);
 
	}


   //============================================//     

        
    
} 

import java.util.Scanner; 

public class Area{

    public static void main(String[] args){

   
     Scanner input = new Scanner(System.in);

       System.out.println("Enter the length of the rectangle: "); //Prompt
       double length = input.nextDouble();

       System.out.println("Enter the width of the rectangle: "); //Prompt
       double width = input.nextDouble();

    
       double area = length * width;

       System.out.println("The area of the rectangle is: " + area);



    }

}



