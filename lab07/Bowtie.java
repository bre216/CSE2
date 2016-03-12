// Brendan Eckardt
// lab07-Bowtie
// 3.11.2016

// program prints a bowtie based on input 

public class Bowtie{
    public static void main(String [] args){
        
        int nStars=9;
        int halfTie=nStars/2;
        
        for( int i=-halfTie; i<=halfTie; i++ ){
            for( int j=-halfTie; j<=halfTie; j++ ){
                if( i*i>=j*j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
    }
}