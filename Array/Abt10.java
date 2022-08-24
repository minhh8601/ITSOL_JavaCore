package src.Array;

import java.util.Scanner;

public class Abt10 {
        public static void main (String[] args)
        {
            int n, sumchinh = 0,sumphu=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n:");
            n = sc.nextInt();
            int a[][] = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Nhap vao phan tu A[" + i + "][" + j + "]=");
                    a[i][j] = sc.nextInt();


                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        sumchinh+=a[i][j];
                    }
                    if(j== n-i+1){
                        sumphu+=a[i][j];
                    }
                }
            }
            for(int []x:a){
                for(int y:x) System.out.print(y+ " ");
                System.out.println("");
            }
            System.out.print("Tong chu so duong cheo chinh la: "+sumchinh);
            System.out.println();
            System.out.println("Tong chu so duong cheo phu la: "+sumphu);
        }
}
