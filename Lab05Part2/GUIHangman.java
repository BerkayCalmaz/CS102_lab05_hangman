import java.awt.*;
import cs102.*;

import javax.swing.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView	consoleView;
		TextFieldControlPanel textFieldControlPanel;
		NewGameButtonControl newGameButtonControl;
		LabelsHangmanView labelsHangmanView;
		GallowsHangmanView gallowsHangmanView;
		LetterButtonControls letterButtonControls;
		HangmanLetterButtonsController hangmanLetterButtonsController;
		HangmanLetterButtonControls hangmanLetterButtonControls;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup );
		textFieldControlPanel = new TextFieldControlPanel( hangman );
		newGameButtonControl = new NewGameButtonControl( hangman );
		labelsHangmanView = new LabelsHangmanView( hangman );
		gallowsHangmanView = new GallowsHangmanView( hangman );
		consoleView = new ConsoleHangmanView();
		hangmanLetterButtonsController = new HangmanLetterButtonsController( hangman );
		hangmanLetterButtonControls = new HangmanLetterButtonControls(hangman, 13,2);

		hangmanLetterButtonControls.addActionListener( hangmanLetterButtonsController);
//		letterButtonControls = new LetterButtonControls( hangman.getAllLetters(), 13, 2 );
//		letterButtonControls.addActionListener( hangmanLetterButtonsController );

		//adding views
		hangman.addView( consoleView );
		hangman.addView( labelsHangmanView );
		hangman.addView( gallowsHangmanView );
		hangman.addView( newGameButtonControl );
		hangman.addView( hangmanLetterButtonControls );

		JFrame frame = new SimpleJFrame( "GUIHangman", 	// title
							gallowsHangmanView,			// center
							textFieldControlPanel, newGameButtonControl,		// north, south
							hangmanLetterButtonControls, labelsHangmanView );	// east, west
		frame.setSize( 800,400);

		// this is an infinite loop reading from the console... not clever!
		ConsoleControl.controlFor( hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();

//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//			new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
