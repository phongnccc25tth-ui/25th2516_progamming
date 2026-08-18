package bai4th;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);

		System.out.print("Nhap chieu cao (m): ");
		double chieuCao = banPhim.nextDouble();

		System.out.print("Nhap can nang (kg): ");
		double canNang = banPhim.nextDouble();

		double bmi = canNang / (chieuCao * chieuCao);

		System.out.println("Chi so BMI = " + bmi);

		if (bmi < 18.5) {
			System.out.println("Tinh trang: Gay");
		} 
		else if (bmi < 23) {
			System.out.println("Tinh trang: Binh thuong");
		} 
		else if (bmi < 25) {
			System.out.println("Tinh trang: Thua can");
		} 
		else if (bmi < 30) {
			System.out.println("Tinh trang: Beo phi do I");
		} 
		else {
			System.out.println("Tinh trang: Beo phi do II");
		}

		banPhim.close();
	}
}
