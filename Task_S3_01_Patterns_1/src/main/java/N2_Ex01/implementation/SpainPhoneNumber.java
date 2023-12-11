package N2_Ex01.implementation;

import N2_Ex01.intermediate.IPhoneNumber;

public class SpainPhoneNumber implements IPhoneNumber {
    private String longDistance;
    public SpainPhoneNumber() {

        this.longDistance = "+34";

    }

    @Override
    public String showPhoneFormat() {
        return "(" + longDistance + ") ";
    }
}
