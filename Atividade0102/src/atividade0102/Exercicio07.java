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
public class Exercicio07 {
    /*
     7 - Criar um programa que entre com o nome e o número de telefone e valide 
     os dados. Os nomes só podem ter caracteres alfabéticos e o telefone só 
     numéricos. Use Character.isDigit().
     */

    public static void main(String[] args) {
        String nome = new String();
        String telefone = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        nome = sc.next();
        System.out.print("Digite um telefone: ");
        telefone = sc.next();
        int valid = 0;
        for (int i = 0; i < nome.length(); i++) {
            if (Character.isDigit(nome.charAt(i))) {
                System.out.println("Nome invalido!");
                valid = 1;
                break;
            }
        }
        for (int i = 0; i < telefone.length(); i++) {
            if (!Character.isDigit(telefone.charAt(i))) {
                System.out.println("Telefone invalido!");
                valid = 1;
                break;
            }
        }
        if (valid == 0) {
            System.out.println("Entradas validas.");
        }
    }

}
