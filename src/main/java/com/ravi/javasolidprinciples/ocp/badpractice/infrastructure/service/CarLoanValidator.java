package com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.badpractice.domain.CarLoan;

public class CarLoanValidator {

    public boolean isValidCarLoan(CarLoan carLoan) {
        boolean iscarLoanApproved = true;
        try {
            // Validate the Car Loan
            Assert.notNull(carLoan.getCustomerDetails(), "Customer details cannot be null");
            Assert.hasText(carLoan.getCustomerDetails().getNic(), "ID number should be verified");
            Assert.hasText(carLoan.getCustomerDetails().getCustomerAddress(), "Address should be verified");
            Assert.isTrue(carLoan.getLoanAmount() > 0 && carLoan.getLoanAmount() < 5000000,
                    "Max loan amount shouls be RS 50,00000");
            Assert.hasText(carLoan.getCarModel(), "Car model should be mentioned");
            Assert.hasText(carLoan.getCarBrand(), "Car brand should be mentioned");
        } catch (Exception e) {
            // If above conditions not valid carLoan need to be rejected
            iscarLoanApproved = false;
        }
        return iscarLoanApproved;
    }
}
