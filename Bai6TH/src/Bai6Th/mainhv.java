package Bai6Th;

public class mainhv {

	public static void main(String[] args) {

		// Tao san 3 hoc vien
		hocvien hv1 = new hocvien("HV01", "Nguyen Van An", 2005, "Nam");
		hocvien hv2 = new hocvien("HV02", "Tran Thi Lan", 2003, "Nu");
		hocvien hv3 = new hocvien("HV03", "Le Van Nam", 2006, "Nam");

		// In danh sach
		System.out.println("DANH SACH HOC VIEN");

		System.out.println(hv1.getMaHV() + " - " + hv1.getHoTen()
				+ " - " + hv1.getNamSinh() + " - " + hv1.getGioiTinh());

		System.out.println(hv2.getMaHV() + " - " + hv2.getHoTen()
				+ " - " + hv2.getNamSinh() + " - " + hv2.getGioiTinh());

		System.out.println(hv3.getMaHV() + " - " + hv3.getHoTen()
				+ " - " + hv3.getNamSinh() + " - " + hv3.getGioiTinh());

		// Tim hoc vien nhieu tuoi nhat
		hocvien lonTuoi = hv1;

		if (hv2.getNamSinh() < lonTuoi.getNamSinh()) {
			lonTuoi = hv2;
		}

		if (hv3.getNamSinh() < lonTuoi.getNamSinh()) {
			lonTuoi = hv3;
		}

		System.out.println("\nHoc vien nhieu tuoi nhat: "
				+ lonTuoi.getHoTen());
	}
}