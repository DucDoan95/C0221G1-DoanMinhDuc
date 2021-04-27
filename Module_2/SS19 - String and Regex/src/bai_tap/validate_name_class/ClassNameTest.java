package bai_tap.validate_name_class;

import thuc_hanh.valid_account.AccountExample;

public class ClassNameTest {
    public static  ClassName className;
    public static final String[] validNameClass = new String[] { "C0318G" };
    public static final String[] invalidNameClass = new String[] { "M0318G","P0323A" };

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validNameClass) {
            boolean isvalid = className.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidNameClass) {
            boolean isvalid = className.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
    }
}
