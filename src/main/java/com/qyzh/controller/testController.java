package com.qyzh.controller;

public class testController {
    public static void main(String args[]){
        //等腰三角形
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
