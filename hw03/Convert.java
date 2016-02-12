// Brendan Eckardt
// CSE2 hw03
// 2.12.2016

// program to convert distance inputed in meters to inches 

import java.util.Scanner; //imports scanner class
public class Convert{ //declares class
    public static void main(String[] args) { //main method
        Scanner myScanner=new Scanner(System.in); //constructs instance of scanner 
        
        //ask the user for the distance in meters
        System.out.print("Enter the measurement in meters in the form xx.xx: ");
        
        // use the scanner to take the next number inputed and store as a variable 
        double distanceMeters=myScanner.nextDouble(); 
        
        //convert distance in meters to distance in inches using 1m=39.3701 in
        double distanceInches=distanceMeters*39.701; 
        //print out the results for the user 
        System.out.print(distanceMeters+" meters is "+distanceInches+"inches.");
    }
}