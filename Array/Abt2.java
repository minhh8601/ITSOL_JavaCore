package src.Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Abt2 {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu A["+i+"]=");
            A[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.println("sap xep thu tu tang dan:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+"\t");
        }
    }
}
