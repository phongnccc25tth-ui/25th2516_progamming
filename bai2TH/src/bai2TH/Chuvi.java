package bai2TH;
import java.util.Scanner;
public class Chuvi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner(System.in);

		System.out.print("Nhap canh thu nhat: ");
		double canh1 = banPhim.nextDouble();

		System.out.print("Nhap canh thu hai: ");
		double canh2 = banPhim.nextDouble();

		double chuVi = (canh1 + canh2) * 2;
		double dienTich = canh1 * canh2;
		double canhNho = Math.min(canh1, canh2);

		System.out.println("Chu vi hinh chu nhat = " + chuVi);
		System.out.println("Dien tich hinh chu nhat = " + dienTich);
		System.out.println("Canh nho cua hinh chu nhat = " + canhNho);

		banPhim.close();
	}
}
