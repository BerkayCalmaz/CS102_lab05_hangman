import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class GallowsHangmanView extends JPanel implements IHangmanView {

    Hangman hangman;

    public GallowsHangmanView(Hangman hangman){
        this.hangman = hangman;
        this.setBackground( Color.blue);
        this.setPreferredSize( new Dimension(200, 100));
    }

    @Override
    public void updateView(Hangman hangmanModel) {
        repaint();
    }

    public void  paintComponent(Graphics g){
        super.paintComponent(g);
        //bottom
        g.fillRect( 15, 250, 175,20);
        //wall
        g.fillRect( 60,50,20,200);
        //hanging horizontal
        g.fillRect(60,50,80,15);
        //rope
        g.fillRect(125,50,10,30);
        //Head
        if( hangman.getNumOfIncorrectTries() == 1){
            g.drawOval(114,80,30,30);
        }
        else if( hangman.getNumOfIncorrectTries() == 2 ){
            g.drawOval(114,80,30,30);
            g.drawLine(130,110,130,170);
        }
        else if( hangman.getNumOfIncorrectTries() == 3 ){
            g.drawOval(114,80,30,30);
            g.drawLine(130,110,130,170);
            g.drawLine(130,170, 110,200);
        }
        else if( hangman.getNumOfIncorrectTries() == 4 ){
            g.drawOval(114,80,30,30);
            g.drawLine(130,110,130,170);
            g.drawLine(130,170, 110,200);
            g.drawLine(130,170,150,200 );
        }
        else if( hangman.getNumOfIncorrectTries() == 5 ){
            g.drawOval(114,80,30,30);
            g.drawLine(130,110,130,170);
            g.drawLine(130,170, 110,200);
            g.drawLine(130,170,150,200 );
            g.drawLine(130,132,120,152);
        }
        else if( hangman.getNumOfIncorrectTries() > 5 ){
            g.drawOval(114,80,30,30);
            g.drawLine(130,110,130,170);
            g.drawLine(130,170, 110,200);
            g.drawLine(130,170,150,200 );
            g.drawLine(130,132,120,152);
            g.drawLine(130,132,140,152);
        }
    }
}
