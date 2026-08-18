package bai3TH;
import java.util.Scanner;
public class thetich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner(System.in);

		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = banPhim.nextDouble();

		double ketQua = canh * canh * canh;

		System.out.println("Thể tích khối lập phương = " + ketQua);

		banPhim.close();

}
	}
