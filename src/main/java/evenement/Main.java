package evenement;

import java.awt.FlowLayout;

import javax.swing.*;

public class Main extends JFrame{
    private JTextField textField;
    private JTextField textField2;
    private JLabel label;
    private JLabel label2;
    private JComboBox liste1;

    public Main(){
        super();

        build();//On initialise notre fenêtre
    }

    private void build(){
        setTitle("Fenêtre qui demande du texte"); //On donne un titre à l'application
        setSize(520,240); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(true); //On permet le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField("0");
        textField.setColumns(10);
        panel.add(textField);

        Object[] elements = new Object[]{"+", "-", "/", "*"};
        liste1 = new JComboBox(elements);
        panel.add(liste1);

        textField2 = new JTextField("0");
        textField2.setColumns(10);
        panel.add(textField2);

        label = new JLabel("0");
        panel.add(label);

        JButton bouton = new JButton(new GetAction(this, "Resultat"));
        panel.add(bouton);

        return panel;
    }

    public JTextField getTextField(){
        return textField;
    }

    public JTextField getTextField2(){
        return textField2;
    }

    public JComboBox getListe1(){
        return liste1;
    }

    public JLabel getLabel(){
        return label;
    }

    public static void main(String[] args) {
        //On crée une nouvelle instance de notre FenetreTexte
        Main fenetre = new Main();
        fenetre.setVisible(true);//On la rend visible
    }
}