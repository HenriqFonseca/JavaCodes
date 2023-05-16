package fatec;

//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representaem relação ao total de eleitores.

import java.util.Scanner;



public class JavaChallenge {

    public static void main(String[] args) {
        double totalEleitores;
        double votoValido, votoBranco, votoNulo;
        double prcntValido, prcntBranco, prcntNulo;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de votos válidos");
        votoValido = sc.nextDouble();
        System.out.println("insira a quantidade de votos Nulos");
        votoNulo = sc.nextDouble();
        System.out.println("insira a quantidade de votos Branco");
        votoBranco = sc.nextDouble();
        
        totalEleitores = votoValido + votoBranco + votoNulo;
        System.out.println("Quantidade total de eleitores:" + totalEleitores);
        
        prcntValido = (votoValido / totalEleitores) *100;
        prcntBranco = (votoBranco / totalEleitores)*100;
        prcntNulo = (votoNulo / totalEleitores) *100;
        
        System.out.println("Porcentagem de votos validos: " 
                + prcntValido
                + "%");
        System.out.println("Porcentagem de votos Nulos: " 
                + prcntNulo
                + "%");
        System.out.println("Porcentagem de votos em Branco: " 
                + prcntBranco
                + "%");
        
    }
    
}
