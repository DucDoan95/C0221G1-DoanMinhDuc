package controllers;

import commons.DocGhiFile;
import models.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiem {
    public static void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm kiếm");
        String ten = scanner.nextLine();
        List<CanBo> canBoList = new ArrayList<>();
        canBoList = DocGhiFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList) {
            if (canBo.getHoTen().contains(ten)) {
                System.out.println(canBo);
            }
        }
    }
}
