package N2_Ex01.mainClass;

import N2_Ex01.intermediate.AbstractFactory;
import N2_Ex01.intermediate.IAddress;
import N2_Ex01.intermediate.IPhoneNumber;

public class Main {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory("phone");
        IPhoneNumber iphone1 = abstractFactory.getPhone("Peru");

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("address");
        IAddress iAddress = abstractFactory1.getAddress("Peru");

        String name = "Santiago Santos";
        String address = "Malecon Armendariz 271 dpt 16A";
        String phone = "4321-1234";
        System.out.println("Data: " + name + ", " + address + ", " + phone);
        System.out.println("In process..." + "\n");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inserting data: " + "\n");
        System.out.println("Nombre: " + name + "\n" + "Address: " + iAddress.createAddress() + ", " + address + "\n" + "Phone number: " + iphone1.showPhoneFormat() + " " + phone);
    }
}