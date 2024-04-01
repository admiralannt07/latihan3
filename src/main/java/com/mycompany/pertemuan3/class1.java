/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan3;
import java.util.Scanner;


/**
 *
 * @author A-10
 */
public class class1 
{
    public static void main(String[] args) 
    {
        int varA = 10;
        int varB = 20;
        System.out.println(varA + varB);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int varX = input.nextInt();
        
        System.out.println("Masukkan angka kedua: ");
        int varY = input.nextInt();
        
        System.out.println("Hasil dari angka pertama dan kedua" + varX + varY);
    }
}
