package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

//Thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

//In danh sách sinh viên ra màn hình
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

//Kiểm tra danh sách có rỗng hay không
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

//Lấy ra số lượng sinh viên trong danh sách
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

//Làm rỗng danh sách sinh viên
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

//Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

//Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

//Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVine(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

//Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVien() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return 1;
				} else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}
}