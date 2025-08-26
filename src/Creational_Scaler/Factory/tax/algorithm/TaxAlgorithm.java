package Creational_Scaler.Factory.tax.algorithm;

import Creational_Scaler.Factory.tax.SalaryDetails;

// Step-1
public interface TaxAlgorithm {

    Double calculateTax(SalaryDetails salaryDetails);
}
