import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldControlPanel extends JPanel implements ActionListener {

    Hangman hangman;
    JTextField txtField;

    public TextFieldControlPanel(Hangman hangman){
        super();
        this.hangman = hangman;
        txtField = new JTextField(18);
        txtField.addActionListener(this );
        this.add(txtField);

    }

    public void actionPerformed(ActionEvent e) {

        String guess = txtField.getText();
        for(int i = 0; i < guess.length(); i++) {
            hangman.tryThis( guess.charAt(i) );
        }
        txtField.setText( "" );
    }

}
