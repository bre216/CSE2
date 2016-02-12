// Brendan Eckardt
// CSE2-Lab03
// 2.12.2016

// Dinner check program

import java.util.Scanner; //import scanner class

public class Check{
    public static void main (String[] args){
        Scanner myScanner= new Scanner( System.in); //declare instance and call scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //ask user for cost of check
        double checkCost = myScanner.nextDouble(); //takes next double inputed by user and stores as cost of check
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); // asks user for tip percentage
        double tipPercent = myScanner.nextDouble(); //takes next double inputed by user and stores as tip percentage
        tipPercent /=100; //converts tip percentage to decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //asks user for number of dinner guests
        int numPeople = myScanner.nextInt(); //takes next integer inputed by user and stores as number of people 
        
        //calculate total check cost and cost per person
        double totalCost = checkCost * (1+tipPercent); //total cost of the check 
        double costPerPerson=totalCost/numPeople; //cost per person
        int dollars = (int) costPerPerson; //whole dollar amount per person
        int dimes = (int) (costPerPerson*10)%10; //1st decimal place for amount per person
        int pennies = (int) (costPerPerson*100)%10; //2nd decimal place for amount per person
        
        //print out results
        System.out.print("Each person in the group owes $"+dollars +"." +dimes+pennies); //prints out the cost per person in the traditional price format 
    }
}