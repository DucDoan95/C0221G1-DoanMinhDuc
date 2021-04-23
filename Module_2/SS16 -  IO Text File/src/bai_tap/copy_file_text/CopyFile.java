package bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            //File file = new File();
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS16 -  IO Text File\\src\\bai_tap\\copy_file_text\\target_file.txt");
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS16 -  IO Text File\\src\\bai_tap\\copy_file_text\\source_file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =null;
            System.out.println("\tWriting...");
            while ((line = bufferedReader.readLine())!=null){
                fileWriter.write(line+"\n");
                System.out.println(line);
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("\tCopy file is done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
