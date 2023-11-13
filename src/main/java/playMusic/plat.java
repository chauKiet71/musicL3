/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playMusic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javazoom.jl.player.Player;

/**
 *
 * @author PC
 */
public class plat {

    Player player;
    long total_lenght;
    long pouse;
    FileInputStream fis;
    File myfile = null;
    BufferedInputStream bis;
    boolean ispause;

    void play() {
        JFileChooser chooser = new JFileChooser();
        int val = chooser.showOpenDialog(null);
        if (val == JFileChooser.APPROVE_OPTION) {
            myfile = chooser.getSelectedFile();
        }
        try {
            fis = new FileInputStream(myfile);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
            total_lenght = fis.available();
            new Thread() {
                public void run() {
                    try {
                        player.play();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void pouse() {
        if (player != null) {
            try {
                player.close();
                pouse = fis.available();
                ispause = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
