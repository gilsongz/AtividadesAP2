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
public class Exercicio05 {
    /*
     5 - Criar um programa que receba 10 valores inteiros e armazene-os em um 
     vetor. Posteriormente o programa deve varrer o vetor e mostrar a soma, a 
     média, o vetor em ordem inversa e gerar um novo vetor com o quadrado dos 
     valores.
     */

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (double) soma / 10);
        System.out.print("Vetor em ordem inversa: [");
        for (int i = 10; i > 0; i--) {
            System.out.print(vetor[i - 1]);
            if (i > 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        int[] vetorQuadrado = new int[10];
        System.out.print("Vetor quadrado: [");
        for (int i = 0; i < 10; i++) {
            vetorQuadrado[i] = vetor[i]*vetor[i];
            System.out.print(vetorQuadrado[i]);
            if (i < 9) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

}
