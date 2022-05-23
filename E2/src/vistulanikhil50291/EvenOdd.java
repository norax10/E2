package vistulanikhil50291;

public class EvenOdd {
    public static void main(String[] args) {

        // Generating a random number between 1 and 105
        int randomNumber = (int) (Math.random() * (100-1));

        //Checking if it is even or odd
        if(randomNumber%2==0) {
            System.out.println(randomNumber + " is an even number.");
        } else{
            System.out.println(randomNumber + " is an odd number.");
        }
    }
}