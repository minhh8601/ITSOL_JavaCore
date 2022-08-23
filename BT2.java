import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao n:");
		int n= sc.nextInt();
		int dem=0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				dem++;
				System.out.println(i+"\t");
			}			
		}System.out.println("So uoc la:"+dem);

	}

}
