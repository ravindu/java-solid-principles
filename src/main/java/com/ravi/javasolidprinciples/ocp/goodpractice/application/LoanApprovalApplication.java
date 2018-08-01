package com.ravi.javasolidprinciples.ocp.goodpractice.application;

import com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service.LoanValidator;

/**
 * 'LoanApprovalApplication' class is responsible for Approve/Reject the loan. But here we don't need to each loan types
 * separately. All Loan requests are handled by one 'LoanValidator'. So if Bank introduce new loan types, no need to
 * worry how to approve/reject those separately.
 * 
 * @author ravindu.s
 *
 */
public class LoanApprovalApplication {

    public void approveLoan(LoanValidator loanValidator) {
        if (loanValidator.isValid()) {
            // implement final procedures before give the approval. These processes can be changed bank to bank.
            System.out.println("Approve the loan");
        } else {
            // implement any process when the loan request is rejected. These processes can be changed bank to bank.
            System.out.println("Reject the loan");
        }
    }

}
