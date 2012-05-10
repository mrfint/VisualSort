
package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class gRect extends JPanel{

    private int khRect;
    public gRect(int a, int h, int parH) {
        khRect = parH/h;
        setPreferredSize(new Dimension(20, khRect*a));
        setBackground(Color.green);
        setBorder(BorderFactory.createLineBorder(Color.gray));
    }
    public void setHight(int a){
        setPreferredSize(new Dimension(20, khRect*a));
    }
}
