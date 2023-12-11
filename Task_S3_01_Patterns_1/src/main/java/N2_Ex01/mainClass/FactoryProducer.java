package N2_Ex01.mainClass;

import N2_Ex01.intermediate.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("phone")){
            return new phoneFactory();
        } else if (type.equalsIgnoreCase("Address")) {
            return new addressFactory();
        }
        return null;
    }
}
