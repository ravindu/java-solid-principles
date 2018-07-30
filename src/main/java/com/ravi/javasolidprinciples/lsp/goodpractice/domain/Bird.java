package com.ravi.javasolidprinciples.lsp.goodpractice.domain;

public abstract class Bird {

    private String birdName;

    private String color;

    private String sciencetificName;

    private String originCountry;

    private boolean isThreatenedSpecie;

    public abstract void eat();

    /**
     * @return the birdName
     */
    public String getBirdName() {
        return birdName;
    }

    /**
     * @param birdName the birdName to set
     */
    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the sciencetificName
     */
    public String getSciencetificName() {
        return sciencetificName;
    }

    /**
     * @param sciencetificName the sciencetificName to set
     */
    public void setSciencetificName(String sciencetificName) {
        this.sciencetificName = sciencetificName;
    }

    /**
     * @return the originCountry
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * @param originCountry the originCountry to set
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * @return the isThreatenedSpecie
     */
    public boolean isThreatenedSpecie() {
        return isThreatenedSpecie;
    }

    /**
     * @param isThreatenedSpecie the isThreatenedSpecie to set
     */
    public void setThreatenedSpecie(boolean isThreatenedSpecie) {
        this.isThreatenedSpecie = isThreatenedSpecie;
    }

}
