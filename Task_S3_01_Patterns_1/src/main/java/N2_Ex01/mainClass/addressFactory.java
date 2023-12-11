package N2_Ex01.mainClass;

import N2_Ex01.implementation.PeruvianAddress;
import N2_Ex01.implementation.SpainAddress;
import N2_Ex01.intermediate.AbstractFactory;
import N2_Ex01.intermediate.IAddress;
import N2_Ex01.intermediate.IPhoneNumber;

public class addressFactory implements AbstractFactory {

    @Override
    public IAddress getAddress(String address) {
        if (address.equalsIgnoreCase("Peru")) {
            return new PeruvianAddress();
        } else if (address.equalsIgnoreCase("Spain")) {
            return new SpainAddress();

        }
        return null;
    }
    @Override
    public IPhoneNumber getPhone(String phone) {
        return null;
    }
}
