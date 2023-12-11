package N2_Ex01.implementation;

import N2_Ex01.intermediate.IAddress;

public class PeruvianAddress implements IAddress {
    private String country;
    private String cp;

    public PeruvianAddress() {
        this.country = "Peru";
        this.cp = "027";
    }

    @Override
    public String createAddress() {
        return country + ", " + "CP: " +  cp;
    }
}
