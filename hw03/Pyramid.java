// Brendan Eckardt
// CSE2 hw03-Pyramid 
// 2.12.2016

//asks user for dimensions of a square pyramid and returns volume of that pyramid 

import java.util.Scanner; //imports scanner class

public class Pyramid{ //declares class
    public static void main(String[] args) { //main method
        Scanner myScanner=new Scanner(System.in); //constructs instance of scanner
        
        //ask user for dimensions of square pyramid 
        System.out.print("What is the length of the base of the square pyramid (in the form xx)?: "); 
        double pyramidBase=myScanner.nextDouble(); //stores next number inputed as pyramid base length
        System.out.print("What is the height of the pyramid (in the form xx)?: ");
        double pyramidHeight=myScanner.nextDouble(); //stores next number inputed as pyramid height
            
        //calculate volume of square pyramid and print result
        double pyramidVolume=(pyramidBase*pyramidBase*pyramidHeight)/3; 
        System.out.print("The volume of the pyramid is "+pyramidVolume);
    }
}