package bai_tap.validate_phone_number;

import java.util.regex.Pattern;

public class ClassPhoneNumber {
    static final String PHONE_NUMBER_REGEX ="^\\([0-9]{2}\\)-\\([0][0-9]{9}\\)$";

    public ClassPhoneNumber() {
    }
    public boolean validate(String phoneNumber){
        return Pattern.matches(PHONE_NUMBER_REGEX,phoneNumber);
    }
}
