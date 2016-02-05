//Brendan Eckardt
//CSE2-HW2
//2.5.2016
//Arithmetic

//basic arithmetic on a shopping list 
public class Arithmetic {
    //main method 
    public static void main(String[] args) {
        //input variables
        int numPants=3; //number of pants 
        double pantsPrice=34.98; //cost per pair of pants
        int numShirts=2; //number of shirts
        double shirtsPrice=24.99; //cost per shirt
        int numBelts=1; //number of belts
        double beltPrice=33.99; //cost per belt
        double paSalesTax=0.06; //PA sales tax 
        
        //declare variables for outputs 
        double totalPantsCost=numPants*pantsPrice; //total cost of pants
        double totalBeltsCost=numBelts*beltPrice; //total cost of belts
        double totalShirtsCost=numShirts*shirtsPrice; //total cost of shirts
        double totalPantsTax=totalPantsCost*paSalesTax; //sales tax on pants purchased
        double totalBeltsTax=totalBeltsCost*paSalesTax; //sales tax on belts purchased
        double totalShirtsTax=totalShirtsCost*paSalesTax; //sales tax on shirts purchased
        
        //convert values to integers
        int totalPantsCost1= (int) totalPantsCost;
        int totalBeltsCost1= (int) totalBeltsCost;
        int totalShirtsCost1= (int) totalShirtsCost;
        int totalPantsTax1= (int) totalPantsTax;
        int totalBeltsTax1= (int) totalBeltsTax;
        int totalShirtsTax1= (int) totalShirtsTax;
        
        //divide values by 100.0 to get prices and 2 decimal places
        double totalPantsCost2 = totalPantsCost1/100.0;
        double totalBeltsCost2 = totalBeltsCost1/100.0;
        double totalShirtsCost2 = totalShirtsCost1/100.0;
        double totalPantsTax2 = totalPantsTax1/100.0;
        double totalBeltsTax2 = totalBeltsTax1/100.0;
        double totalShirtsTax2 = totalShirtsTax1/100.0; 
        
        //display the cost of each item and the total sales tax for each item 
        System.out.println("The total cost of pants before tax is "+ 
            totalPantsCost2 +" and the total sales tax for the pants is " 
            +totalPantsTax2);
        System.out.println("The total cost of shirts before tax is "+ 
            totalShirtsCost2 +" and the total sales tax for the shirts is " 
            +totalShirtsTax2);
        System.out.println("The total cost of belts before tax is "+ 
            totalBeltsCost2 +" and the total sales tax for the belts is " 
            +totalBeltsTax2);
            
        //declare variables for the total cost of all items before tax, the 
        //total sales tax, and the final cost
        double totalItemCost=(totalPantsCost+totalBeltsCost+totalShirtsCost)*100;
        double totalTax=(totalPantsTax+totalShirtsTax+totalBeltsTax)*100; 
        double finalCost=(totalItemCost+totalTax); 
        
        //convert values to integers
        int totalItemCost1= (int)totalItemCost;
        int totalTax1= (int)totalTax;
        int finalCost1= (int)finalCost;
        
        //convert integers to prices by dividing by 100.0
        double totalItemCost2 = totalItemCost1/100.0;
        double totalTax2 = totalTax1/100.0;
        double finalCost2= finalCost1/100.0;
        
        //display the total cost for all items before tax, the total sales tax, and the total cost
        System.out.println("The cost before tax of all items is "+ totalItemCost2); 
        System.out.println("The total sales tax on all items is "+ totalTax2);
        System.out.println("The final cost of all purchases is "+ finalCost2);
    }
}