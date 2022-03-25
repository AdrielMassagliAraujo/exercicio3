/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = v1.nextInt();
        int resultado = 0;
        int i = 1;

        while(i <= num1){
            resultado += i;
            i = i + 1;
            System.out.println(resultado);
        }
    }
}
