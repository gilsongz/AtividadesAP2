package lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gilson de Oliveira Junior
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
        int cont = 0, alvo = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("Formulario #%d:\n", cont);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Sexo (M/F): ");
            String sexo = sc.next();
            System.out.print("Cor dos olhos (azuis/verdes/castanhos: ");
            String corOlho = sc.next();
            System.out.printf("Cor do cabelo (loiro/castanho/preto)");
            String corCabelo = sc.next();
            idades.add(idade);
            nomes.add(nome);
            sexos.add(sexo);
            corOlhos.add(corOlho);
            corCabelos.add(corCabelo);
            if ("F".equals(sexo) && idade < 36 && idade > 17
                    && "verdes".equals(corOlho)
                    && "loiro".equals(corCabelo)) {
                alvo++;
            }
            cont++;
            System.out.printf("Cont = %d\nAlvo = %d\n", cont, alvo);
        } while (idades.get(idades.size() - 1) != -1);

        int maiorIdade = idades.get(0);
        if (maiorIdade != -1) {
            for (int i = 0; i < idades.size(); i++) {
                if (maiorIdade < idades.get(i)) {
                    maiorIdade = idades.get(i);
                }
            }
            System.out.println();
            System.out.printf("A maior idade dentre os participantes é %d.\n",
                    maiorIdade);
            System.out.printf("A porcentagem de mulheres loiras dos olhos verdes"
                    + " entre 18 e 35 anos é de %.2f%%.\n", (((float)alvo / 
                            (float)(cont-1)) * 100f));
        } else {
            System.out.println("Nenhum participante cadastrado.");
        }

        // TODO fazer a letra b
    }
}
