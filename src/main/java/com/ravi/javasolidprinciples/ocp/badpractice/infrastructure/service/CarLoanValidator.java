package com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.badpractice.domain.CarLoanRequest;

/**
 * This class is responsible for validate Car loan and 'isValidCarLoan' method returns loan approval status based on
 * loan request. This is a bad practice because we don't need to maintain two different methods to do the loan
 * verification. The issue is if the bank introduce new loan type to Customer, then we have to introduce another new
 * 'validator' class to do the verification.
 * 
 * @author ravindu.s
 *
 */
public class CarLoanValidator {

    public boolean isValidCarLoan(CarLoanRequest carLoan) {
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
