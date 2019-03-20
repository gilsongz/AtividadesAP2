/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade0102;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author gilso
 */
public class Exercicio02 {
    /*
    2 - Criar um programa que leia um valor decimal e mostre esse valor 
    arredondado usando os três métodos de arredondamento da classe Math.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();
        System.out.println("Math.roud(): " + Math.round(numero));
        System.out.println("Math.ceil(): " + Math.ceil(numero));
        System.out.println("Math.floor(): " + Math.floor(numero));
    }
}
