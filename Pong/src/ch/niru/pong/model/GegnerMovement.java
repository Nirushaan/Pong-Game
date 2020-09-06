package ch.niru.pong.model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Descreption of GegnerMovement
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 03.09.2020
 */

public class GegnerMovement {
    public Timer move;

    public GegnerMovement() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if(Var.ballX >= Var.screenWidth /2 -10){

                    if(Var.ballY == Var.gegnerY){

                    }else if (Var.ballY > Var.gegnerY + 75) {

                        if (Var.gegnerY <= Var.screenHeight - 200) {
                            Var.gegnerY += 2;
                        }



                    } else if (Var.ballY < Var.gegnerY + 75) {

                        if (Var.gegnerY >= 20) {
                            Var.gegnerY -= 2;
                        }

                    }
                }

            }
        }, 0, 6);
    }

}