package N2_Ex01.implementation;

import N2_Ex01.intermediate.IAddress;

public class SpainAddress implements IAddress {
    private String country;
    private String cp;

    public SpainAddress() {
        this.country = "Spain";
        this.cp = "1000";
    }

    @Override
    public String createAddress() {
        return country + ", " + "CP: " +  cp;
    }
}
