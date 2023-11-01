package test;

import java.util.ArrayList;
import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> a = new ArrayList<SinhVien>();
		DanhSachSinhVien dssv = new DanhSachSinhVien(a);
		int luaChon;
		do {
			System.out.println("MENU");
			System.out.println("Vui lòng chọn chức năng ");
			System.out.println("1. Thêm sinh viên vào danh sách");
			System.out.println("2. In danh sách sinh viên");
			System.out.println("3. Kiểm tra danh sách có rỗng hay không");
			System.out.println("4. Kiểm tra số lượng sinh viên trong danh sách");
			System.out.println("5. Làm rỗng danh sách sinh viên");
			System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sach hay không, dựa trên mã sinh viên");
			System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên");
			System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím");
			System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
			System.out.println("0. Thoát chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: {
				System.out.println("Nhập mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhập Họ và Tên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");
				float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				continue;
			}
			case 2: {
				dssv.inDanhSachSinhVien();
				continue;
			}
			case 3: {
				System.out.println("Danh sách sinh viên rỗng: " + dssv.kiemTraDanhSachRong());
				continue;
			}
			case 4: {
				System.out.println("Số lượng sinh viên trong danh sách là: " + dssv.laySoLuongSinhVien());
				continue;
			}
			case 5: {
				dssv.lamRongDanhSach();
				continue;
			}
			case 6: {
				System.out.println("Nhập mã sinh viên cần kiểm tra");
				String msv = sc.nextLine();
				SinhVien msvss = new SinhVien(msv);
				System.out.println("Mã sinh viên có tồn tại trong danh sách " + dssv.kiemTraTonTai(msvss));
				continue;
			}
			case 7: {
				System.out.println("Nhập mã sinh viên cần xóa");
				String msv = sc.nextLine();
				SinhVien msvss = new SinhVien(msv);
				System.out.println("Xóa xinh viên trong danh sách: " + dssv.xoaSinhVien(msvss));
				continue;
			}
			case 8: {
				System.out.println("Nhập Tên sinh viên cần tìm kiếm");
				String hvt = sc.nextLine();
				dssv.timSinhVine(hvt);
				continue;
			}
			case 9: {
				dssv.sapXepSinhVien();
				dssv.inDanhSachSinhVien();
				continue;
			}
			}
		} while (luaChon != 0);
		sc.close();
	}
}
