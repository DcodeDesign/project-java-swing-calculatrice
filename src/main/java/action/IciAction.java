package action;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class IciAction extends AbstractAction {
    public IciAction(String texte){
        super(texte);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Vous avez cliqué ici");
    }
}
