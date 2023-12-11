package N2_Ex01.mainClass;

import N2_Ex01.implementation.PeruvianPhoneNumber;
import N2_Ex01.implementation.SpainPhoneNumber;
import N2_Ex01.intermediate.AbstractFactory;
import N2_Ex01.intermediate.IAddress;
import N2_Ex01.intermediate.IPhoneNumber;

public class phoneFactory implements AbstractFactory {

    @Override
    public IPhoneNumber getPhone(String phone) {
        if (phone.equalsIgnoreCase("Peru")) {
            return new PeruvianPhoneNumber();
        } else if (phone.equalsIgnoreCase("Spain")) {
            return new SpainPhoneNumber();
        }
        return null;
    }

    @Override
    public IAddress getAddress(String address) {
        return null;
    }
}