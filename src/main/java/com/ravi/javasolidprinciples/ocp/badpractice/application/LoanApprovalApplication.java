package com.ravi.javasolidprinciples.ocp.badpractice.application;

import com.ravi.javasolidprinciples.ocp.badpractice.domain.CarLoanRequest;
import com.ravi.javasolidprinciples.ocp.badpractice.domain.LoanType;
import com.ravi.javasolidprinciples.ocp.badpractice.domain.PersonalLoanRequest;
import com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service.CarLoanValidator;
import com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service.PersonalLoanValidator;
import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;

/**
 * 'LoanApprovalApplication' class is responsible for approve/reject loan based on loan request verification. But here,
 * what happen if bank introduces another loan type? Then you have to add another 'case' code block to handle that. So
 * that's violating the Open Close Principle.
 * 
 * @author ravindu.s
 *
 */
public class LoanApprovalApplication {

    public void approveLoan(LoanRequest loanRequest, LoanType type) {

        switch (type) {
            case PERSONAL_LOAN:
                PersonalLoanValidator personalLoanValidator = new PersonalLoanValidator();
                PersonalLoanRequest personalLoan = new PersonalLoanRequest();
                if (personalLoanValidator.isValidPersonalLoan(personalLoan)) {
                    // Process the personal loan further and approve the loan
                }
                break;

            case CAR_LOAN:
                CarLoanValidator carLoanValidator = new CarLoanValidator();
                CarLoanRequest carLoan = new CarLoanRequest();
                if (carLoanValidator.isValidCarLoan(carLoan)) {
                    // Process the Car loan further and approve the loan
                }
                break;

            default:
                break;
        }
    }

}
