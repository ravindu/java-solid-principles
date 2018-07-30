package com.ravi.javasolidprinciples.ocp.goodpractice.domain;

import java.util.List;

public class PersonalLoan extends Loan{

    private String loanPurpose;
    
    private List<String> guaranteesList;
    
    /**
     * @return the loanPurpose
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * @param loanPurpose the loanPurpose to set
     */
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     * @return the guaranteesList
     */
    public List<String> getGuaranteesList() {
        return guaranteesList;
    }

    /**
     * @param guaranteesList the guaranteesList to set
     */
    public void setGuaranteesList(List<String> guaranteesList) {
        this.guaranteesList = guaranteesList;
    }
    
}
