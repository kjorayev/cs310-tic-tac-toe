package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {

    private static final int DEFAULT_WIDTH = 3;

    public static void main(String[] args) {
        
        /* Set initial size of game board (default is 3x3) */

        int width = DEFAULT_WIDTH;
        
        /* If a different size is provided as a command-line argument, use it instead */

        if(args.length >= 1) {
            
            try {
                width = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) {}
            
        }
		
		
        /* Create MVC Objects */

        TicTacToeModel model = new TicTacToeModel(width);
        TicTacToeView view = new TicTacToeView(model);
        //TicTacToeController controller = new TicTacToeController(model, view);

		JFrame frame = new JFrame("Tic-Tac-Toe");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.add(view);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);

        
        /* MAIN LOOP */

       /* while (!model.isGameover()){
            
            view.viewModel();
            controller.controlModel();
            
        }*/
        
        /* Game is over; show the final board and the winner */

        // view.viewModel();

//        view.showResult(model.getResult().toString());

    }
}