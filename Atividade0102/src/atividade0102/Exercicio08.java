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
public class Exercicio08 {
    /*
     Criar um programa que o usuário informe uma quantidade X de funcionários e 
     a seguir informe os X nomes e X salários. O programa deve armazenar os dados
     em 2 vetores. Posteriormente, o programa deve varrer o vetor de salários e 
     mostrar:
     •	O maior salário (posição, nome e salário)
     •	O menor salário (posição, nome e salário)
     •	A média salarial
     •	Os maiores que a média (nomes e salários)
     •	Os menores que a média (nomes e salários)

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionarios: ");
        int qnt = sc.nextInt(), posMaior = 0, posMenor = 0;
        double salarios[] = new double[qnt], maior = 0, menor = 0, soma = 0;
        String nomes[] = new String[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.print("Digite o nome do funcionario " + i + " : ");
            nomes[i] = sc.next();
            System.out.print("Digite o salário de " + nomes[i] + " : ");
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
            if (i == 0) {
                maior = salarios[i];
                menor = salarios[i];
            } else {
                if (salarios[i] > maior) {
                    maior = salarios[i];
                    posMaior = i;
                }
                if (salarios[i] < menor) {
                    menor = salarios[i];
                    posMenor = i;
                }
            }
        }
        System.out.println("Maior salario:");
        System.out.println("Pos " + posMaior + ", " + nomes[posMaior] + ", R$"
                + salarios[posMaior]);
        System.out.println("Menor salario:");
        System.out.println("Pos " + posMenor + ", " + nomes[posMenor] + ", R$"
                + salarios[posMenor]);
        double media = soma / qnt;
        System.out.println("Media salarial: " + media);

        System.out.println("Salarios maiores que a media:");
        for (int i = 0; i < qnt; i++) {
            if (salarios[i] > media) {
                System.out.println("Pos " + i + ", " + nomes[i] + ", R$"
                        + salarios[i]);
            }
        }
        System.out.println("Salarios menores que a media:");
        for (int i = 0; i < qnt; i++) {
            if (salarios[i] < media) {
                System.out.println("Pos " + i + ", " + nomes[i] + ", R$"
                        + salarios[i]);
            }
        }
    }
}
