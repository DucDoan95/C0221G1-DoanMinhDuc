package controllers;

import commons.DocGhiFile;
import models.CanBo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SapXep {
   public static void sapXep(){
       List<CanBo>canBoList=new ArrayList<>();
       canBoList = DocGhiFile.docFile("canbo.csv");
       canBoList.sort(Comparator.comparing(CanBo::getHoTen));
       for (CanBo canBo:canBoList){
           System.out.println(canBo);
       }
   }
}
