package ch.niru.pong.model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Descreption of Movement
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class Movement {
    public Timer move;
    public Movement() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {

                if(Var.moveUP == true){

                    if(Var.y >=20){
                        Var.y -=2;
                    }
                }else if(Var.moveDOWN == true){

                    if(Var.y <= Var.screenHeight - 200){
                        Var.y += 2;
                    }
                }

            }

        }, 0, 6);
    }

}
