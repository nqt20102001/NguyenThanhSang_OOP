package ThuVien;

import java.util.Scanner;

public class Menu {

	private File ghi = new GhiVaDocFile();
	private BookList DanhSachSach = new BookList();
	private BookList DanhSachSachMuon = new BookList();
	private DanhSachNhanVien DanhSachNhanVien = new DanhSachNhanVien();
	private DanhSachTheThuVien DanhSachTheThuVien = new DanhSachTheThuVien();
	private DanhSachTheMuon DanhSachTheMuon = new DanhSachTheMuon();
	private DanhSachPhieuNhap DanhSachPhieuNhap = new DanhSachPhieuNhap();

	private Scanner sc = new Scanner(System.in);
	private CheckLoi check = new CheckLoi();

	public void KhoiTaoDuLieu() {
		ghi.DocDanhSachSach(DanhSachSach);
		ghi.DocDanhSachSGK(DanhSachSach);
		ghi.DocDanhSachVietNam(DanhSachSach);
		ghi.DocDanhSachTheThuVien(DanhSachTheThuVien);
		ghi.DocDanhSachTheMuon(DanhSachTheMuon);
		ghi.DocDanhSachNhanVien(DanhSachNhanVien);
	}

	public void BatDauChuongTrinh() {
		while (true) {
			String lc;
			System.out.println("\n!= CHUONG TRINH QUAN LY THU VIEN =!");
			System.out.println("\n\t1. Login");
			System.out.println("\t0. Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Your choosen: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					DangNhap();
					break;

				default:
					System.out.println("Data Error!");
					break;
			}
			if (lc.equals("0"))
				break;
		}
	}

	public void DangNhap() {
		int chon;
		DanhSachAdmin();

		while (true) {
			String user, pass;
			System.out.print("\nAccount: ");
			user = sc.nextLine();
			System.out.print("Password: ");
			pass = sc.nextLine();

			if (user.equals("admin") && (pass.equals("admin"))) {
				chon = 2;
				break;
			} else if (user.equals("quoctuan") && (pass.equals("quoctuan"))) {
				chon = 1;
				break;
			} else {
				System.out.println("Error Data!");
			}
		}

		if (chon == 1) {
			QuanLyNhanVien();
		} else if (chon == 2) {
			DanhSachAdmin();
		}
	}

	public void DanhSachAdmin() {
		String lc;
		while (true) {
			System.out.println("\n!======== ADMIN ========!");
			System.out.println("1. Management NHAN_VIEN");
			System.out.println("2. Management BOOKS");
			System.out.println("3. Management LIBRARY CARD");
			System.out.println("4. List LIBRARY CARD");
			System.out.println("5. Management PHIEU_NHAP");
			System.out.println("0. Return");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Your choosen: ");
			lc = sc.nextLine();

			switch (lc) {
				case "0":
					break;
				case "1":
					break;
				case "2":
					DanhSachNhanVien.QuanLyNhanVien();
					break;
				case "3":
					DanhSachSach.QuanLySach();
					break;
				case "4":
					DanhSachTheThuVien.QuanLyTheThuVien();
					break;
				case "5":
					DanhSachTheMuon.xuatthemuon();
					break;
				case "6":
					QuanLyPhieuNhap();
					break;

				default:
					System.out.println("Data Error!");
					break;
			}
			
			if (lc.equals("0")) {
				break;
			}
		}
	}

	public void QuanLyPhieuNhap() {
		System.out.printf("\n");
		int chon;
		do {
			System.out.println("=============== Quan ly Phieu Nhap ===============");
			System.out.println("|||    1.Nhap vao phieu nhap co san  |||");
			System.out.println("|||    2.Xem phieu nhap              |||");
			System.out.println("|||    4.Xoa phieu nhap              |||");
			System.out.println("|||    5.Tim kiem phieu nhap         |||");
			System.out.println("|||    0.Thoat                       |||");
			System.out.println("---Nhap vao chuc nang:");
			String temp = sc.nextLine();

			chon = Integer.parseInt(temp);
			switch (chon) {
				case 1:
					DanhSachPhieuNhap.nhapds();
					break;
				case 2:
					DanhSachPhieuNhap.Xuat();
					break;
				case 4:
					DanhSachPhieuNhap.xoapn();
					break;
				case 5:
					DanhSachPhieuNhap.timkiempn();
					break;
			}
		} while (chon != 0);
		DanhSachAdmin();
	}

