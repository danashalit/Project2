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
import javax.swing.JFrame;
public class MainFrame extends JFrame {
    MainFrame(){
        super("Project 2 program");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}