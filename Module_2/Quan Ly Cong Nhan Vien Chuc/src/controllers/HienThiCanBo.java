package controllers;

import commons.DocGhiFile;
import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class HienThiCanBo {
    public static void hienThiCongNhan() {
        List<CanBo> canBoList = new ArrayList<>();
        canBoList = DocGhiFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList) {
            if (canBo instanceof CongNhan) {
                System.out.println(canBo);
            }
        }
    }
    public static void hienThiKySu() {
        List<CanBo> canBoList = new ArrayList<>();
        canBoList = DocGhiFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList) {
            if (canBo instanceof KySu) {
                System.out.println(canBo);
            }
        }
    }
    public static void hienThiNhanVien() {
        List<CanBo> canBoList = new ArrayList<>();
        canBoList = DocGhiFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList) {
            if (canBo instanceof NhanVien) {
                System.out.println(canBo);
            }
        }
    }

}
