
// 2. O custo de um carro novo ao consumidor é a soma do custo de fábrica coma  porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor é de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
package javachallenge;

import java.util.Scanner;


public class exercicio2 {

    public static void main(String[] args) {
        double custoFabrica, carroNovo, custoFinal,
                custoDistribuidor, impostos, prcntDistribuidor,prcntImposto;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o custo de fábrica do carro: ");
        custoFabrica = sc.nextDouble();
        
        
        prcntImposto = (45 * custoFabrica) / 100;
        prcntDistribuidor = (28 * custoFabrica) / 100;
        
        carroNovo = custoFabrica + prcntDistribuidor + prcntImposto;
        
        System.out.println("O valor final é:"
                + carroNovo);
        
        
    }
    
}
