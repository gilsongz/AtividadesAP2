package lista02;

import java.util.Scanner;

/**
 *
 * @author Gilson de Oliveira Junior
 */
public class Exercicio02 {

    /*
    2) O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do
distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que leia o custo de fábrica
de um carro e escreva o custo ao consumidor.
     */

    public static void main(String[] args) {
        float custo;
        float tributos = 1.73f; // 28% + 45%
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o custo de fabrica do carro: ");
        custo = sc.nextFloat();
        System.out.printf("O custo desse carro para o consumidor é de R$%.2f.", custo*tributos);
    }
}
