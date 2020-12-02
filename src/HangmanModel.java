import cs102.Hangman;
import cs102.IHangmanSetup;
import java.util.ArrayList;

public class HangmanModel extends Hangman {
    ArrayList<IHangmanView> views = new ArrayList();

    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }

    public void addView(IHangmanView view) {
        this.views.add(view);
        this.update();
    }

    public void update() {
        for(int i = 0; i < this.views.size(); ++i) {
            ((IHangmanView)this.views.get(i)).updateView(this);
        }

    }

    public int tryThis(char letter) {
        int trial = super.tryThis(letter);
        this.update();
        return trial;
    }
}
