package optional_bai_tap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileBinary {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws IOException {
        File source = new File("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS17 -  IO Binary File and Serialization\\src\\optional_bai_tap\\source.txt");
        File target = new File("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS17 -  IO Binary File and Serialization\\src\\optional_bai_tap\\target.txt");
        copyFileUsingJava7Files(source,target);
    }
}
