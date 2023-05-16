
package fatec;

import java.util.Scanner;

public class matrizNotas {

  /* Elaborar um programa em Java que crie uma matriz 5x4 onde serão armazenadas notas (valoresreais) digitados pelo usuário. Depois, exibir a matriz, verificar quantas notas são maiores ou igual a 7, o que refere-se aos alunos aprovados, e quantas são menores que 7. então exibir na tela quantos alunos estão aprovados e quantos estão reprovados.  */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        double armazenaImpar[] = new double[12];
        double matriz[][] = new double[5][4];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Insira o elemento [%d][%d] ", linha + 1, coluna + 1);
                matriz[linha][coluna] = sc.nextDouble();
                if (matriz[linha][coluna] >=7) 
                {
                    aprovados++;
                }else{ reprovados++; }
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("\t %.2f \t ", matriz[linha][coluna]);
            }
            System.out.println();
        }
        
        System.out.println("aprovados: " + aprovados +
                "\nreprovados: " + reprovados);
        
    }
    
}
