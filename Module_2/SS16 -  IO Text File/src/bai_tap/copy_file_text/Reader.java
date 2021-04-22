package bai_tap.copy_file_text;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS16 -  IO Text File\\src\\bai_tap\\copy_file_text\\xxx.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
