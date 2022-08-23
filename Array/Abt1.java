package src.Array;

import java.util.Scanner;

public class Abt1 {
    public static void main(String[] args) {
        int n, kt=1;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu mang:");
            n=sc.nextInt();

        }while(n<=0);
        int A[]=new int[n];
        System.out.println("Nhap gia tri cac phan tu cua mang");
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"]=");
            A[i]= sc.nextInt();
        }
        //kiem tra mang dao nguoc
        for(int i=0;i<n/2;i++){
            if(A[i]!=A[n-i-1]){
                kt=0;
                break;
            }
        }
        if(kt==0){
            System.out.println("Mang vua nhap khong phai la mang doi xung");
        }else{
            System.out.println("Mang vua nhap la mang doi xung");
        }
    }
}
