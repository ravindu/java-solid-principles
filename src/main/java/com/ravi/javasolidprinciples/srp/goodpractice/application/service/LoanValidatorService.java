package com.ravi.javasolidprinciples.srp.goodpractice.application.service;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
import com.ravi.javasolidprinciples.srp.goodpractice.domian.util.DocumentationExpences;
import com.ravi.javasolidprinciples.srp.goodpractice.domian.util.ExpencesCalculatorApp;
import com.ravi.javasolidprinciples.srp.goodpractice.domian.util.GovernmentTaxCalculator;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.BankLegalService;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.CustomerValidator;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.CustomerValidatorService;
import com.ravi.javasolidprinciples.srp.goodpractice.infrastructure.service.LegalService;

/**
 * This class is responsible for verify the fundamental requirements that need to be fulfilled and send a boolean
 * response whether it's a verified loan request of not. So each fundamental requirements are moved to separate classes
 * according to the SRP and each methods perform a single task.
 * 
 * 
 * @author ravindu.s
 *
 */
public class LoanValidatorService {

    public boolean isFundamentalRequirementsFulfilled(LoanRequest request) {
        CustomerValidator customerValidatorService = new CustomerValidatorService();
        boolean isCustomerVeried = customerValidatorService.verifyCustomerDetails(request);

        LegalService legalService = new BankLegalService();
        boolean isLegallyValidated = legalService.getLegalVerification(request);

        ExpencesCalculatorApp taxesCalculator = new ExpencesCalculatorApp(new GovernmentTaxCalculator());
        double govtTaxes = taxesCalculator.calculateExpences(request);

        ExpencesCalculatorApp documentCalculator = new ExpencesCalculatorApp(new DocumentationExpences());
        double documentCharges = documentCalculator.calculateExpences(request);

        double totalExpences = govtTaxes + documentCharges;
        if (isCustomerVeried && isLegallyValidated && totalExpences > 0) {
            return true;
        }

        return false;

    }
}
