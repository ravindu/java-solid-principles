package com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.badpractice.domain.PersonalLoanRequest;

/**
 * This class is responsible for validate Personal loan and 'isValidPersonalLoan' method returns loan approval status
 * based on loan request. This is a bad practice because we don't need to maintain two different methods to do the loan
 * verification. The issue is if the bank introduce new loan type to Customer, then we have to introduce another new
 * 'validator' class to do the verification.
 * 
 * @author ravindu.s
 *
 */
public class PersonalLoanValidator {

    public boolean isValidPersonalLoan(PersonalLoanRequest personalLoan) {
        boolean isPersonalLoanApproved = true;
        try {
            // Validate the Personal Loan
            Assert.notNull(personalLoan.getCustomerDetails(), "Customer details cannot be null");
            Assert.hasText(personalLoan.getCustomerDetails().getNic(), "ID number should be verified");
            Assert.hasText(personalLoan.getCustomerDetails().getCustomerAddress(), "Address should be verified");
            Assert.isTrue(personalLoan.getLoanAmount() > 0 && personalLoan.getLoanAmount() < 2000000,
                    "Max loan amount shouls be RS 20,00000");
        } catch (Exception e) {
            // If above conditions not valid carLoan need to be rejected
            isPersonalLoanApproved = false;
        }
        return isPersonalLoanApproved;
    }
}
