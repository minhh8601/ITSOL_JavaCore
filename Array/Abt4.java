package src.Array;

import java.util.Scanner;

public class Abt4 {
    public static void main(String[] args) {
        int n,x,index=-1,min=Integer.MAX_VALUE;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        System.out.println("Nhap x:");
        x=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu A[" + i + "]=");
            A[i] = sc.nextInt();
        }
        //check, tim ket qua
        for(int i=0;i<n;i++){
            int currentMin = getMin(A[i],x);
            if(nguyenTo(A[i])&&currentMin<min){
                min=currentMin;
                index=i;
            }
        }
        if(index!=-1){
            System.out.println("Chi so phan tu:"+index+", gia tri= "+A[index]);
        }else{
            System.out.println("Khong ton tai gia tri thoa man");
        }
    }
    public static int getMin(int a,int x){
        return Math.abs(a-x);
    }
    public static boolean nguyenTo(int n){
        if(n<2){
            return false;
        }
        int a=(int) Math.sqrt(n);
        for(int i=2;i<=a;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
}
