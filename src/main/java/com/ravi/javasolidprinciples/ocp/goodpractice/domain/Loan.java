package com.ravi.javasolidprinciples.ocp.goodpractice.domain;

public class Loan {

    private String loanId;
    
    private String branchName;
    
    private Customer customerDetails;
    
    private long loanAmount;

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
     * @return the branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * @param branchName the branchName to set
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
}
