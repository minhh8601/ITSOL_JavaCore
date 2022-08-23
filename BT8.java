
public class BT8 {

	public static void cauA() {
		int count=0;
		for(int i=100000;i<999999;i++) {
			int tn=0;
			int n=i;
			while(n>0) {
				tn=tn*10+n%10;
				n/=10;
			}
			if(i==tn) {
				System.out.printf("%10d",i);
				count++;
				if(count%10==0) {
					System.out.println();
				}
			}
		}
	}
	public static void cauB(){
		int count=0;
		for(int i=100000;i<999999;i++) {
			int tn=0;
			int n=i;
			while(n>0) {
				tn=tn*10+n%10;
				n/=10;
			}
			if(i==tn) {
				if(tongChuso(i)%10==0){
					System.out.printf("%10d",i);
					count++;
					if(count%10==0) {
						System.out.println();
					}
				}
			}
		}
	}
	public static int tongChuso(int n){
			int tong=0;
			while(n>0){
				tong+=n%10;
				n=n/10;
			}
			return tong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BT8 bt8= new BT8();
		System.out.println("So thuan nghich 6 co chu so:");
		bt8.cauA();
		System.out.println("");
		System.out.println("");
		System.out.println("Sothuan nghich co 6 chu so ma tong chu so chia het cho 10:");
		bt8.cauB();
	}

}
