package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào 0 để quy đổi VND sang USD, 1 để quy đổi USD sang VND");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Nhập vào số tiền bạn muốn quy đổi:");
                    float vnd = scanner.nextFloat();
                    float usd = vnd / 23000;
                    System.out.println(vnd + " VND = " + usd + " USD");
                    break;

                case 1:
                    System.out.println("Nhập vào số tiền bạn muốn quy đổi:");
                    usd = scanner.nextFloat();
                    vnd = usd * 23000;
                    System.out.println(usd + " USD = " + vnd + " VND");
                    break;
            }
        }
    }

