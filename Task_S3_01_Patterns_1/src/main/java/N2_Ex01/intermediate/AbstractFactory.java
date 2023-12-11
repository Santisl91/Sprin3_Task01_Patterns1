package N2_Ex01.intermediate;

public interface AbstractFactory {
    IPhoneNumber getPhone(String phone);
    IAddress getAddress(String address);
}
