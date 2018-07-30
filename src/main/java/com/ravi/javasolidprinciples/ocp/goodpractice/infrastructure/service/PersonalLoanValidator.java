package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.Loan;
import com.ravi.javasolidprinciples.ocp.goodpractice.domain.PersonalLoan;

@Service
public class PersonalLoanValidator implements LoanValidator {

    @Override
    public boolean isValid(Loan loan) {
        boolean loanStatus = false;
        if (loan instanceof PersonalLoan) {
            PersonalLoan personalLoan = (PersonalLoan) loan;
            try {
                // Validate the Personal Loan
                Assert.notNull(personalLoan.getCustomerDetails(), "Customer details cannot be null");
                Assert.hasText(personalLoan.getCustomerDetails().getNic(), "ID number should be verified");
                Assert.hasText(personalLoan.getCustomerDetails().getCustomerAddress(), "Address should be verified");
                Assert.isTrue(personalLoan.getLoanAmount() > 0 && personalLoan.getLoanAmount() < 2000000,
                        "Max loan amount shouls be RS 20,00000");
                loanStatus = true;
            } catch (Exception e) {
                // If above conditions not valid carLoan need to be rejected
            }
        }
        return loanStatus;
    }

}
