/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0102;

import java.util.Random;

/**
 *
 * @author gilso
 */
public class Exercicio04 {
    /*
    4 - Criar um programa que retorne um número aleatório de 0 a 100.
    */
    public static void main(String[] args){
        Random gerador = new Random();
        System.out.println(gerador.nextInt(101));
    }
    
}
