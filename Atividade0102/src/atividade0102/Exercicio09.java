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
public class Exercicio09 {
    /*
     9 - Criar um programa que leia um cpf e valide. Pesquise a fórmula para 
     validação de CPF na internet.
    
     Cálculo do primeiro dígito:
     Separar os 9 dígitos e multiplicar cada um pelos números de 2 a 10 da 
     direita para a esquerda (ex: 111444777 → 1*10+1*9+1*8+4*7+4*6+4*5+7*4+7*3+7*2).
     A soma é dividida por 11. Se o  resto da divisão for < 2, o dígito é 0, 
     senão, o dígito será 11 – o resto da divisão.
     Ex: 111444777 → soma = 162/11 = 14 resto 8, logo o dígito será 11-8 = 3 → 111444777.3X
     Cálculo do segundo dígito:
     Acrescenta o primeiro dígito calculado e executa a mesma regra 
     multiplicando de 2 a 11 da direita para a esquerda 
     (ex: 1114447773 → 1*11+1*10+1*9+4*8+4*7+4*6+7*5+7*4+7*3+3*2). 
     A soma é dividida por 11. Se o  resto da divisão for < 2, o dígito é 0, 
     senão, o dígito será 11 – o resto da divisão.
     Ex: 111444777.3 → soma = 204/11 = 18 resto 6, logo o dígito será 11-6 = 5 → 111444777.35
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um cpf (sem pontos ou espaços): ");
        String cpf = sc.next();

        boolean cpfValido = true;
        int soma = 0;

        for (int i = 0; i < 9; i++) { //Faz varredura na string para validação
		
            if (cpf.length() != 11) {//Verifica se o cpf tem 11 digitos
                cpfValido = false;
                break;
            }
			
            if (Character.isDigit(cpf.charAt(i))) {//Verifica se cada digito é um numero
			
                soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i); //Soma cada digito multiplicado por seu respectivo peso
				
                if (i == 8) {//Se os 9 primeiros caracteres são numeros verifica se o decimo caractere confere com a validação
				
                    //System.out.println("Primeira soma: " + soma + " Resto: " + soma % 11);
					
                    if (soma % 11 < 2) { //Se o resto da divisão por 11 é menor que 2 o decimo digito deve ser 0
                        if (cpf.charAt(9) != '0') {
                            cpfValido = false;
                            break;
                        }
                    } else if (Character.getNumericValue(cpf.charAt(9)) != 11 - soma % 11) {//Senão o decimo digito deve ser 11 – o resto da divisão
                        cpfValido = false;
                        break;
                    }
                    soma = 0; //Se o programa chegou aqui o primeiro digito verificador é valido.
					
                    for (int j = -1; j < 9; j++) {//Inicia segunda varredura para testar o segundo digito verificador.
					
                        soma += Character.getNumericValue(cpf.charAt(j + 1)) * (10 - j); //Soma cada digito multiplicado por seu respectivo peso
						
                        if (j + 1 == 9) {
							
                            //System.out.println("Segunda soma: " + soma + " Resto: " + soma % 11);
							
                            if (soma % 11 < 2) { //Se o resto da divisão por 11 é menor que 2 o decimo primeiro digito deve ser 0
                                if (cpf.charAt(10) != '0') {
                                    cpfValido = false;
                                    break;
                                }
                            } else if (Character.getNumericValue(cpf.charAt(10)) != (11 - soma % 11)) {//Senão o decimo primeiro digito deve ser 11 – o resto da divisão
                                cpfValido = false;
                                break;
                            }
                        }
                    }
                }
            } else {//há um caractere não numerico na string
                cpfValido = false;
                break;
            }
        }
        System.out.print(cpfValido ? "CPF Válido!" : "CPF Invalido!");//Mostra resultado ao usuario.
    }
}
