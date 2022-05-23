package vistulanikhil50291;

public class MarsWeightCalc {
    public static void main (String[] args) {
        //------------------task 2: How much do you weight on Mars?------------------------------
        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightIntInt;

        earthWeight = 66;
        marsWeight = (earthWeight * 0.38F);
        System.out.println(earthWeight + " kg on Earth is " + marsWeight + " kg on Mars");

        // assignment (compatible types) from float to double
        marsWeightInDouble = marsWeight;
        System.out.println(" Kilograms on Mars after converting to double "+ marsWeightInDouble);

        // printing a variable limiting the length of printing to 4 decimal places.
        System.out.printf(" Kilograms on Mars displayed to 4 decimal places: %.4f %n", marsWeightInDouble);

        //a floating point type cast to integer
        marsWeightIntInt = (int)marsWeightInDouble;
        System.out.println(" Kilograms on Mars when casted to integer " + marsWeightIntInt);

        //casting an int type to char
        char c = (char)marsWeightIntInt;
        System.out.println(" The ASCII table equivalent to marsWeightIntInt is: " +c);

        //assign the value of performing some mathematical operation on the char character to the new int variable
        int exampleOfMathOnChar = c* c;
        System.out.println(" An example of mathematical operation on the char type: "+ exampleOfMathOnChar);
    }

}