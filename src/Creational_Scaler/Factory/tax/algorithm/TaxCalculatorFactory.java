package Creational_Scaler.Factory.tax.algorithm;

import Creational_Scaler.Factory.tax.TaxRegime;

// Step-3
public class TaxCalculatorFactory {

    public static TaxAlgorithm getTaxAlgorithm(TaxRegime taxRegime) {
        switch (taxRegime) {
            case OLD:
                return new OldTaxAlgorithm();

            case NEW:
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("Unknown tax regime " + taxRegime);
    }
}
