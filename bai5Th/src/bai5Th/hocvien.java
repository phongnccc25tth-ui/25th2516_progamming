package bai5Th;

public class hocvien {

	String maHV;
	String hoTen;
	int namSinh;
	String gioiTinh;

	// Ham tao
	public hocvien() {
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

	// Setter
	void setMaHV(String maHV) {
		this.maHV = maHV;
	}

	void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}