package action;

import javax.swing.*;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Main extends JFrame {
    private JButton bouton;
    private JButton bouton2;

    public Main() {
        super();

        build();//On initialise notre fenetre
    }

    public static void main(String[] args) {
        //On cr�e une nouvelle instance de notre FenetreBoutons
        Main fenetre = new Main();
        fenetre.setVisible(true);//On la rend visible
    }

    private void build() {
        setTitle("Fenetre qui affiche des boutons"); //On donne un titre �à l'application
        setSize(320, 240); //On donne une taille à notre fenétre
        setLocationRelativeTo(null); //On centre la fen�tre sur l'écran
        setResizable(true); //On permet le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        bouton = new JButton(new IciAction("Cliquez ici !"));
        //bouton.addActionListener(this);
        panel.add(bouton);

        bouton2 = new JButton(new LaAction("Ou là !"));
        //bouton2.addActionListener(this);
        panel.add(bouton2);


        JButton bouton3 = new JButton(new CalculAction(this, "Calculer"));
        panel.add(bouton3);

        JLabel label = new JLabel("Résultat : Pas encore calculé");
        panel.add(label);

        return panel;
    }
}