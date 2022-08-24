import java.util.Scanner;

public class BT3 {
	public static int UCLN(int a, int b) {
		if(b==0) return a;
		return UCLN(b,a%b);
	}
	public static int BCNN(int a, int b) {
		return(a*b)/UCLN(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so nguyen a:");
		int a=sc.nextInt();
		System.out.println("Nhap so nguyen b:");
		int b=sc.nextInt();
		System.out.println("UCLN cua"+a+"va"+b+"la:"+UCLN(a,b));
		System.out.println("BCNN cua"+a+"va"+b+"la:"+BCNN(a,b));
	}

}
