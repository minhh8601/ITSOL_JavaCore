package src.Array;

import java.util.Scanner;

public class Abt9 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        System.out.println("Nhap m:");
        m = sc.nextInt();
        int nm = n*m;
        int A[] = new int[nm];

        for (int i = 0; i < nm; i++) {
            System.out.print("Nhap phan tu A["+i+"]=");
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < nm ; i++){
            for(int j = i+1 ; j < nm ; j++){
                if(A[i] > A[j]){
                    int x = A[j];
                    A[j] = A[i];
                    A[i] = x;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(A[i*m+j]+" ");
            }
            System.out.println();
        }
    }
}
