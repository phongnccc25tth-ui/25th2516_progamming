package Bai6Th;

public class hocvien {

	String maHV;
	String hoTen;
	int namSinh;
	String gioiTinh;

	// Ham tao
	public hocvien(String maHV, String hoTen, int namSinh, String gioiTinh) {
		this.maHV = maHV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	// Getter
	String getMaHV() {
		return maHV;
	}

	String getHoTen() {
		return hoTen;
	}

	int getNamSinh() {
		return namSinh;
	}

	String getGioiTinh() {
		return gioiTinh;
	}
}