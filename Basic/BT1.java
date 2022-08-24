import java.util.Scanner;

public class BT1 {
    public void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n= sc.nextInt();
        int sum=0;
        if(n%2==0) {
        	for(int i=0;i<=n;i+=2) {
        		sum+=i;
        	}
        }else if(n%2!=0) {
        	for(int i=1;i<=n;i+=2) {
        		sum+=i;
        	}
        }
        System.out.println(sum);
    }
    public void sumPhanso() {
    	Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so nguyen n:");
        int n= sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=1/(float)i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        BT1 bt= new BT1();
        bt.sum();
        bt.sumPhanso();
    }
}
