
package app;

import app.BlockPanel;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Block;


public class Main extends JFrame {


    public static void main(String[] args) {
        new Main().execute();
    }
    private Block block;
    private BlockPanel blockDisplay;
    
    public Main(){
        this.setTitle("Block shifter");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().add(blockPanel());
    }
    
    private void execute() {
        this.block = new Block(4,4);
        this.blockDisplay.display(block);
        this.setVisible(true);
        
    }

    private JPanel blockPanel() {
        BlockPanel panel = new BlockPanel();
        this.blockDisplay = panel;
        return panel;
    }
    
}
