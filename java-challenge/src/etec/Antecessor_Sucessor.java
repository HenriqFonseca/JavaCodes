


package etec;

import java.util.Scanner;

public class Antecessor_Sucessor {

    public static void main(String[] args) {
        int valor ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        valor = teclado.nextInt();
        System.out.println("Antecessor:" + (valor - 1) + "\nNumero escolhido:" + valor + "\nSucessor:" + (valor + 1));
                
        
    }
    
}
