package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = sc.nextInt();
        String SoCanDoc = "";
        switch (number) {
            case 0: {
                SoCanDoc = "zero";
                break;
            }
            case 1: {
                SoCanDoc = "one";
                break;
            }
            case 2: {
                SoCanDoc = "two";
                break;
            }
            case 3: {
                SoCanDoc = "three";
                break;
            }
            case 4: {
                SoCanDoc = "for";
                break;
            }
            case 5: {
                SoCanDoc = "fire";
                break;
            }
            case 6: {
                SoCanDoc = "six";
                break;
            }
            case 7: {
                SoCanDoc = "seven";
                break;
            }
            case 8: {
                SoCanDoc = "eight";
                break;
            }
            case 9: {
                SoCanDoc = "night";
                break;
            }
            case 10: {
                SoCanDoc = "ten";
                break;
            }
            case 11: {
                SoCanDoc = "juuichi";
                break;
            }
            case 12: {
                SoCanDoc = "juuni";
                break;
            }
        }
        System.out.println("Đọc là: " + SoCanDoc);

    }

}
