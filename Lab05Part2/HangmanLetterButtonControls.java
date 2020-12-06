import cs102.Hangman;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView{


    public HangmanLetterButtonControls(Hangman hangman, int rows, int cols) {
        super( hangman.getAllLetters(), rows, cols);
    }

    @Override
    public void updateView(Hangman hangman) {
        if( !hangman.getUsedLetters().equals( "" )) {
            this.setDisabled(hangman.getUsedLetters());
        }

        if( hangman.isGameOver() ){
         this.setDisabled(hangman.getAllLetters());
        }

        if( !hangman.isGameOver() && hangman.getUsedLetters().equals( "") ){
            setEnabledAll(true);
        }
    }
}
