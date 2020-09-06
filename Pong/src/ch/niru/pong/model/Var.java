package ch.niru.pong.model;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Descreption of Var
 *
 * @author Nirushaan Sureshkumar
 * @version 0.1
 * @since 02.09.2020
 */

public class Var {

    public static JFrame jFrame;
    public static int screenWidth = 800, screenHeight = 600;

    public static int x = 20, y = 185;
    public static int gegnerX = 755, gegnerY = 185;
    public static int ballX = 200, ballY = 200;

    public static boolean moveUP = false, moveDOWN = false;

    public static int balldirX = 1, balldirY = -1;

    public static int playerPoints = 0, gegnerPoints = 0;

    public static Font pixelfont;

    public Var() {

        try {
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
        } catch (FontFormatException | IOException e) {

            e.printStackTrace();
        }

    }

}