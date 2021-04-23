package optional_bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileCSV {
    public static void main(String[] args) {
        try {
            //File file = new File();
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS16 -  IO Text File\\src\\optional_bai_tap\\read_file_csv\\country.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
              //  System.out.println(line);
                String[] split = line.split(",");
//                System.out.println("\nLength : " + split.length);
//                System.out.println("split[0] : " + split[0]);
//                System.out.println("split[1] : " + split[1]);
//                System.out.println("split[2] : " + split[2]);
//                System.out.println("split[3] : " + split[3]);
//                System.out.println("split[4] : " + split[4]);
                System.out.println( split[5]);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
