/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0102;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {
    /*
    1 - Criar um programa que leia dois nome e mostre a quantidade de letras de 
    cada um, os nomes em maiúsculo, e se são iguais ou diferentes. 
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite no primeiro nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite no segundo nome: ");
        String nome2 = sc.nextLine();
        System.out.println();
        System.out.println("Primeiro nome: " + nome1.toUpperCase());
        System.out.println("O primeiro nome tem " + nome1.length() + " letras.");
        System.out.println();
        System.out.println("Segundo nome: " + nome2.toUpperCase());
        System.out.println("O segundo nome tem " + nome2.length() + " letras.");
        System.out.println();
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são Diferentes!");
        }

    }
}
