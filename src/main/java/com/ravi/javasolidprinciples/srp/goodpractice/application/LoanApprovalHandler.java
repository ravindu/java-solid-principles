package com.ravi.javasolidprinciples.srp.goodpractice.application;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.Loan;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.CustomerValidatorService;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.ExpencesCalculationService;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.LegalService;

public class LoanApprovalHandler {

    /**
     * Now the class has one reason to change, No other dependencies there.
     */
    public void approveLoan(Loan loan) {
        CustomerValidatorService customerValidator= new CustomerValidatorService();
        customerValidator.verifyCustomerDetails(loan);
        
        ExpencesCalculationService expencesService= new ExpencesCalculationService();
        expencesService.calculateDocumentCharges(loan);
        
        LegalService legalservic= new LegalService();
        legalservic.getLegalVerification(loan);
        
        System.out.println("Approve loan based on above conditions.");
        
    }
}
