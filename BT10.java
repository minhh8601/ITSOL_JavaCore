package src;

public class BT10 {
    public void lietke7chuso(){

        System.out.println("Danh sách các số: ");
        for (int i = 1000000; i <9999999 ; i++) {
            if(songuyeto(i)){
                if (checkcacchuso(i)){
                    if (songuyeto(daonguocso(i))){
                        System.out.printf("%10d",i);
                    }

                }

            }
        }
    }

    public boolean songuyeto(int n){

        if (n < 2) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkcacchuso(int n){
        while (n>0){
            if((n%10)!=2 && (n%10)!=3 && (n%10)!=5 && (n%10)!=7){
                return false;
            }
            n=n/10;
        }
        return true;
    }

    public int daonguocso(int n){
        int tmp=0;
        while(n != 0) {
            int digit = n % 10;
            tmp = tmp * 10 + digit;
            n /= 10;
        }
        return tmp;
    }

    public boolean checksodaonguoc(int n){
        if(songuyeto(n)!=true) {

        }
        return true;
    }

    public static void main(String[] args) {

        BT10 bt10=new BT10();

        bt10.lietke7chuso();







    }
}
