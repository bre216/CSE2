// Brendan Eckardt 
// CSE2 
// 2.5.2016
//Cyclometer 
//cyclometer program to print out distance and time for bike trips
public class Cyclometer {
        // main method required for every Java program
        public static void main(String[] args) {
           //input data from bike trips
            double secsTrip1=480;  // # seconds for trip1
            double secsTrip2=3220;  // # seconds for trip2
            double countsTrip1=1561;  // # wheel rotations for trip1
            double countsTrip2=9037; // # wheel rotations for trip2
            // other variables and output data
            double wheelDiameter=27.0;  // wheel diameter in inches
            double PI=3.14159; // Pi
            double feetPerMile=5280;  // # feet per mile
            double inchesPerFoot=12;   // # inches per foot
            double secondsPerMinute=60;  // # seconds per minute
            double distanceTrip1, distanceTrip2,totalDistance;  // declares 
                //variables for distance of each trip and total distance
            //
            //print input values for time and counts 
            System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
            System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
            //
            // compute distances for each trip
            // Below gives distance in miles
            //(for each count, a rotation of the wheel travels
            //the diameter in inches times PI)
            distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
            //
            // print output data
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
     }  //end of main method   
} //end of class
