package src.Array;

import java.util.Scanner;

public class Abt8 {
    public static int[][] tich(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int l = 0; l < a[0].length; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;

    }

    public static int[][] nhap(int m, int n) {
        int[][] result = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap vao phan tu x["+i+"]["+j+"]=");
                result[i][j] = sc.nextInt();
            }
        }
        return result;
    }


    public static void xuat(int[][] a) {
        for(int []x:a){
            for(int y:x) System.out.print(y+ " ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k;
        int[][] a, b,c;
        System.out.println("Nhap co ma tran m,n,k: ");
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        a = nhap(m, n);
        b = nhap(n, k);
        System.out.println("Ma trận a:");
        xuat(a);
        System.out.println("Ma trận b:");
        xuat(b);
        System.out.println("Kết quả: ");
        c = tich(a, b);
        xuat(c);

    }
}


