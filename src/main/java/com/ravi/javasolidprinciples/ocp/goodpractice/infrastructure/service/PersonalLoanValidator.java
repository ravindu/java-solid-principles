package com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.PersonalLoanRequest;

/**
 * 'PersonalLoanValidator' class implements a common method called 'isValid' to validate the loan. If new Loan type
 * introduce, just need to implement 'LoanValidator' interface and add the verification logic into 'isValid' method.
 * 
 * @author ravindu.s
 *
 */
public class PersonalLoanValidator implements LoanValidator {

    private PersonalLoanRequest personalLoan;

    public PersonalLoanValidator(PersonalLoanRequest personalLoan) {
        this.personalLoan = personalLoan;
    }

    @Override
    public boolean isValid() {
        boolean loanStatus = false;
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

        return loanStatus;
    }

}
