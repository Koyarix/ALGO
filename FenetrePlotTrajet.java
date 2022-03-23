import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetrePlotTrajet extends JFrame implements ActionListener{
    public FenetrePlotTrajet() {
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        int longueur = tailleMoniteur.width * 2 / 3;
        int hauteur = tailleMoniteur.height * 2 / 3;
        setSize(longueur, hauteur);
        setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fermeture de la fenêtre avec la croix rouge
        this.setResizable(false);
        this.setVisible(false);

        JPanel Panneau1 = new JPanel();
        Panneau1.setLayout(null);
        Panneau1.setBackground(new Color(186,255,248));

        JLabel TEST = new JLabel();
        TEST.setText(String.valueOf(test));
        TEST.setBounds(longueur/2-20,100,340,50);
        Panneau1.add(TEST);

        this.add(Panneau1);
    }
    int test;


    public void choix(int a, int b, int c){
        System.out.println(""+a+b+c);
        test = a;
    }

    public void actionPerformed (ActionEvent e){
    }
}
public class FenetrePlotTrajet {
}
