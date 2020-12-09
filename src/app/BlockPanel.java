
package app;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import model.Block;
import view.BlockDisplay;

class BlockPanel  extends JPanel implements BlockDisplay{
    private static final int SIZE = 100;
    private Block block;
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white); 
        g.fillRect(0,0, getWidth(), getHeight());
        
        int d= block.MAX*SIZE;
        g.setColor(Color.black);
        for (int i = 0; i <= block.MAX; i++) {
            int c = i*SIZE;
            g.drawLine(0, c, d, c);
            g.drawLine(c, 0, c, d);
        }
        
        if(block == null) return;
        g.setColor(Color.red);
        g.fillRect((block.x()-1)*SIZE, (block.MAX - block.y())*SIZE, SIZE, SIZE);
        
    }

    @Override
    public void display(Block block) {
        this.block = block;
        repaint();
    }

    @Override
    public void changed() {
        repaint();
    }
    
    
}
