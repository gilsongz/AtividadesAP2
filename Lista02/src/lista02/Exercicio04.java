package lista02;

import java.util.Scanner;

/**
 *
 * @author Gilson de Oliveira Junior
 */
public class Exercicio04 {

    /*
     4) Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no
     último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito
     de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do
     crédito. (use o comando caso-de e não faça repetições)
     Saldo médio Percentual
     de 0 a 200 nenhum crédito
     de 201 a 400 20% do valor do saldo médio
     de 401 a 600 30% do valor do saldo médio
     acima de 601 40% do valor do saldo médio
    
    *Não entendi a parte do "caso-de".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o saldo médio no ultimo ano: ");
        float saldoM = sc.nextFloat();
        float credito = 0f;
        if (saldoM >= 201 && saldoM <= 400) {
            credito = saldoM * 1.2f;
        } else if (saldoM >= 401 && saldoM <= 600) {
            credito = saldoM * 1.3f;
        } else if (saldoM > 600) {
            credito = saldoM * 1.4f;
        }
        System.out.printf("Saldo medio: R$%.2f\nCrédito: R$%.2f\n", saldoM,
                credito);
    }

}
