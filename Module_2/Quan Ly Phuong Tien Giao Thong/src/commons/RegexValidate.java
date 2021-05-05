package commons;

import java.util.regex.Pattern;

public class RegexValidate {
    public static boolean regexBienSoXeTai(String bienSo){
        final String regex ="^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,bienSo);
    }
    public static boolean regexBienSoOto(String bienSo){
        final String regex="^[0-9]{2}[AB]-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,bienSo);
    }
    public static boolean regexBienSoXeMay(String bienSo){
        final String regex = "^[0-9]{2}-[A-Z][0-9A-Z]-[0-9]{3}.[0-9]{2}$";
        return Pattern.matches(regex,bienSo);
    }
    public static boolean regexNamSanXuat(String nam){
        final String regex ="^[0-9]{4}$";
        return Pattern.matches(regex,nam);
    }
    public static boolean regexChuSoHuu(String chuSoHuu){
//        final String regex ="^[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]" +
//                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+" +
//                "([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]" +
//                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+$";
       // final String regex="^[A-Z][a-z]+([ ][A-Z][a-z]+)+$";
        final String regex="^([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+[ ]?)+$";
        return Pattern.matches(regex,chuSoHuu);
    }
    public static boolean regexSo(String so){
        final String regex ="^([0-9]{1,})||([0-9]{1,}.[0-9]{1,})$";
        return Pattern.matches(regex,so);
    }
    public static boolean regexTenHangSanXuat(String tenHang){
        final String regex ="^([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]" +
                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+" +
                "([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]" +
                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+)$";
        return Pattern.matches(regex,tenHang);
    }

}
