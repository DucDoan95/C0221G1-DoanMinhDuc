package commons;

import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH ="E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Cong Nhan Vien Chuc\\src\\data\\";
    public static void ghiFile(String tenFile, List<CanBo> list, boolean trangThaiGhi){
        File file = new File(PATH+tenFile);
        BufferedWriter bufferedWriter = null;
        try{
            bufferedWriter = new BufferedWriter(new FileWriter(file,trangThaiGhi));
            for (CanBo canBo:list){
                bufferedWriter.write(canBo.toString());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.out.println("Lỗi ghi file");
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<CanBo> docFile(String tenFile){
        List<CanBo> canBoList = new ArrayList<>();
        File file = new File(PATH+tenFile);
        BufferedReader bufferedReader = null;
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            String[] temp;
            CanBo canBo = null;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                if(temp[4].contains("/")){
                    CanBo congNhan = new CongNhan(temp[0],temp[1],temp[2],temp[3],temp[4]);
                     canBoList.add(congNhan);
                }else if(temp[4].contains("N")){
                    CanBo kySu = new KySu(temp[0],temp[1],temp[2],temp[3],temp[4]);
                    canBoList.add(kySu);
                }else {
                    CanBo nhanVien = new NhanVien(temp[0],temp[1],temp[2],temp[3],temp[4]);
                    canBoList.add(nhanVien);
                }
            }
        }catch (IOException e){
            System.out.println("Lỗi đọc file");
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return canBoList;
    }
}
