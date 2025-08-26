package Creational_Scaler.Factory.tax;

import Creational_Scaler.Factory.tax.algorithm.TaxCalculatorFactory;

public class TaxCalculator {

    public static Double taxCalculator(TaxRegime regime , SalaryDetails salDetails) {
        return TaxCalculatorFactory
                        .getTaxAlgorithm(regime)
                        .calculateTax(salDetails);
    }
}
