package etec;

import java.util.Scanner;

public class Pessoa {

    public int totalPessoa = 5;
    public String nome[] = new String[totalPessoa];
    public int idade[] = new int[totalPessoa];
    public int hora[] = new int[totalPessoa];
    
    
    
    public static void main(String[] args) { 
        Pessoa pessoa = new Pessoa();
        
        
        //Receber os dados das pessoas
        System.out.println("informe seus dados");
        for(int i = 0;i<pessoa.nome.length;i++){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("\nDigite o nome da pessoa");
            pessoa.nome [i] = sc.nextLine()   ;
            
            System.out.println("Digite a idade");
            pessoa.idade[i] = sc.nextInt();
            
            System.out.println("Digite o horario de chegada");
            pessoa.hora[i] = sc.nextInt();
            
        }
        //verificar se a pessoa está de acordo com o horário de funcionamento da clínica
        for(int i = 0; i<pessoa.totalPessoa;i++){
              if(pessoa.hora[i] <9 || pessoa.hora[i] >17){
                System.out.println("A clinica apenas funciona das 9 as 17 amigo, volte outra hora");
                break;
            }
              else{
                  continue;
              }
        }
         //verificar ordem da fila Normal (por hora)
       //variavel auxiliar
       int aux1;
        boolean controle1 = true;
        //Responsavel de analisar dois valores do vetor
            //Coloquei (vetor - 1) pois só é necessário chegar até a 9° posição do vetor(que vai
            // avaliar a proxima prosição, no caso a 10°),caso vá até a 10°, haverá erro.
        for(int i = 0; i<pessoa.totalPessoa; i++){
            //caso os vetores já estejam em ordem, finaliza o loop, confirmando que ele já está em ordem
            controle1 = true;
            for(int j = 0; j<(pessoa.totalPessoa - 1); j++){
                //verificar se o valor de uma posição é maior que a outra
                if(pessoa.hora[j] < pessoa.hora[j + 1]){
                    //realizar a troca de posição de vetores
                    aux1 = pessoa.hora[j];
                    pessoa.hora[j] = pessoa.hora[j + 1];
                    pessoa.hora[j + 1] = aux1;
                    controle1 = false;
                }
            }
            if (controle1){
                break;
            }
            
        }
        
        //exibir fila normal
        System.out.println("======================FILA NORMAL===========================");
        for(int i = 0; i<pessoa.totalPessoa;i++){
            if(pessoa.idade[i] <59){
            System.out.println("Posicao na fila:" + (i + 1) + " "
                    + pessoa.nome[i] + "," 
                    +pessoa.idade[i] + "anos, " 
                    + "Hora de chegada:" + pessoa.hora[i] + "\n");
            }
        }
       

//verificar ordem da fila preferencial(por idade)
        
        int aux = 0;
        boolean controle;
        for(int i = 0; i<pessoa.totalPessoa; i++){
            //caso os vetores já estejam em ordem, finaliza o loop, confirmando que ele já está em ordem
            controle = true;
            for(int j = 0; j<(pessoa.totalPessoa - 1); j++){
                //verificar se o valor de uma posição é maior que a outra
                if(pessoa.idade[j] < pessoa.idade[j + 1]){
                    //realizar a troca de posição de vetores
                    aux = pessoa.idade[j];
                    pessoa.idade[j] = pessoa.idade[j + 1];
                    pessoa.idade[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }

        System.out.println("======================FILA PREFERENCIAL=====================");
        for(int i = 0; i<pessoa.totalPessoa;i++){
            if(pessoa.idade[i] > 59){
            System.out.println("Posicao na fila:" + (i + 1) + " "
                    + pessoa.nome[i] + "," 
                    +pessoa.idade[i] + "anos, " 
                    + "Hora de chegada:" + pessoa.hora[i] + "\n");
            }
        }
    }
}


    
