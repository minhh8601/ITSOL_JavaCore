package src.Array;

import java.util.Scanner;

public class Abt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang:");
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[A.length];
        int dem;
        int max=0;
        System.out.println("Nhap vao gia tri cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu A[" + i + "]=");
            A[i] = sc.nextInt();
            B[i]=-1;
        }
        for (int i = 0; i < n; i++) {
            dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {
                    dem++;
                    B[j] = 0;
                }
            }
            if (B[i] != 0) {
                B[i] = dem;
            }
        }
        max=B[0];
        for(int i=1;i<n;i++){
            if(B[i]>max){
                max=B[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]);
        }
        System.out.println("");
        System.out.println("So lan xuat hien cua cac phan tu la:");
        for(int i=0;i<n;i++){
            if(B[i]!=0){
                System.out.println("Phan tu"+"\t"+A[i]+"\t"+"xuat hien" +"\t"+B[i]+ "\t"+"lan");
            }
        }
        for(int i=0;i<n;i++){
            if(B[i]==max){
                System.out.println("Phan tu"+"\t" +A[i]+ "\t"+"Xuat hien nhieu nhat"+"\t"+max);
            }
        }
    }
}
