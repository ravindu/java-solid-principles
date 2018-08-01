package com.ravi.javasolidprinciples.srp.badpractice.application;

import com.ravi.javasolidprinciples.srp.badpractice.domain.LoanRequest;

/**
 * This is the class which is designed to get the loan approval based of several fundamental requirements. So as you can
 * see, the LoanApprovalApplication class has more than one reason to change because "approveLoan" method handle lots of
 * requirements in single method.
 * 
 * @author ravindu.s
 *
 */
public class LoanApprovalApplication {

    public void approveLoan(LoanRequest loanRequest) {
        boolean isCustomerVerified = false;
        boolean isAccountDeptVerified = false;
        boolean isFinalLoanAmountSet = false;
        /**
         * Verify Customer Details.
         */
        if (loanRequest.getCustomerNic() != null && loanRequest.getCustomerName() != null) {
            // Check customer details first.

            // Modify "isCustomerVerified" value based on details.
        }
        /**
         * Verify the legal status and previous loan details and income details.
         */
        if (loanRequest.getCustomerNic() != null) {
            // Check previous loan details and verify customer from CRIB

            // Check income details

            // Check Legal status of this loan request

            // Modify "isAccountDeptVerified" value.

        }
        /**
         * Calculate expenses from the loan amount.
         */
        if (isCustomerVerified && isAccountDeptVerified) {

            // Calculate government taxes from the loan amount

            // Calculate document charges from loan

            // Reduce all expenses from loan amount and set the new amount. Modify "isFinalLoanAmountSet".
        }

        /**
         * Finally consider all conditions and decide whether loan is approved or not
         */
        if (isCustomerVerified && isAccountDeptVerified && isFinalLoanAmountSet) {
            // Do further process and approve the loan
        } else {
            // Do further process and reject the loan
        }
    }
}
