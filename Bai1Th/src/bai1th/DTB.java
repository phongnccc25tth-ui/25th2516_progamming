package bai1th;
import java.util.Scanner;
public class DTB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner(System.in);

		System.out.print("Nhap ho va ten sinh vien: ");
		String hoTen = banPhim.nextLine();

		System.out.print("Nhap diem trung binh: ");
		double diemTB = banPhim.nextDouble();

		System.out.println("Ho va ten sinh vien: " + hoTen);
		System.out.println("Diem trung binh: " + diemTB);

		banPhim.close();
	}
}
