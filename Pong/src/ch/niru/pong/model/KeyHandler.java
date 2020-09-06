package ch.niru.pong.model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Descreption of KeyHandler
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveUP = true;

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.moveDOWN = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveUP = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.moveDOWN = false;
        }

    }

}
