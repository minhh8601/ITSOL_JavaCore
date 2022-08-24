import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n:");
		int n= sc.nextInt();
		int i=2;
		if(n==1) {
			System.out.println(n+"="+n);
		}else {
			System.out.print(n+"=");
			while(n!=1) {
				if(n%i==0) {
					System.out.print(i+"x");
					n/=i;
				}else {
					++i;
				}
			}
		}
	}

}
