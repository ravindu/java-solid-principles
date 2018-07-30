package com.ravi.javasolidprinciples.ocp.badpractice.domain;

import java.util.List;

public class PersonalLoan {

    private String loanId;

    private String bankBranch;

    private Customer customerDetails;

    private long loanAmount;

    private String loanPurpose;

    private List<String> guaranteesList;

    /**
     * @return the loanId
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * @param loanId the loanId to set
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    /**
     * @return the bankBranch
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * @param bankBranch the bankBranch to set
     */
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    /**
     * @return the customerDetails
     */
    public Customer getCustomerDetails() {
        return customerDetails;
    }

    /**
     * @param customerDetails the customerDetails to set
     */
    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    /**
     * @return the loanAmount
     */
    public long getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

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
