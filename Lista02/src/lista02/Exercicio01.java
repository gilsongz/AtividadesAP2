package lista02;

import java.util.Scanner;

/**
 *
 * @author Gilson de Oliveira Junior
 */
public class Exercicio01 {

    /*
    1) Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e 
    mostre o nome da pessoa mais velha e o nome da pessoa mais nova.
     */

    public static void main(String[] args) {
        String nomes[] = new String[3];
        int idades[] = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i+1);
            nomes[i] = sc.next();
            System.out.printf("Digite a idade da pessoa %d: ", i+1);
            idades[i] = sc.nextInt();
        }
        int maior = idades[0], menor = idades[0], posMenor = 0, posMaior = 0;
        for (int i = 0; i < 3; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                posMaior = i;
            }
            if (idades[i] < menor) {
                menor = idades[i];
                posMenor = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s (%d anos)\n", nomes[posMaior],
                idades[posMaior]);
        System.out.printf("Pessoa mais nova: %s (%d anos)", nomes[posMenor],
                idades[posMenor]);
    }

}
