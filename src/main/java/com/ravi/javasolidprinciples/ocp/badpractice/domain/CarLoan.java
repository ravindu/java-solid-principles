package com.ravi.javasolidprinciples.ocp.badpractice.domain;

import java.util.List;

public class CarLoan {

    private String loanId;

    private String bankBranch;

    private Customer customerDetails;

    private long loanAmount;

    private String carBrand;

    private String carModel;

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
     * @return the carBrand
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand the carBrand to set
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
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
