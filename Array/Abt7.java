package src.Array;

import java.util.Scanner;

public class Abt7 {
    public static void main(String[] args) {
        nhap();
    }
    public static void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n=sc.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu A[ "+i+" ]=");
            A[i]=sc.nextInt();
        }
        duongChay(A);
    }
    public static void hien(int[]A, int[]B){
        int max=0;
        for(int x:B){
            if(x>max){
                max=x;
            }
        }
        System.out.print("Mang A[]: ");
        for(int x:A)
            System.out.println(x+"");
        int vt=0;
        for(int x:B){
            if(x==max)
                System.out.println("Vi tri: "+vt+" do dai "+max);
            vt+=x;
        }
    }
    public static void duongChay(int[]A){
        int index=0;
        int[]B=new int[A.length];
        for(int i=0;i<A.length-1;i++){
            if(A[i+1]<A[i]){
                B[index]++;
                index++;
            }else{
                B[index]++;
            }
        }
        hien(A,B);
    }
}
