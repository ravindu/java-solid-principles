package com.ravi.javasolidprinciples.srp.badpractice.application;

public class LoanApprovalHandler {

    public void approveLoan() {
        System.out.println("Approve or Reject the loan");
    }

    public void calculateTaxes() {
        System.out.println("Calculate goverment taxes from loan");
        // This shouldn't be in the LoanApprovalHandler class because there are much more reasons to change the class.

    }

    public void verifyCustomerDetails() {
        System.out.println("Verify customer address, ID, Back account details");
        // This shouldn't be in the LoanApprovalHandler class because there are much more reasons to change the class.
    }
}
