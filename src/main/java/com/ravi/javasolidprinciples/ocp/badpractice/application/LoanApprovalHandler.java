package com.ravi.javasolidprinciples.ocp.badpractice.application;

import com.ravi.javasolidprinciples.ocp.badpractice.domain.CarLoan;
import com.ravi.javasolidprinciples.ocp.badpractice.domain.PersonalLoan;
import com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service.CarLoanValidator;
import com.ravi.javasolidprinciples.ocp.badpractice.infrastructure.service.PersonalLoanValidator;

public class LoanApprovalHandler {

    public void approvePersonalLoan(PersonalLoanValidator personalLoanValidator) {
        PersonalLoan personalLoan = new PersonalLoan();
        if (personalLoanValidator.isValidPersonalLoan(personalLoan)) {
            // Process the personal loan further and approve the loan
        }
    }

    public void approveCarLoan(CarLoanValidator carLoanValidator) {
        CarLoan carLoan = new CarLoan();
        if (carLoanValidator.isValidCarLoan(carLoan)) {
            // Process the Car loan further and approve the loan
        }
    }

}
