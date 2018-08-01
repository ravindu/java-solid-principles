package com.ravi.javasolidprinciples.srp.goodpractice.domian;

public class LoanRequest {

    private String loanId;
    
    private String loanType;
    
    private int loanDuration;
    
    private double interestRate;
    
    private long loanAmount;
    
    private Customer customerDetails;

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
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * @return the loanDuration
     */
    public int getLoanDuration() {
        return loanDuration;
    }

    /**
     * @param loanDuration the loanDuration to set
     */
    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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
    
    
}
