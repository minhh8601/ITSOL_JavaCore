package src.Array;

import java.util.Scanner;

public class Abt6 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang:");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Nhap phan tu cua mang:");
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu A["+i+"]= ");
            A[i]=sc.nextInt();
        }
        System.out.print("Nhap phan tu k=");
        int k= sc.nextInt();
        //Sap xep tang dan
        sapXep(A);
        System.out.print("Sap xep theo thu tu tang dan:");
        hien(A);
        System.out.printf("\nChen phan tu "+k+ " vao mang");
        A=insert(A,k);
        System.out.println("\nMang sau khi chen:");
        hien(A);

    }
    public static void sapXep(int[]A){
        int temp=A[0];
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                }
            }
        }
    }
    public static int[] insert(int[]A,int k){
        int B=A.length-1;
        int C=A.length;
        int[]D=new int[C+1];
        boolean inserted=false;
        for(int i=C; i>=0;i--){
            if(B>-1 && A[B]>k){
                D[i]=A[B--];
            }else{
                if(!inserted){
                    D[i]=k;
                    inserted=true;
                }else{
                    D[i]=A[B--];
                }
            }
        }
        return D;
    }
    public static void hien(int[]A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"");
        }
    }
}
