package bai_tap.copy_file_text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS16 -  IO Text File\\src\\bai_tap\\copy_file_text\\xxx.txt");
            fileWriter.write("Ahihi!");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
