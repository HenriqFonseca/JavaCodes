package fatec;

import java.util.Scanner;

/* Elaborar um programa em Java para criar uma matriz3x4, para o usuário preencher com números inteiros. Depois, exibir a matriz, mostrar quantos números ímpares existem, e quais são eles. */
public class matrizImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int impar = 0;
        int armazenaImpar[] = new int[12];
        int matriz[][] = new int[3][4];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("Insira o elemento [%d][%d] ", linha + 1, coluna + 1);
                matriz[linha][coluna] = sc.nextInt();
                if(matriz[linha][coluna] %2 != 0){
                armazenaImpar[impar] = matriz[linha][coluna];  
                impar++;
                }
            }
        }
        System.out.println("\n A matriz ficou: \n");
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("\t %d \t ", matriz[linha][coluna]);
            }
            System.out.println();
        }
        
        System.out.print("numeros impares: " +impar + "\n"
        + "São os seguintes numeros: ");
        
        for (int i = 0; i < armazenaImpar.length; i++) {
            if (armazenaImpar[i] != 0) {
                System.out.print(armazenaImpar[i] + " ");
            }
            
            
        }
    }

}
