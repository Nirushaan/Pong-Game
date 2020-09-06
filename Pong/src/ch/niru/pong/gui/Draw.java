package ch.niru.pong.gui;

import ch.niru.pong.model.Var;

import javax.swing.*;
import java.awt.*;

/**
 * Descreption of Draw
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class Draw extends JLabel{

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Var.screenWidth, Var.screenHeight);

        g.setColor(Color.WHITE);

        for(int i = 0; i<= 30; i++){
            g.fillRect(Var.screenWidth /2 -5, i * 20, 10, 10);
        }

        g.fillRect(Var.x, Var.y, 25, 150);
        g.fillRect(Var.gegnerX, Var.gegnerY, 25, 150);

        g.setFont(Var.pixelfont);
        g.drawString("" + Var.playerPoints, Var.screenWidth /2 - 95, 75);
        g.drawString("" + Var.gegnerPoints, Var.screenWidth /2 + 50, 75);

        g.fillRect(Var.ballX, Var.ballY, 20, 20);

        repaint();

    }

}
