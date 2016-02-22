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
        int redValue=myScanner.nextInt(); //assigns first integer as the red value 
        int greenValue=myScanner.nextInt(); //assigns second integer as green value
        int blueValue=myScanner.nextInt(); //assigns third integer as blue value
        
        if( redValue<=255 && redValue>=0 ){ //checks to see if the first value is between 0-255
            if( greenValue<=255 && greenValue>=0 ){ //checks to see if the second value is between 0-255
                if( blueValue<=255 && blueValue>=0 ){ //checks to see if the third value is between 0-255
                    
                    String hexdec=""; 
                    int redDivided=redValue/16; 
                    int redRemainder=redValue%16;
                    int greenDivided=greenValue/16; 
                    int greenRemainder=greenValue%16;
                    int blueDivided=blueValue/16; 
                    int blueRemainder=blueValue%16;
                    
                    int red1=0;
                    
                    if( redDivided<10 ){
                        red1=redDivided;
                        System.out.print(""+red1+redRemainder+greenDivided+greenRemainder+blueDivided+blueRemainder);
                    }
                    else{
                        char red1='z';
                        switch( redDivided ){
                            case 10:
                                red1='A';
                                break;
                            case 11:
                                red1='B';
                                break;
                            case 12:
                                red1='C';
                                break;
                            case 13:
                                red1='D';
                                break;
                            case 14:
                                red1='E';
                                break;
                            case 15:
                                red1='F';
                                break;
                        }
                        System.out.print(""+red1+redRemainder+greenDivided+greenRemainder+blueDivided+blueRemainder);
                    }
                    
                    if( redRemainder<10 ){
                        int red2=redRemainder;
                        System.out.print(""+red1+red2+greenDivided+greenRemainder+blueDivided+blueRemainder);
                    }
                    else{
                        char red2='z';
                        switch( redRemainder ){
                            case 10:
                                red2='A';
                                break;
                            case 11:
                                red2='B';
                                break;
                            case 12:
                                red2='C';
                                break;
                            case 13:
                                red2='D';
                                break;
                            case 14:
                                red2='E';
                                break;
                            case 15:
                                red2='F';
                                break;
                        }
                        System.out.print(""+red1+red2+greenDivided+greenRemainder+blueDivided+blueRemainder);
                    }
                }
                else{
                    System.out.print("The input values must be integers between 0-255."); //tells user to input values within acceptable range
                }
            }
            else{
                System.out.print("The input values must be integers between 0-255."); //tells user to input values within acceptable range
            }
        }
        else{
            System.out.print("The input values must be integers between 0-255."); //tells user to input values within acceptable range
        }
    }
}
