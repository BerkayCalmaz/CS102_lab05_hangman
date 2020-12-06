import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView {

    JLabel numOfIncorrectTries;
    JLabel knownSoFar;
    JLabel usedLetters;
    JLabel hasLost;
    Hangman hangman;
    public LabelsHangmanView( Hangman hangmanModel){
        super();
        hangman = hangmanModel;
        numOfIncorrectTries = new JLabel();
        knownSoFar = new JLabel();
        usedLetters = new JLabel();
        hasLost = new JLabel();
        this.setLayout(new GridLayout(4,1));

        numOfIncorrectTries.setBackground(Color.red);
        numOfIncorrectTries.setOpaque(true);
        numOfIncorrectTries.setHorizontalAlignment( SwingConstants.CENTER);

        knownSoFar.setBackground( Color.yellow );
        knownSoFar.setOpaque(true);
        knownSoFar.setHorizontalAlignment( SwingConstants.CENTER);

        usedLetters.setBackground(Color.pink);
        usedLetters.setOpaque(true);
        usedLetters.setHorizontalAlignment( SwingConstants.CENTER);

        hasLost.setBackground(Color.green);
        hasLost.setOpaque(true);
        hasLost.setHorizontalAlignment( SwingConstants.CENTER );

        this.add(numOfIncorrectTries);
        this.add( knownSoFar );
        this.add( usedLetters );
        this.add( hasLost );
        this.updateView( hangman );
        this.setPreferredSize( new Dimension( 200,100));
        this.setBackground(Color.yellow);
    }

    @Override
    public void updateView(Hangman hangmanModel) {

        numOfIncorrectTries.setText(String.valueOf(hangmanModel.getNumOfIncorrectTries()));
        knownSoFar.setText(hangmanModel.getKnownSoFar());
        usedLetters.setText(hangmanModel.getUsedLetters());

        if (hangmanModel.isGameOver()){
            hasLost.setText("You won!!");
        }
        if(hangmanModel.hasLost()){
            hasLost.setText( "You lost :( ");
        }
        if( !hangmanModel.isGameOver()){
            hasLost.setText( "" );
        }
    }
}
