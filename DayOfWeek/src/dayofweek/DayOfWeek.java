package dayofweek;

import java.util.Scanner;


public class DayOfWeek {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                
            System.out.println("Enter Year"); 
        	double year = input.nextDouble();
                
            System.out.println("Enter Month"); 
        	double m = input.nextDouble();    

            System.out.println("Enter Day Of Month"); 
        	double q = input.nextDouble(); 
                
            double j = (year/100);
            double k = (year * .07);
                
                Double dayOfWeek = (((q + ((26*(m+1))/10)) + k + ((k/4)+(j/4)) + (5*j)) * .07 );
        
    System.out.println("Day of the week is" + dayOfWeek);
    
    
    
    }   
}
