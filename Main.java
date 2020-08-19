package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        //способ 1 - встроенные методы;
        String bin = in.nextLine();
        int int1= Integer.parseInt(bin,2);
        System.out.printf("Десятичное число: %d \n", int1);
        //способ 2 - c использованием поразрядной операции;
        char[] bin_arr = bin.toCharArray();
        int int2 = 0;
        for (int i =0 ; i <= bin_arr.length-1; i++){
            int2+=(bin_arr[i]-'0')*2 << (bin_arr.length-i-2);
        }
        System.out.printf("Десятичное число: %d \n", int2);
    }
}
