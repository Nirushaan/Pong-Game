package ch.niru.pong.gui;

import ch.niru.pong.model.KeyHandler;
import ch.niru.pong.model.Var;

import javax.swing.*;

/**
 * Descreption of GUI
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class GUI {



        public GUI() {

            Var.jFrame = new JFrame();
            Var.jFrame.setSize(Var.screenWidth, Var.screenHeight);
            Var.jFrame.setTitle("Pong");
            Var.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Var.jFrame.setLayout(null);
            Var.jFrame.setResizable(false);
            Var.jFrame.setVisible(true);
            Var.jFrame.setLocationRelativeTo(null);
            Var.jFrame.addKeyListener(new KeyHandler());
            Var.jFrame.requestFocus();

            Draw lbldraw = new Draw();
            lbldraw.setBounds(0,0, Var.screenWidth, Var.screenHeight);
            lbldraw.setVisible(true);
            Var.jFrame.add(lbldraw);
        }

    }
