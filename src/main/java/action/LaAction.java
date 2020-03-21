package action;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LaAction extends AbstractAction {
    public LaAction(String texte){
        super(texte);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Vous avez cliqué là");
    }
}