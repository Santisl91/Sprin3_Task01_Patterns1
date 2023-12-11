package N2_Ex01.implementation;

import N2_Ex01.intermediate.IPhoneNumber;

public class PeruvianPhoneNumber implements IPhoneNumber {

    private String longDistance;

    public PeruvianPhoneNumber() {

        this.longDistance = "+51";

    }

    @Override
    public String showPhoneFormat() {
        return "(" + longDistance + ")";
    }
}
