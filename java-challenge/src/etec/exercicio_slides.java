package etec;

import javax.swing.*;
import java.awt.*;

public class exercicio_slides extends JFrame{
    
JLabel rotulo1, rotulo2, rotulo3, rotulo4;

JTextField texto1, texto2, texto3, texto4;

    public exercicio_slides(){
        super("ExercicioComJLabel");
        Container tela = getContentPane();
        setLayout(null);

            rotulo1 = new JLabel ("Nome");
            rotulo2 = new JLabel ("Idade");
            rotulo3 = new JLabel ("Telefone");
            rotulo4 = new JLabel ("Celular");

            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,100,20);
            rotulo4.setBounds(50,140,80,20);

            texto1 = new JTextField(50);
            texto2 = new JTextField(4);
            texto3 = new JTextField(30);
            texto4 = new JTextField(20);

            rotulo1.setForeground(Color.RED);
            rotulo2.setForeground(Color.BLUE);
            rotulo3.setForeground(new Color(190,152,142));
            rotulo4.setForeground(new Color(201,200,100));

            rotulo1.setFont(new Font("Arial",Font.BOLD,14));
            rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
            rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
            rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));

            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);

            setSize(300,300);
            setVisible(true);
            setLocationRelativeTo(null);
    }

    public static void main(String args[]){
        exercicio_slides app= new exercicio_slides();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}