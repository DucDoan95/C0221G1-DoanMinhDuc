package bai_tap.validate_phone_number;

import bai_tap.validate_name_class.ClassName;

public class PhoneNumberTest {
    public static ClassPhoneNumber classPhoneNumber;
    public static final String[] validPhoneNumber = new String[] { "(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] { "(a8)-(22222222)"};

    public static void main(String[] args) {
        classPhoneNumber = new ClassPhoneNumber();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = classPhoneNumber.validate(phoneNumber);
            System.out.println("Account is " + phoneNumber +" is valid: "+ isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = classPhoneNumber.validate(phoneNumber);
            System.out.println("Account is " + phoneNumber +" is valid: "+ isvalid);
        }
    }
}
