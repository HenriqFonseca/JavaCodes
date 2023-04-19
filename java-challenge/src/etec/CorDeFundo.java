package etec;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class CorDeFundo  extends JFrame{
    public CorDeFundo(){
        
        super ("Cor da Janela");
                Container tela = getContentPane();
                tela.setBackground(new Color(0,255,0));
                setSize(500,100);
                setVisible(true);
    }

    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
