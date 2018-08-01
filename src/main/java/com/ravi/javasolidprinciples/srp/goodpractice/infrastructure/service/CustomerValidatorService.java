package com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service;

import org.springframework.util.Assert;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
/**
 * Verify the customer. Returns isVerified status.
 * @author ravindu.s
 *
 */
public class CustomerValidatorService implements CustomerValidator {

    @Override
    public boolean verifyCustomerDetails(LoanRequest loan) {
        boolean isVerified = true;
        try {
            Assert.notNull(loan, "Loan request should be in expected format");
            Assert.notNull(loan.getCustomerDetails(), "All Customer details should be filled");
            Assert.hasText(loan.getCustomerDetails().getCustomerAddress(), "Customer address should be valid address");
            // Add Customer verification here
        } catch (IllegalArgumentException exception) {
            // If verification fails, then isVerified should be false
            isVerified = false;
        }
        return isVerified;
    }
}
