/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSachTheThuVien {

    private final Scanner sc = new Scanner(System.in);
    private CheckLoi check=new CheckLoi();
    private int n;
    private TheThuVien[] arrt;

    public DanhSachTheThuVien() {
        arrt = null;
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DanhSachTheThuVien(int n, TheThuVien[] arrt) {
        this.n = n;
        this.arrt = arrt;
    }
    public TheThuVien getThe(int i)
    {
        return arrt[i];
    }
    public void nhapsan()// nhap san vao ke sach
    {
        n = 4;
        arrt = new TheThuVien[n];
        arrt[0] = new TheThuVien("DG01","Dang Duy Van","1/1/2002","dangduyvan@gmail.com","Sai Gon","0909123456","Nam","THE01","1/12/2021","31/12/2021");
        arrt[1] = new TheThuVien("DG02","Pham Hao Vinh","2/1/2002","phamhaovinh@gmail.com","Sai Gon","0909654321","Nam","THE02","1/12/2021","31/12/2021");
        arrt[2] = new TheThuVien("DG03","Huynh Tu Tuan","3/1/2002","huynhtutuan@gmail.com","Sai Gon","0121596389","Nam","THE03","1/12/2021","31/12/2021");
        arrt[3] = new TheThuVien("DG04","Nguyen Minh Tri","4/1/2002","ngnminhtri@gmail.com","Sai Gon","0122363983","Nam","THE04","1/12/2021","31/12/2021");
    }

    public void nhapds() {
        System.out.println("Nhap vao so luong the:");
        n = Integer.parseInt(sc.nextLine());
        arrt = new TheThuVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao the thu :" + (i + 1));
            TheThuVien a = new TheThuVien();
            arrt[i] = new TheThuVien();
            arrt[i].Nhap();
        }
    }

    public void xuatds() {

        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("+---------------------------------(Danh sach cac the duoc muon)----------------------------------------------+:");

        for (int i = 0; i < arrt.length; i++) {
            arrt[i].Xuat();
            System.out.println("|____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________|");
        }
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
    }

    public void nhapthemthe() {
        System.out.println("Nhap them thong tin the muon:");
        TheThuVien the = new TheThuVien();
        the.Nhap();
        arrt = Arrays.copyOf(arrt, arrt.length + 1);
        arrt[n] = the;
        n++;
    }

public void xoathe() {
        System.out.println("Nhap ma the can xoa:");
        String xoathe = sc.nextLine();
        for (int i = 0; i < arrt.length; i++) {
            if (arrt[i].getSoThe().equalsIgnoreCase(xoathe)) {
                for (int j = i; j < arrt.length - 1; j++) {
                    arrt[j] = arrt[j + 1];
                }
                n--;
                arrt = Arrays.copyOf(arrt, arrt.length - 1);
            }
        }
    }

    public void timkiemthe() {
        System.out.println("Nhap vao the dang muon can tim:");
        String timthe = sc.nextLine();
        for (int i = 0; i < arrt.length; i++) {
            if (arrt[i].getSoThe().equalsIgnoreCase(timthe)) {
                arrt[i].Xuat();
            }
        }
    }
     public void NhapDanhSachTheThuVien(TheThuVien the)
    {
        if(n==0)
        {
            arrt=new TheThuVien[1];
            arrt[n]=the;
            n++;
        }
        else
        {
            arrt=Arrays.copyOf(arrt, n+1);
            arrt[n]=the;
            n++;
        }
    }
public void QuanLyTheThuVien()
    {
        System.out.printf("\n");
        int chon;
        do{
            System.out.println("=================== Danh Sach The Thu Vien ===================");
            System.out.println("|||\t1.Them the thu vien            |||");
            System.out.println("|||\t2.Xoa the thu vien             |||");
            System.out.println("|||\t3.Tim kiem thu vien            |||");
            System.out.println("|||\t4.Xem danh sach the thu vien   |||");
            System.out.println("|||\t0.Thoat                        |||");
            System.out.println("===========================================================");
            System.out.println("---Nhap vao chuc nang:");
            chon=check.KiemTraNhapSoNguyen();
            switch(chon)
            {
                case 0:
                    break;
                case 1:
                    nhapthemthe();
                    break;
                case 2:
                    xoathe();
                    break;
                case 3:
                    timkiemthe();
                    break;
                case 4:
                    xuatds();
                    break;
                default:
                    System.out.println("Nhap vao khong hop le!!!");
                    break;
            }
        }while(chon!=0);
    }
}
