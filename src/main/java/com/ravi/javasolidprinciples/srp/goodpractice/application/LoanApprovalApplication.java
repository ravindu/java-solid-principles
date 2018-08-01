package com.ravi.javasolidprinciples.srp.goodpractice.application;

import com.ravi.javasolidprinciples.srp.goodpractice.application.service.LoanValidatorService;
import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;

/**
 * This class maintain SRP because this has only one reason to change, That is the process before do the loan approval
 * or the process after follow loan reject. 
 * 
 * @author ravindu.s
 *
 */
public class LoanApprovalApplication {

    /**
     * approveLoan method has one responsibility. That is approve or reject the loan. So according to this example,
     * LoanApprovalApplication class also have one responsibility. That means class can be changed only if the the loan
     * approval process is changed. Otherwise there are no reasons to change this class.
     */
    public void approveLoan(LoanRequest loanRequest) {

        LoanValidatorService loanValidatorService = new LoanValidatorService();
        if (loanValidatorService.isFundamentalRequirementsFulfilled(loanRequest)) {
            // implement final procedures before give the approval. These processes can be changed bank to bank.
            System.out.println("Approve the loan");
        } else {
            // implement any process when the loan request is rejected. These processes can be changed bank to bank.
            System.out.println("Reject the loan");
        }
    }
}
