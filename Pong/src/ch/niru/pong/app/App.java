package ch.niru.pong.app;

import ch.niru.pong.gui.GUI;
import ch.niru.pong.model.*;


/**
 * Descreption of App
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class App {

    public static void main(String[] args) {
        new GUI();
        new Var();
        new Movement();
        new GegnerMovement();
        new BallMovement();
        new BallKollision();
    }
}
