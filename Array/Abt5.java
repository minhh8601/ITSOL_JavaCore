package src.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Abt5 {
    public static void nhap(){
        int m,n;
        int[]a;
        int[]b;
        int k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu mang b:");
        n=sc.nextInt();
        System.out.println("Nhap so phan tu mang a:");
        m= sc.nextInt();
        a=new int[m+n];
        b= new int[n];
        for(int i=0;i<m;i++){
            System.out.println("Nhap a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Nhap b["+i+"]= ");
            b[i]= sc.nextInt();;
        }
        System.out.print("Nhap vi tri chen k:");
        k=sc.nextInt();
        System.out.print("Mang a[] :");
        for(int i=0;i<m;i++)
            System.out.print(a[i]+" ");
        chen(a,b,m,k);
    }
    public static void chen(int[]a, int[]b,int m,int k){
        if(k>=m){
            for(int i=0;i<b.length;i++)
                a[i+m]=b[i];
        }else if(k<=0){
            for(int i=a.length-1;i>=b.length;i--)
                a[i]=a[i-b.length];
            for(int i=0;i<b.length;i++)
                a[i]=b[i];
        }else{
            for(int i=a.length-1;i>=k+b.length;i--)
                a[i]=a[i-b.length];
            for(int i=k; i<k+b.length;i++)
                a[i]=b[i-k];
        }
        hien(a,b);
    }
    public static void hien(int[]a, int[]b){
        System.out.print("Mang b[]: ");
        for(int x:b)
            System.out.print(x+" ");
        System.out.println("");
        System.out.print("Mang sau khi chen:");
        for(int x:a)
            System.out.print(x+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        nhap();
    }
}

