package action;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculAction extends AbstractAction {
    private Main fenetre;

    public CalculAction(Main fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        //Action lors du clic sur le bouton calculer
    }
}