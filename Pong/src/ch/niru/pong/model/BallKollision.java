package ch.niru.pong.model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Descreption of BallKollision
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 03.09.2020
 */

public class BallKollision {
    public Timer kollision;
    public BallKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {

                if(Var.ballY +50 >= Var.screenHeight){
                    Var.balldirY = -1;
                }

                if(Var.ballY <= 0){
                    Var.balldirY = 1;
                }

                if(Var.ballX +20 >= Var.screenWidth){

                    Var.ballX = Var.screenWidth /2 -10;
                    Var.ballY = Var.screenHeight /2 -10;

                    Var.balldirX = -1;
                    Var.playerPoints += 1;

                }

                if(Var.ballX <= 0){

                    Var.ballX = Var.screenWidth /2 -10;
                    Var.ballY = Var.screenHeight /2 -10;

                    Var.balldirX = 1;
                    Var.gegnerPoints += 1;

                }

                if(Var.ballX < Var.x +25 && Var.ballX > Var.x && Var.ballY -20 < Var.y + 150 &&  Var.ballY > Var.y){
                    Var.balldirX = 1;
                }

                if(Var.ballX < Var.gegnerX && Var.ballX > Var.gegnerX -20 && Var.ballY -20 < Var.gegnerY + 150 &&  Var.ballY > Var.gegnerY){
                    Var.balldirX = -1;
                }

            }

        }, 0, 4);
    }

}