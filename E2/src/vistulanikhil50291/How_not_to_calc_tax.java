package vistulanikhil50291;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class How_not_to_calc_tax {

    public static void main(String[] args) {
        double priceWithoutVAT = 9.99;
        System.out.println("Price without VAT = " + priceWithoutVAT);

        double priceWithVAT = priceWithoutVAT + 1.23;
        System.out.println("Price with VAT = " + priceWithVAT);

        double ValueWithVAT = priceWithVAT + 10000;
        System.out.println("Value with VAT = " + ValueWithVAT);

        double priceWithoutVAT2 = ValueWithVAT / 1.23;
        System.out.println("Value without VAT: " + priceWithoutVAT2);

        // Using the BigDecimal class
        System.out.println(" ");
        BigDecimal dbPriceWithoutVAT= new BigDecimal( "9.99");
        System.out.println("Price without VAT: " + dbPriceWithoutVAT);

        BigDecimal dbPriceWithVAT = dbPriceWithoutVAT.multiply(new BigDecimal( "1.23"));
        dbPriceWithVAT = dbPriceWithVAT.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Price with VAT rounded: " + dbPriceWithVAT);

        BigDecimal dbValueWithVAt = dbPriceWithVAT.multiply(new BigDecimal(10000));
        System.out.println("Value with VAT " + dbValueWithVAt);
    }

}