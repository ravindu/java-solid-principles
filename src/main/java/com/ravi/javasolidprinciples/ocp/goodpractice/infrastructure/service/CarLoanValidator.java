package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.CarLoanRequest;
/**
 * 'CarLoanValidator' class implements a common method called 'isValid' to validate the loan.
 * @author ravindu.s
 *
 */
public class CarLoanValidator implements LoanValidator {

    private CarLoanRequest carLoan;
    
    public CarLoanValidator(CarLoanRequest carLoan){
        this.carLoan= carLoan;
    }
    
    @Override
    public boolean isValid() {
        boolean loanStatus = false;
        try {
            // Validate the Car Loan
            Assert.notNull(carLoan.getCustomerDetails(), "Customer details cannot be null");
            Assert.hasText(carLoan.getCustomerDetails().getNic(), "ID number should be verified");
            Assert.hasText(carLoan.getCustomerDetails().getCustomerAddress(), "Address should be verified");
            Assert.isTrue(carLoan.getLoanAmount() > 0 && carLoan.getLoanAmount() < 5000000,
                    "Max loan amount shouls be RS 50,00000");
            Assert.hasText(carLoan.getCarModel(), "Car model should be mentioned");
            Assert.hasText(carLoan.getCarBrand(), "Car brand should be mentioned");
            loanStatus = true;
        } catch (Exception e) {
            // If above conditions not valid carLoan need to be rejected
        }

        return loanStatus;
    }
}
