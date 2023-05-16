
/*Elaborar um programa em Java que faça uma matriz 3x3 de números inteiros digitados pelo usuário. Exibir a matriz, somar os elementos da diagonal e exibir a soma.*/
package fatec;

import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int matriz[][] = new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Insira o elemento [%d][%d] ", linha + 1, coluna + 1);
                matriz[linha][coluna] = sc.nextInt();
                soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
            }
        }

        System.out.println("\n A matriz ficou: \n");
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("\t %d \t ", matriz[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("Soma: " + soma);
        
    }

}
