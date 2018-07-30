package com.ravi.javasolidprinciples.lsp.badpractice.domain;

public abstract class Bird {

    private String color;
    
    private String sciencetificName;
    
    private boolean isVeggies;
    
    public abstract void fly();
    
    public abstract void eat();

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
     * @return the isVeggies
     */
    public boolean isVeggies() {
        return isVeggies;
    }

    /**
     * @param isVeggies the isVeggies to set
     */
    public void setVeggies(boolean isVeggies) {
        this.isVeggies = isVeggies;
    }
    
    
    
    
}
