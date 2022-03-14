import sun.misc.VM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreProfilUtilisateur extends JFrame implements ActionListener{

    private JLabel Pseudo;
    private JLabel VMA;
    private JLabel Duree;
    private JTextField ChoixPseudo;
    private JTextField ChoixVMA;
    private JTextField ChoixDuree;
    private JButton BoutonValider;

    public FenetreProfilUtilisateur() {
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


        //Pseudo
        Pseudo = new JLabel();
        Pseudo.setText("Pseudo :");
        Pseudo.setBounds(50,100,100,50);
        Panneau1.add(Pseudo);
        //Durée
        Duree = new JLabel();
        Duree.setText("Durée :");
        Duree.setBounds(50,200,100,50);
        Panneau1.add(Duree);
        //VMA
        VMA = new JLabel();
        VMA.setText("Préférence de terrain :");
        VMA.setBounds(50,300,500,50);
        Panneau1.add(VMA);
        //Choix de la durée
        ChoixDuree = new JTextField();
        ChoixDuree.setBounds(300,200,60,50);
        Panneau1.add(ChoixDuree);
        //Choix du pseudo
        ChoixPseudo = new JTextField();
        ChoixPseudo.setBounds(300,100,60,50);
        Panneau1.add(ChoixPseudo);
        //Choix de la VMA
        ChoixVMA = new JTextField();
        ChoixVMA.setBounds(300,300,60,50);
        Panneau1.add(ChoixVMA);

        this.add(Panneau1);
    }

    public void actionPerformed (ActionEvent e){
    }
}

