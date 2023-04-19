package etec;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
//        valor de X no somatorio
        int valor = 2;
//        valor que está acima do SIGMA, dizendo o total de vezes que irá ser feito as somas (Coloquei 4 pq começa do 0)
        int tentativa = 4;
//        equanto i for menor que tentativa (4), vai realizar valor(2) + (valor(2)elevado a 2) (O "+ Só é usado em concatenação quando ter um texto")
        for(int i = 0; i<tentativa; i++){
            
//            Só pra ficar melhor visualmente
            System.out.println(valor + "+" + "(" + valor + "x" + valor + ")");
            
//            Math.pow é a potencialização, colocando o valor que eu quero potencializar e qual o expoente dele após a virgula
            System.out.println((valor + (Math.pow(valor , 2)) ));
            valor++;
        }
    }
    
}
