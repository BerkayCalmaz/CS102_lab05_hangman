import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanLetterButtonsController implements ActionListener {
    Hangman hangman;

    HangmanLetterButtonsController(Hangman hangman){
        this.hangman = hangman;
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        hangman.tryThis( button.getText().charAt(0) );
        button.setEnabled( false );
    }

}