/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachTheMuon {

    private int n;
    private themuon[] DanhSachTheMuon;

    public DanhSachTheMuon() {
        DanhSachTheMuon = null;
        n = 0;
    }

    public DanhSachTheMuon(int n, themuon[] DanhSachTheMuon) {
        this.n = n;
        this.DanhSachTheMuon = DanhSachTheMuon;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public themuon[] getDanhSachTheMuon() {
        return DanhSachTheMuon;
    }

    public void setDanhSachTheMuon(themuon[] DanhSachTheMuon) {
        this.DanhSachTheMuon = DanhSachTheMuon;
    }
    
    
    
    public void NhapDanhSach(themuon the) {
        if (n == 0) {
            DanhSachTheMuon = new themuon[1];
            DanhSachTheMuon[n] = the;
            n++;
        } else {
            DanhSachTheMuon = Arrays.copyOf(DanhSachTheMuon, n + 1);
            DanhSachTheMuon[n] = the;
            n++;
        }
    }

    public void xuatthemuon() {
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
        System.out.println("+---------------------------------(Danh sach cac the duoc muon)----------------------------------------------+:");

        for (int i = 0; i < n; i++) {
            DanhSachTheMuon[i].Xuat();
            System.out.println("|____________________________________________________________________________________________________|");
        }
        System.out.println("+-------------------------------------------------------------------------------------------------------+");
    }
    
    public themuon GetTheMuon(int i)
    {
        return DanhSachTheMuon[i];
    }
}
