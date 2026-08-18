package bailab04;

public class mainhcn {

	public static void main(String[] args) {
		//tao moi doi tuong
		HinhChuNhat cn1 = new HinhChuNhat();
		//tao doi tuong cn1 dai10 rong 5
		
		HinhChuNhat cn2= new HinhChuNhat(20,15);
		HinhChuNhat hv = new HinhChuNhat(20,15);
		
		//gia xu muo lay du lieu/ thuoc tinh cua cn1
		//de in ra
		double cn1_dai = cn1.getdai();
		double cn1_rong = cn1.getrong();
		
		System.out.printf("hinh chu nhat co chieu dai: %.2f \n hinh chu nhat co chieu rong %.2f", cn1_dai ,cn1_rong);
		//sau khi thay doi
		cn1_dai=50;
		System.out.printf("\nsau khi thay doi chieu dai \n");
		System.out.printf("hinh cn1 co chieu dai la : %.0f\n",cn1_dai);
		System.out.printf("hinh cn1 co chieu rong la %.0f \n" ,cn1_rong);
		System.out.printf(cn1.toString());

	}
	//su dung tostring
		

}
