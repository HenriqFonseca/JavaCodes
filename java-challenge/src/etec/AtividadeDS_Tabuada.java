package etec;

import java.util.Scanner;

public class AtividadeDS_Tabuada {

    public static void main(String[] args) {
        
        /* valor que quero multiplicar*/
        int valor;
        
        /*captura os dados assim como o "scanf" em C++*/ /*Cria a variável teclado*/
        Scanner teclado = new Scanner (System.in);
        
        /*Escrevendo "sout" e apertando TAB, facilita a escrever a linha abaixo*/
        System.out.println("Digite o valor da tabuada: ");
        
        /*A variavel "valor" será igual ao que for escrito pelo usuario (Através do "Scanner")quando o codigo for executado (O usario define o valor da variavel)*/
        valor=teclado.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            
           /*Printa a variavel i*/       /* O "+" é utilizado para concatenar, assim como o "." em PHP*/
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        
    }
    
}
