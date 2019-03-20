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
public class Exercicio06 {
    /*
     6 - Armazenar em um vetor uma quantidade de números informada pelo usuário 
     inicialmente. Mostrar o vetor em ordem crescente e em ordem decrescente. 
     Solicitar um novo valor do usuário e informar se existe ou não no vetor e 
     em que posição.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de numeros: ");
        int qnt = sc.nextInt();
        int vetor[] = new int[qnt];
        for (int i = 0; i < qnt; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        int aux;
        for (int i = 0; i < qnt; i++) {
            for (int j = 0; j < qnt; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.print("Vetor em ordem crescente: [");
        for (int i = 0; i < qnt; i++) {
            System.out.print(vetor[i]);
            if (i < qnt - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        for (int i = 0; i < qnt; i++) {
            for (int j = 0; j < qnt; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.print("Vetor em ordem decrescente: [");
        for (int i = 0; i < qnt; i++) {
            System.out.print(vetor[i]);
            if (i < qnt - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("Outro numero: ");
        int numero = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < qnt; i++) {
            if (vetor[i] == numero) {
                System.out.println(numero + " está no vetor na posição " + i + ".");
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.print(numero + " não está no vetor.");
        }
        
    }
}
