// Brendan Eckardt
// CSE2 hw04
// 2.22.2016

//decimal to hexadecimal converter

import java.util.Scanner; //imports scanner class

public class ToHex{ //declares class  
    public static void main(String[] args){ //main method for program
        Scanner myScanner=new Scanner(System.in); //constructs instance of scanner 
        
        //ask user to input three integer values from 0-255 corresponding to RGB pixel colors 
        System.out.print("Please enter three numbers representing RGB values:");
        
        if( myScanner.hasNextInt() ){
            int redValue=myScanner.nextInt(); //assigns first integer as the red value
            if( myScanner.hasNextInt() ){
                int greenValue=myScanner.nextInt(); //assigns first integer as the green value
                if( myScanner.hasNextInt() ){
                    int blueValue=myScanner.nextInt(); //assigns first integer as the blue value
                
        
                        String hexdec1=""; //declares string variable for 1st hexadecimal digit
                        String hexdec2=""; //declares string variable for 2nd hexadecimal digit
                        String hexdec3=""; //declares string variable for 3rd hexadecimal digit
                        String hexdec4=""; //declares string variable for 4th hexadecimal digit
                        String hexdec5=""; //declares string variable for 5th hexadecimal digit
                        String hexdec6=""; //declares string variable for 6th hexadecimal digit
        
                        if( redValue<=255 && redValue>=0 ){ //checks to see if the first value is between 0-255
                            if( greenValue<=255 && greenValue>=0 ){ //checks to see if the second value is between 0-255
                                if( blueValue<=255 && blueValue>=0 ){ //checks to see if the third value is between 0-255
                    
                                    int redDivided=redValue/16; //divides input for red by 16 and saves the answer as an integer value
                                    int redRemainder=redValue%16; //divides the input for red by 16 and saves the remainder as an integer value 
                                    int greenDivided=greenValue/16; //divides input for green by 16 and saves the answer as an integer value 
                                    int greenRemainder=greenValue%16; //divides the input for green by 16 and saves the remainder as an integer value 
                                    int blueDivided=blueValue/16; //divides input for blue by 16 and saves the answer as an integer value
                                    int blueRemainder=blueValue%16; //divides the input for blue by 16 and saves the remainder as an integer value 
                    
                                    //convert first red digit to hexadecimal 
                                    if( redDivided<10 ){ 
                                        hexdec1=""+redDivided; //if red input is divisible by 16 less than 10 times, assigns first hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( redDivided ){ //if red input is divisible by 16 more than 10 times, assigns first hexadecimal digit to a letter based on the integer number of divisions
                                            case 10:
                                                hexdec1="A";
                                                break;
                                            case 11:
                                                hexdec1="B";
                                                break;
                                            case 12:
                                                hexdec1="C";
                                                break;
                                            case 13:
                                                hexdec1="D";
                                                break;
                                            case 14:
                                                hexdec1="E";
                                                break;
                                            case 15:
                                                hexdec1="F";
                                                break;
                                        }
                                    }
                                    
                                    //convert second red digit to hexadecimal 
                                    if( redRemainder<10 ){
                                        hexdec2=""+redRemainder; //if remainder after dividing red input by 16 is less than 10, assigns first hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( redRemainder ){ //if remainder after dividing red input by 16 is more than 10, assigns first hexadecimal digit to a letter based on remainder
                                            case 10:
                                                hexdec2="A";
                                                break;
                                            case 11:
                                                hexdec2="B";
                                                break;
                                            case 12:
                                                hexdec2="C";
                                                break;
                                            case 13:
                                                hexdec2="D";
                                                break;
                                            case 14:
                                                hexdec2="E";
                                                break;
                                            case 15:
                                                hexdec2="F";
                                                break;
                                        }
                                    }
                                    
                                    //convert first green digit to hexadecimal 
                                    if( greenDivided<10 ){
                                        hexdec3=""+greenDivided; //if green input is divisible by 16 less than 10 times, assigns third hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( greenDivided ){ //if green input is divisible by 16 more than 10 times, assigns third hexadecimal digit to a letter based on the integer number of divisions
                                            case 10:
                                                hexdec3="A";
                                                break;
                                            case 11:
                                                hexdec3="B";
                                                break;
                                            case 12:
                                                hexdec3="C";
                                                break;
                                            case 13:
                                                hexdec3="D";
                                                break;
                                            case 14:
                                                hexdec3="E";
                                                break;
                                            case 15:
                                                hexdec3="F";
                                                break;
                                        }
                                    }
                                    
                                    //convert second green digit to hexadecimal 
                                    if( greenRemainder<10 ){
                                        hexdec4=""+greenRemainder; //if remainder after dividing green input by 16 is less than 10, assigns fourth hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( greenRemainder ){ //if remainder after dividing green input by 16 is more than 10, assigns fourth hexadecimal digit to a letter based on remainder
                                            case 10:
                                                hexdec4="A";
                                                break;
                                            case 11:
                                                hexdec4="B";
                                                break;
                                            case 12:
                                                hexdec4="C";
                                                break;
                                            case 13:
                                                hexdec4="D";
                                                break;
                                            case 14:
                                                hexdec4="E";
                                                break;
                                            case 15:
                                                hexdec4="F";
                                                break;
                                        }
                                    }
                                    
                                    //convert first blue digit to hexadecimal 
                                    if( blueDivided<10 ){
                                        hexdec5=""+blueDivided; //if blue input is divisible by 16 less than 10 times, assigns fifth hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( blueDivided ){ //if blue input is divisible by 16 more than 10 times, assigns fifth hexadecimal digit to a letter based on the integer number of divisions
                                            case 10:
                                                hexdec5="A";
                                                break;
                                            case 11:
                                                hexdec5="B";
                                                break;
                                            case 12:
                                                hexdec5="C";
                                                break;
                                            case 13:
                                                hexdec5="D";
                                                break;
                                            case 14:
                                                hexdec5="E";
                                                break;
                                            case 15:
                                                hexdec5="F";
                                                break;
                                        }
                                    }
                                    
                                    //convert second blue digit to hexadecimal 
                                    if( blueRemainder<10 ){
                                        hexdec6=""+blueRemainder; //if remainder after dividing blue input by 16 is less than 10, assigns sixth hexadecimal digit to the integer number of divisions
                                    }
                                    else{
                                        switch( blueRemainder ){ //if remainder after dividing red input by 16 is more than 10, assigns sixth hexadecimal digit to a letter based on remainder
                                            case 10:
                                                hexdec6="A";
                                                break;
                                            case 11:
                                                hexdec6="B";
                                                break;
                                            case 12:
                                                hexdec6="C";
                                                break;
                                            case 13:
                                                hexdec6="D";
                                                break;
                                            case 14:
                                                hexdec6="E";
                                                break;
                                            case 15:
                                                hexdec6="F";
                                                break;
                                        }
                                    }
                                    String hexdec=""+hexdec1+hexdec2+hexdec3+hexdec4+hexdec5+hexdec6; //declares string variable for combined hexadecimal 
                                    System.out.print("The decimal numbers R:"+redValue+", G:"+greenValue+", B:"+blueValue+", is represented in hexadecimal as:"+hexdec); //prints output
                                }
                                else{
                                    System.out.print("Sorry, you must enter values between 0-255."); //tells user to input values within acceptable range
                                }
                            }
                            else{
                                System.out.print("Sorry, you must enter values between 0-255."); //tells user to input values within acceptable range
                            }
                        }
                        else{
                            System.out.print("Sorry, you must enter values between 0-255."); //tells user to input values within acceptable range
                        }
                }
                else{
                    System.out.println("Sorry, you must enter integer values.");
                    System.exit(0);
                }
            }
            else{
                System.out.println("Sorry, you must enter integer values.");
                System.exit(0);
            }
        }
        else{
            System.out.println("Sorry, you must enter integer values.");
            System.exit(0);
        }
    }
}
