package bailab04;

public class HinhChuNhat {
	// khai bao cac thuoc tinh
	private double dai;
	private double rong;
	// ham tao
	public HinhChuNhat() {
		dai=10;
		rong=5;
	}
	public HinhChuNhat(double dai, double rong) {
		this.dai=dai;
		this.rong=rong;
		
	}	
//	public HinhChuNhat(double dai, double rong) {
//		dai=daim;
//		rong=rongm;
//		
//	}
//	
	//cac getter
	double getdai() {return dai;}
	double getrong() {return rong;}
	//setter
//	void settdai(double daim) {dai=daim;}
//	void settrong (double rongm) {rong=rongm;}	
	
	void settdai(double dai) {this.dai=dai;}
	void settrong (double rong) {this.rong=rong;}
	// cac phuong thuc khac
	public String toString() {
	//tom tat thong tin cua doi tuong
	//thanh mot chuoi de in ra man hinh
	String s ="hinh nay co chieu dai =";
	s = s + dai ;
	s = s + "va chieu rong=" + dai ;
			return s;
			
	
	}

	
}