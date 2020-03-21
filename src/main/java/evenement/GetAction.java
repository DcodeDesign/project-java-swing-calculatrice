package evenement;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import static java.lang.Integer.parseInt;

public class GetAction extends AbstractAction {
    private Main fenetre;
    private String result;

    public GetAction(Main fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        int texte1 = parseInt(fenetre.getTextField().getText());
        int texte2 = parseInt(fenetre.getTextField2().getText());
        Object selected = fenetre.getListe1().getSelectedItem();

        char operator = selected.toString().charAt(0);

        switch(operator) {
            case '+':
                this.result = Integer.toString(texte1 + texte2);
                break;
            case '-':
                this.result = Integer.toString(texte1 - texte2);
                break;
            case '/':
                this.result = Integer.toString(texte1 / texte2);
                break;
            case '*':
                this.result = Integer.toString(texte1 * texte2);
                break;
            default:
                this.result = "Error";
        }

        fenetre.getLabel().setText(this.result);
    }
}