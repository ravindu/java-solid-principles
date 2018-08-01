package com.ravi.javasolidprinciples.srp.goodpractice.domian.util;

import com.ravi.javasolidprinciples.srp.goodpractice.domian.LoanRequest;
/**
 * Expose a single entry point to get expenses. *  
 * @author ravindu.s
 *
 */
public class ExpencesCalculatorApp {

    public ExpencesCalculator expencesCalculator;

    public ExpencesCalculatorApp(ExpencesCalculator expencesCalculator) {
        this.expencesCalculator = expencesCalculator;
    }
    
    public double calculateExpences(LoanRequest request){
        return expencesCalculator.calculateExpences(request);
    }
}
