package com.company;
import java.util.Scanner;
public class cwh_29_PS_6_1{
    public static void main(String[] args){
        // Problem 1
        float [] marks ;
        float sum = 0;
        int n;
        float percent,m,ma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number of subjects:\n");
        n = sc.nextInt();
        System.out.println("Give the max marks:");
        m = sc.nextFloat();
        ma = n*m;
        marks = new float[n];
        System.out.println("Enter the marks of subjects:");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextFloat();
        }
        for(int i=0; i<n; i++){
            sum = sum + marks[i];
        }
        percent = (float)(sum/ma)*100;
        System.out.println("The sum is:" + sum);
        System.out.print("Percentage:" +percent);
        System.out.print("%");
    }
}