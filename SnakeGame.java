
package snakegame;
import javax.swing.*;
public class SnakeGame extends JFrame {
    
    SnakeGame(){
        super("Snake Game");
        
        add(new Board());
        pack();     // Helps in refreshing the frame
   //     setLocation(100,100);  // Set frame loction form the left and top side of the screen
        setSize(400,400);    // Set the size of the frame
        setLocationRelativeTo(null);
        
        setResizable(false);
        setVisible(true);   // Visible the hidden frame
        
        
    }
    public static void main(String[] args) {
        new SnakeGame();
    }
    
}
