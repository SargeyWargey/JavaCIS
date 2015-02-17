
package paperrockscissors;
import java.util.Scanner;
public class PaperRockScissors {


    public static void main(String[] args) {
        
        int computerNumber = (int) (Math.random() * 3);
            System.out.println(computerNumber);
            
     Scanner input = new Scanner(System.in);
          
            // Obtain Name	
            System.out.println("Enter choice: Scissors = 0, Rock = 1, Paper = 2");
               int userInput = input.nextInt();        
   
    switch (computerNumber) {
    	case 0:
            //If a user enters a “0”, then print “The computer is scissor. You are scissor too. It is a draw”
            if (userInput == 0) {
		System.out.println("The computer is scissors. You are scissors too. It is a draw.");
            }            
            //If a user enters a “1”, then print: "The computer is scissor. You are rock. You won"
            else if (userInput == 1) {
		System.out.println("The computer is scissors. You are rock. You Won.");
            }        
            //If a user enters a “2”, then print: "The computer is scissor. You are paper. You lost"
            else if (userInput == 2) {
		System.out.println("The computer is scissors. You are paper. You Lost.");
            } 
            else
            System.out.println("User input NOT recognized. Enter choice: Scissors = 0, Rock = 1, Paper = 2");  
            break;
            
        case 1:
            if (userInput == 0) {
		System.out.println("The computer is Rock. You are Scissors. You lost.");
            }
            else if (userInput == 1) {
		System.out.println("The computer is Rock. You are Rock. You Tied.");
            } 
            else if (userInput == 2) {
		System.out.println("The computer is Rock. You are paper. You Won.");
            } 
            else
            System.out.println("User input NOT recognized. Enter choice: Scissors = 0, Rock = 1, Paper = 2");     
            break;    
            
        case 2:
            if (userInput == 0) {
		System.out.println("The computer is Paper. You are Scissors. You Won.");
            }
            else if (userInput == 1) {
		System.out.println("The computer is Paper. You are Rock too. You Lost.");
            }        
            else if (userInput == 2) {
		System.out.println("The computer is Paper. You are paper. You Tied.");
            } 
            else
            System.out.println("User input NOT recognized. Enter choice: Scissors = 0, Rock = 1, Paper = 2");  
            break;
        }
    
    }
    
}
