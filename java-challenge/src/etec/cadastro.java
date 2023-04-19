package etec;

import javax.swing.*;
import java.awt.*;


public class cadastro extends JFrame{
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, titulo;

    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
public cadastro(){

    super("Cadastrar Cliente");
    Container tela = getContentPane();
    setLayout(null);

    //informações de cadastro
    rotulo1 = new JLabel ("Nome");
    rotulo2 = new JLabel ("RG");
    rotulo3 = new JLabel ("CPF");
    rotulo4 = new JLabel ("Endereço");
    rotulo5 = new JLabel ("Cidade");
    rotulo6 = new JLabel ("Estado");
    rotulo7 = new JLabel ("CEP");

    //definir fonte e tamanho do titulo
    JLabel titulo = new JLabel("Cadastro de Clientes");
    titulo.setFont(new Font("Arial",Font.BOLD,18));
    titulo.setForeground(Color.RED);

    texto1 = new JTextField(50);
    texto2 = new JTextField(15);
    texto3 = new JTextField(13);
    texto4 = new JTextField(50);
    texto5 = new JTextField(40);
    texto6 = new JTextField(30);
    texto7 = new JTextField(25);

    //definir posição e tamanho 
    rotulo1.setBounds(110,60,80,20);
    rotulo2.setBounds(110,110,80,20);
    rotulo3.setBounds(110,160,80,20);
    rotulo4.setBounds(110,210,80,20);
    rotulo5.setBounds(110,260,80,20);
    rotulo6.setBounds(110,310,80,20);
    rotulo7.setBounds(110,360,80,20);

    titulo.setBounds(130,10,200,30);

    texto1.setBounds(110,90,200,20);
    texto2.setBounds(110,130,110,20);
    texto3.setBounds(110,180,100,20);
    texto4.setBounds(110,230,200,20);
    texto5.setBounds(110,280,180,20);
    texto6.setBounds(110,330,150,20);
    texto7.setBounds(110,380,120,20);

    tela.add(titulo);

    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(rotulo5);
    tela.add(rotulo6);
    tela.add(rotulo7);


    tela.add(texto1);
    tela.add(texto2);
    tela.add(texto3);
    tela.add(texto4);
    tela.add(texto5);
    tela.add(texto6);
    tela.add(texto7);

    setSize(450,500);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String args[]){
      cadastro app= new cadastro();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}