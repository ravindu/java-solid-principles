package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.CarLoan;
import com.ravi.javasolidprinciples.ocp.goodpractice.domain.Loan;

@Service
public class CarLoanValidator implements LoanValidator {

    @Override
    public boolean isValid(Loan loan) {
        boolean loanStatus = false;
        if (loan instanceof CarLoan) {
            CarLoan carLoan = (CarLoan) loan;
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
        }
        return loanStatus;
    }
}
