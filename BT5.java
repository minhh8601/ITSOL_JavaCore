import java.util.Scanner;

public class BT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n:");
		int n = sc.nextInt();
		int sodu,Tong =0;
		while(n>0) {
			sodu=n%10;
			n=n/10;
			Tong+=sodu;
		}
		System.out.println("Tong cac chu so la:"+Tong);
		
	}

}
