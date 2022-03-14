import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreSelectionMenu extends JFrame implements ActionListener{

    private JButton Bouton1;    //Parcours à la main
    private JButton Bouton2;    //Parcours IA
    private JPanel Panneau1;
    private JLabel Hello;
    private FenetrePlotTrajet FenetreTrajet;
    //Menu1
    private JLabel Duree;
    private JLabel Distance;
    private JLabel Terrain;
    private JTextField ChoixDistance;
    private JTextField ChoixTerrain;
    private JTextField ChoixDuree;
    private JButton BoutonValider;
    //Menu2
    private JButton Plaisir;
    private JButton Performance;


    public FenetreSelectionMenu(){
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        int longueur = tailleMoniteur.width * 2/3;
        int hauteur = tailleMoniteur.height * 2/3;
        setSize(longueur,hauteur);
        setLocation(500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fermeture de la fenêtre avec la croix rouge
        FenetreTrajet = new FenetrePlotTrajet();
        //___________________________________________________________________________________________
        Panneau1 = new JPanel();
        Panneau1.setLayout(null);
        Panneau1.setBackground(new Color(186,255,248));
        //Texte 1
        Hello = new JLabel();
        Hello.setText("Bienvenue");
        Hello.setBounds(longueur/2-20,100,340,50);
        Panneau1.add(Hello);
        //Bouton 1
        Bouton1 = new JButton ("Choix des paramètres");
        Bouton1.setBackground(new Color(255,222,127));
        Bouton1.setBounds(30,hauteur/2,longueur/2-50,hauteur/2-100);
        Panneau1.add(Bouton1);
        Bouton1.addActionListener(this);
        //Bouton 2
        Bouton2 = new JButton ("Parcours personnalisé");
        Bouton2.setBackground(new Color(151,255,166));
        Bouton2.setBounds(longueur/2+10,hauteur/2,longueur/2-50,hauteur/2-100);
        Panneau1.add(Bouton2);
        Bouton2.addActionListener(this);
        //Bouton 2
        BoutonValider = new JButton ("Valider");
        BoutonValider.setBackground(new Color(125,255,103));
        BoutonValider.setBounds(longueur/2,50,longueur/2-50,hauteur/2-100);
        BoutonValider.addActionListener(this);
        Panneau1.add(BoutonValider);
        BoutonValider.setVisible(false);

        //MENU 1 : Affichage paramètres que l'utilisateur peut changer
        Distance = new JLabel();
        Distance.setText("Distance :");
        Distance.setBounds(50,100,100,50);
        Panneau1.add(Distance);
        Distance.setVisible(false);
        //Durée
        Duree = new JLabel();
        Duree.setText("Durée :");
        Duree.setBounds(50,200,100,50);
        Panneau1.add(Duree);
        Duree.setVisible(false);
        //Terrain
        Terrain = new JLabel();
        Terrain.setText("Préférence de terrain :");
        Terrain.setBounds(50,300,500,50);
        Panneau1.add(Terrain);
        Terrain.setVisible(false);
        //Choix de la durée
        ChoixDuree = new JTextField();
        ChoixDuree.setBounds(300,200,60,50);
        Panneau1.add(ChoixDuree);
        ChoixDuree.setVisible(false);
        //Choix de la distance
        ChoixDistance = new JTextField();
        ChoixDistance.setBounds(300,100,60,50);
        Panneau1.add(ChoixDistance);
        ChoixDistance.setVisible(false);
        //Choix du terrain
        ChoixTerrain = new JTextField();
        ChoixTerrain.setBounds(300,300,60,50);
        Panneau1.add(ChoixTerrain);
        ChoixTerrain.setVisible(false);

        //MENU 2 : Programme personnalisé
        //Bouton Plaisir
        Plaisir = new JButton ("PLAISIR : Parcours plus tranquille avec des points de vu impressionnants !");
        Plaisir.setBackground(new Color(255,222,127));
        Plaisir.setBounds(30,50,longueur/2-50,hauteur/2-100);
        Panneau1.add(Plaisir);
        Plaisir.addActionListener(this);
        Plaisir.setVisible(false);
        //Bouton performence
        Performance = new JButton ("PERFORMANCE : Repoussez vos limites !");
        Performance.setBackground(new Color(255,222,127));
        Performance.setBounds(longueur/2+10,50,longueur/2-50,hauteur/2-100);
        Panneau1.add(Performance);
        Performance.addActionListener(this);
        Performance.setVisible(false);

        this.add(Panneau1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()== Bouton2){
            //Changement Menu
            Bouton1.setVisible(false);
            Bouton2.setVisible(false);
            Hello.setVisible(false);
            Plaisir.setVisible(true);
            Performance.setVisible(true);
        }
        if (e.getSource()== Bouton1){
            //Changement de menu
            Bouton1.setVisible(false);
            Bouton2.setVisible(false);
            Hello.setVisible(false);
            Distance.setVisible(true);
            Duree.setVisible(true);
            Terrain.setVisible(true);
            ChoixDistance.setVisible(true);
            ChoixDuree.setVisible(true);
            ChoixTerrain.setVisible(true);
            BoutonValider.setVisible(true);
        }
        int cDuree = Integer.parseInt(ChoixDuree.getText());
        int cDistance = Integer.parseInt(ChoixDistance.getText());
        int cTerrain = Integer.parseInt(ChoixTerrain.getText());
        if(e.getSource()==BoutonValider){
            FenetreTrajet.choix(cDuree, cDistance,cTerrain);
            //FenetreTrajet.setVisible(true);
        }
        if(e.getSource()==Plaisir){
            //IA.choix(Plaisir);
            //FenetreTrajet.setVisible(true);
        }
        if(e.getSource()==Performance){
            //IA.choix(Performance);
            //FenetreTrajet.setVisible(true);
        }

    }
}