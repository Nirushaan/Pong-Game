package ch.niru.pong.model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Descreption of BallMovement
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 03.09.2020
 */

public class BallMovement {
    public Timer move;
    public BallMovement() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                Var.ballX += Var.balldirX;
                Var.ballY += Var.balldirY;


            }
        }, 0, 4);
    }

}
