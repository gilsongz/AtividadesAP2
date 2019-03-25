/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio03 {

    /*
    3) Uma pesquisa sobre algumas características físicas da população de uma determinada região
coletou os seguintes dados, referentes a cada habitante, para serem analisados:
- sexo (masculino, feminino)
- cor dos olhos (azuis, verdes, castanhos)
- cor dos cabelos (louros, castanhos, pretos)
- idade em anos.
Para cada habitante, foi perfurado um cartão com esses dados, e o último cartão, que não
corresponde a ninguém, conterá o valor da idade igual a -1. Implementar um algoritmo que
determine e escreva:
a) a maior idade dos habitantes;
b) porcentagem de indivíduos do sexo feminino cuja idade esteja entre 18 e 35 anos, inclusive,
e que tenham olhos verdes e cabelos louros
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList();
        ArrayList<String> sexos = new ArrayList();
        ArrayList<String> corOlhos = new ArrayList();
        ArrayList<String> corCabelos = new ArrayList();
        ArrayList<Integer> idades = new ArrayList();
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf("Digite a idade do participante %d ou -1 para encerrar a pesquisa: ", cont + 1);
            int idade = sc.nextInt();

            if (idade == -1) {
                System.out.println("Finalizando pesquisa.");
                if (cont == 0) {
                    System.out.println("Nenhum participante cadastrado.");
                    break;
                }
                
                int maiorIdade = idades.get(0);
                ArrayList<Integer> posMulheres = new ArrayList();
                ArrayList<Integer> posMulheresLoiras = new ArrayList();
                ArrayList<Integer> posMulheresOlhoVerde = new ArrayList();
                ArrayList<Integer> posMulheresJovens = new ArrayList();
                
                for (int i = 0; i < idades.size(); i++) {
                    if (maiorIdade < idades.get(i)) {
                        maiorIdade = idades.get(i);
                    }
                }
                
                // TODO fazer a letra b
                
                System.out.println();
                System.out.printf("A maior idade dentre os participantes é %d.", maiorIdade);
                
                break;
            }

            System.out.printf("Digite o nome do participante %d: ", cont + 1);
            String nome = sc.next();
            System.out.printf("Digite o sexo do participante %d: ", cont + 1);
            String sexo = sc.next();
            System.out.printf("Digite cor dos olhos do participante %d: ", cont + 1);
            String corOlho = sc.next();
            System.out.printf("Digite cor do cabelo do participante %d: ", cont + 1);
            String corCabelo = sc.next();

            idades.add(idade);
            nomes.add(nome);
            sexos.add(sexo);
            corOlhos.add(corOlho);
            corCabelos.add(corCabelo);
        }
    }
}
