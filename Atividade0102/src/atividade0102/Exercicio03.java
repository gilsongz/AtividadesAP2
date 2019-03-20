/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0102;

import java.util.Scanner;

/**
 *
 * @author gilso
 */
public class Exercicio03 {
    /*
     3 - Criar um programa que leia dois números e mostre o maior e o menor.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double primeiroNum = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double segundoNum = sc.nextDouble();

        if (primeiroNum > segundoNum) {
            System.out.println("Maior: " + primeiroNum);
            System.out.println("Menor: " + segundoNum);
        } else if (primeiroNum == segundoNum) {
            System.out.println("Os numeros são iguais");
        }
        else{
            System.out.println("Maior: " + segundoNum);
            System.out.println("Menor: " + primeiroNum);
        }
    }
}
