package bailab03;
import java.util.Scanner;


public class tonghaiso {

	public static void main(String[] args) {
		//khai bao
		double num1, num2 ,sum;
		Scanner banphim = new Scanner(System.in);
		 
	//in ra thong tin
		System.out.print("moi nhap so thu nhat: ");
		num1=banphim.nextDouble();
		System.out.print("moi nhap so thu hai: ");
		num2=banphim.nextDouble();
		//tinh toan
		sum =num1+num2;
		//xuat
		System.out.print("tong cua:");
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print("=");
		System.out.print(sum);
		System.out.printf("\ntong cua %.2f va %.2f la %.2f", num1,num2,sum);
		

	}

}
