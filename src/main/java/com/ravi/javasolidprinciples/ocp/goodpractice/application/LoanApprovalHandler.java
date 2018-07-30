package com.ravi.javasolidprinciples.ocp.goodpractice.application;

import com.ravi.javasolidprinciples.ocp.goodpractice.domain.CarLoan;
import com.ravi.javasolidprinciples.ocp.goodpractice.domain.Loan;
import com.ravi.javasolidprinciples.ocp.goodpractice.domain.LoanType;
import com.ravi.javasolidprinciples.ocp.goodpractice.domain.PersonalLoan;
import com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service.CarLoanValidator;
import com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service.LoanValidator;
import com.ravi.javasolidprinciples.ocp.goodpractice.infrastructure.service.PersonalLoanValidator;

public class LoanApprovalHandler {

    public void approveLoan(LoanValidator loanValidator, LoanType loanType) {
        switch (loanType) {
            case PERSONAL_LOAN:
                Loan personalLoan = new PersonalLoan();
                if (loanValidator.isValid(personalLoan)) {
                    // Process the personal loan further and approve the loan
                }
                break;

            case CAR_LOAN:
                Loan carLoan = new CarLoan();
                if (loanValidator.isValid(carLoan)) {
                    // Process the Car loan further and approve the loan
                }
                break;

            default:
                break;
        }
    }

    public static void main(String [] args){
        LoanApprovalHandler loanApprovalHandler= new LoanApprovalHandler();
        
        LoanValidator personalLoanValidator= new PersonalLoanValidator();
        loanApprovalHandler.approveLoan(personalLoanValidator, LoanType.PERSONAL_LOAN);
        
        LoanValidator carLoanValidator= new CarLoanValidator();
        loanApprovalHandler.approveLoan(carLoanValidator, LoanType.CAR_LOAN);
        
    }
    

}
