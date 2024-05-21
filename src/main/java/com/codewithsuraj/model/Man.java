package com.codewithsuraj.model;

import io.swagger.annotations.Tag;

/**
 * this is man class for which we are going to check different hashcode
 * value for different  objects which may have similar values as well as
 * different values
 */
public class Man {
    private int citizenshipNumber;
    private String name;
    private String address;

    /**
     * this is constructor of parametrised type
     * @param citizenshipNumber
     * @param name
     * @param address
     */
    public Man(int citizenshipNumber, String name, String address) {
        this.citizenshipNumber = citizenshipNumber;
        this.name = name;
        this.address = address;
    }

    /**
     * now we are creating different setter and getter for different
     * member variable for setting and getting values
     * @return
     */
    public int getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(int citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * using hashcode method for generating the different values of hashcode
     * @return
     */
    @Override
    public int hashCode() {
        return citizenshipNumber;
    }
}
