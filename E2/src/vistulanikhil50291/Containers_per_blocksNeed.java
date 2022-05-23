package vistulanikhil50291;

public class Containers_per_blocksNeed {
    public static void main (String[] args) {

        // odd number of legos we have

        int amountOfbricks = 77;
        // Even number of legos that fit in 1 container
        int containerCapacity = 6;

        // calculation of containers not full
        int Unfilled = amountOfbricks % containerCapacity;
        System.out.println("The number of unfilled containers is: " + Unfilled);

        // Calculation of filled full
        int full = amountOfbricks / containerCapacity;
        System.out.printf("The number of containers full is " + full);

        // Amount of containers in general
        int totalC = full + Unfilled;
        System.out.println("total number of containers is " + totalC);

    }
}