	public void QuanLyNhanVien()// quan ly nhan vien
	{
		int chon;
		do {
			System.out.println("-------------------------------");
			System.out.println("==========Tai Khoan Nhan Vien===========");
			System.out.println("!-----------------------------!");
			System.out.println("|||   1.Thong ke sach Viet Nam        |||");
			System.out.println("|||   2.Thong ke sach Giao Khoa       |||");
			System.out.println("|||   3.Thong ke tat ca cac sach      |||");
			System.out.println("|||   4.Tim kiem sach                 |||");
			System.out.println("|||   5.Nhap vao sach muon muon       |||");
			System.out.println("|||   6.Nguoi dung muon sach          |||");
			System.out.println("|||   7.Xuat danh sach the muon       |||");
			System.out.println("|||   8.Nguoi dung tra sach           |||");
			System.out.println("|||   0.Thoat                         |||");
			System.out.println("!-----------------------------!");
			System.out.println("---Chon chuc nang:");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
				case 0:
					break;
				case 1:
					DanhSachSach.xuatdssvn();
					break;

				case 2:
					DanhSachSach.xuatdssgk();
					break;
				case 3:
					DanhSachSach.xuatds();
					break;
				case 4:
					DanhSachSach.timkiemsach();
					break;
				case 5:
					MuonSach();
					break;
				case 6:
					ChoMuonSach();
					break;

				case 7:
					DanhSachTheMuon.xuatthemuon();
					break;
				case 8:
					TraSach();
					break;
				default:
					System.out.println("Nhap vao khong hop le");
					break;
			}
		} while (chon != 0);
	}

	public void MuonSach() // cho muon sach
	{
		do {
			DanhSachSach.xuatds();
			System.out.println("Nhap vao sach muon muon hoac nhan 0 de thoat");
			String MaSach = sc.nextLine();
			if (MaSach.charAt(0) == '0') {
				break;
			} else {
				for (int i = 0; i < DanhSachSach.getN(); i++) {
					if (DanhSachSach.getSach(i).getMaSach().equals(MaSach)) {
						System.out.println("Ma sach la:" + DanhSachSach.getSach(i).getMaSach());
						DanhSachSachMuon.NhapDanhSach(DanhSachSach.getSach(i));
					}
				}
			}
		} while (true);
	}

	public void ChoMuonSach()// truy xuat den the muon
	{
		TheThuVien thethuvien = new TheThuVien();
		System.out.println("Nhap ma doc gia:");
		String MaDocGia = sc.nextLine();
		for (int i = 0; i < DanhSachTheThuVien.getN(); i++) {
			if (DanhSachTheThuVien.getThe(i).getMaDocGia().equals(MaDocGia)) {
				thethuvien = DanhSachTheThuVien.getThe(i);
			}
		}
		System.out.println("Nhap vao ma muon:");
		String MaMuon = sc.nextLine();
		System.out.println("Nhap vao ngay muon:");
		String NgayMuon = sc.nextLine();
		System.out.println("Nhap vao ngay tra:");
		String NgayTra = sc.nextLine();
		for (int i = 0; i < DanhSachSachMuon.getN(); i++) {
			themuon The = new themuon();
			The.setHanTra(NgayTra);
			The.setNgayMuon(NgayMuon);
			The.setMaKhach(thethuvien.getMaDocGia());
			The.setMaMuon(MaMuon);
			The.setMaSach(DanhSachSachMuon.getSach(i).getMaSach());
			DanhSachTheMuon.NhapDanhSach(The);
		}
		DanhSachSachMuon = new BookList();
	}

	public void TraSach() {
		System.out.println("Nhap vao ma doc gia:");
		String MaDocGia = sc.nextLine();
		System.out.println("Nhap vao ngay tra:");
		String NgayTra = sc.nextLine();

		for (int i = 0; i < DanhSachTheMuon.getN(); i++) {
			if (DanhSachTheMuon.GetTheMuon(i).getMaKhach().equals(MaDocGia)) {
				if (!check.CheckNgayTra1(DanhSachTheMuon.GetTheMuon(i).getHanTra(), NgayTra)) {
					System.out.println("Xu phat!!!!");
					HeThongXuPhat xlvp = new XuLyViPham();
					System.out.println("Moi nop phat:" + xlvp.getXuphat());
				}

			}
		}
	}

}