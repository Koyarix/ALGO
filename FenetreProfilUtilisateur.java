import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class FenetreProfilUtilisateur extends JFrame implements ActionListener{

    private JPanel PanneauUsers;
    private JButton BoutonUsers;
    //Nouvel Utilisateur
    private JLabel Pseudo;
    private JLabel VMA;
    private JLabel Terrain;
    private JTextField ChoixPseudo;
    private JTextField ChoixVMA;
    private JButton BoutonValider;
    private JButton BoutonRoute;
    private JButton BoutonChemin;
    private FenetreSelectionMenu FenetreMenu;
    private LinkedList <Utilisateur> Users;
    private int cTerrain;

    public FenetreSelectionMenu fenetreMenu ;

    public FenetreProfilUtilisateur() {

        //DEFINITION DE LA FENETRE
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        int longueur = tailleMoniteur.width / 4;
        int hauteur = tailleMoniteur.height / 2;
        setSize(longueur, hauteur);
        setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fermeture de la fenêtre avec la croix rouge
        this.setResizable(false);
        this.setVisible(false);
        FenetreMenu = new FenetreSelectionMenu(); //Permet d'ouvrir la fenetre menu


        ///DEFINITION DES ELEMENTS
        //Panneau1
        JPanel Panneau1 = new JPanel();
        Panneau1.setLayout(null);
        Panneau1.setBackground(new Color(186,255,248));
        //PanneauUsers
        PanneauUsers = new JPanel();
        PanneauUsers.setLayout(null);
        PanneauUsers.setBounds(15,10,400,200);
        PanneauUsers.setBackground(new Color(186,100,248));
        Panneau1.add(PanneauUsers);
        //BoutonUsers
        BoutonUsers = new JButton ("Nouvel Utilisateur");
        BoutonUsers.setBackground(new Color(103,209,255));
        BoutonUsers.setBounds(200,450,150,50);
        BoutonUsers.addActionListener(this);
        Panneau1.add(BoutonUsers);
        //Pseudo
        Pseudo = new JLabel();
        Pseudo.setText("Pseudo :");
        Pseudo.setBounds(50,100,100,50);
        Panneau1.add(Pseudo);
        Pseudo.setVisible(false);
        //Terrain
        Terrain = new JLabel();
        Terrain.setText("Préférence de terrain :");
        Terrain.setBounds(50,200,100,50);
        Panneau1.add(Terrain);
        Terrain.setVisible(false);
        //VMA
        VMA = new JLabel();
        VMA.setText("VMA :");
        VMA.setBounds(50,300,500,50);
        Panneau1.add(VMA);
        VMA.setVisible(false);
        //Choix du pseudo
        ChoixPseudo = new JTextField();
        ChoixPseudo.setBounds(300,100,60,50);
        Panneau1.add(ChoixPseudo);
        ChoixPseudo.setVisible(false);
        //Choix de la VMA
        ChoixVMA = new JTextField();
        ChoixVMA.setBounds(300,300,60,50);
        Panneau1.add(ChoixVMA);
        ChoixVMA.setVisible(false);
        //Bouton Route
        BoutonRoute = new JButton ("Route");
        BoutonRoute.setBackground(new Color(103,209,255));
        BoutonRoute.setBounds(380,200,80,50);
        BoutonRoute.addActionListener(this);
        Panneau1.add(BoutonRoute);
        BoutonRoute.setVisible(false);
        //Bouton Chemin
        BoutonChemin = new JButton ("Chemin");
        BoutonChemin.setBackground(new Color(103,209,255));
        BoutonChemin.setBounds(280,200,80,50);
        BoutonChemin.addActionListener(this);
        Panneau1.add(BoutonChemin);
        BoutonChemin.setVisible(false);
        //Bouton Valider
        BoutonValider = new JButton ("Valider");
        BoutonValider.setBackground(new Color(125,255,103));
        BoutonValider.setBounds(longueur/2-50,hauteur*3/4,longueur/2-50,70);
        BoutonValider.addActionListener(this);
        Panneau1.add(BoutonValider);
        BoutonValider.setVisible(false);

        this.add(Panneau1);
        setVisible(true);

        //CREATION LISTE DES UTILISATEURS
        Users = new LinkedList <Utilisateur>();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==BoutonUsers){
            BoutonUsers.setVisible(false);
            PanneauUsers.setVisible(false);
            Pseudo.setVisible(true);
            BoutonChemin.setVisible(true);
            BoutonValider.setVisible(true);
            VMA.setVisible(true);
            Terrain.setVisible(true);
            ChoixPseudo.setVisible(true);
            ChoixVMA.setVisible(true);
            BoutonRoute.setVisible(true);

        }
        if (e.getSource()== BoutonChemin){
            BoutonRoute.setBackground(new Color(103,209,255));
            BoutonChemin.setBackground(new Color(103,155,255));
            cTerrain = 1;
        }
        if (e.getSource()== BoutonRoute){
            BoutonRoute.setBackground(new Color(103,155,255));
            BoutonChemin.setBackground(new Color(103,209,255));
            cTerrain = 2;
        }
        if (e.getSource()== BoutonValider){
            String cPseudo = ChoixPseudo.getText();
            Double cVMA = Double.parseDouble(ChoixVMA.getText());
            fenetreMenu = new FenetreSelectionMenu();
            //fenetreMenu.recupVMA(cVMA);
            Users.add(new Utilisateur(cPseudo,cVMA, cTerrain));
            FenetreMenu.setVisible(true);
            setVisible(false);
            for (Utilisateur u : Users){
                System.out.println(u);
            }
        }
    }

}

