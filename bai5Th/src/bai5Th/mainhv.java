package bai5Th;

import java.util.Scanner;

public class mainhv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		hocvien hv = new hocvien();

		System.out.print("Nhap ma hoc vien: ");
		hv.setMaHV(sc.nextLine());

		System.out.print("Nhap ho ten: ");
		hv.setHoTen(sc.nextLine());

		System.out.print("Nhap nam sinh: ");
		hv.setNamSinh(sc.nextInt());
		sc.nextLine();

		System.out.print("Nhap gioi tinh: ");
		hv.setGioiTinh(sc.nextLine());

		System.out.println("\nMa hoc vien: " + hv.getMaHV());
		System.out.println("Ho ten: " + hv.getHoTen());
		System.out.println("Nam sinh: " + hv.getNamSinh());
		System.out.println("Gioi tinh: " + hv.getGioiTinh());

		sc.close();
	}
}