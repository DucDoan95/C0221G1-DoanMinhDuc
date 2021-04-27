package bai_tap.validate_name_class;


import java.util.regex.Pattern;

public class ClassName {
    static final String NAME_CLASS_REGEX ="^[CAP][0-9]{4}[GHIKLM]";

    public ClassName() {
    }
    public boolean validate(String className){
        return Pattern.matches(NAME_CLASS_REGEX,className);
    }
}
