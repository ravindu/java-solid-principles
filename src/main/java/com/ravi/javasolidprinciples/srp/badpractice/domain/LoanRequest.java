package com.ravi.javasolidprinciples.srp.badpractice.domain;

public class LoanRequest {

    private String loanId;
    
    private String loanType;
    
    private int loanDuration;
    
    private double interestRate;
    
    private long loanAmount;
    
    private String customerName;
    
    private String customerAddress;
    
    private String customerNic;
    
    private String customerGender;
    
    private String customerCivilStatus;

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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the customerNic
     */
    public String getCustomerNic() {
        return customerNic;
    }

    /**
     * @param customerNic the customerNic to set
     */
    public void setCustomerNic(String customerNic) {
        this.customerNic = customerNic;
    }

    /**
     * @return the customerGender
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * @param customerGender the customerGender to set
     */
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    /**
     * @return the customerCivilStatus
     */
    public String getCustomerCivilStatus() {
        return customerCivilStatus;
    }

    /**
     * @param customerCivilStatus the customerCivilStatus to set
     */
    public void setCustomerCivilStatus(String customerCivilStatus) {
        this.customerCivilStatus = customerCivilStatus;
    }
    
}
