package Creational_Scaler.Factory.tax.algorithm;

import Creational_Scaler.Factory.tax.SalaryDetails;

// Step-2b
public class NewTaxAlgorithm implements TaxAlgorithm {
    @Override
    public Double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra() + 0.2 * salaryDetails.getLta();
    }
}
