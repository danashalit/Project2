/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author DeeShalz
 */
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class MainPanel extends JPanel {
     MainPanel(){
        JButton name1Button = new JButton("Dana Shalit");
        add(name1Button);
        
        JButton name2Button = new JButton("Jian Li");
        add(name2Button);
        
        JButton name3Button = new JButton("Rasidha Rahman");
        add(name3Button);
        
        JButton name4Button = new JButton("Cecilia Knaub");
        add(name4Button);
    }
}