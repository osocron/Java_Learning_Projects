package controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Controller extends Application{

    private Robot robot;

    @FXML
    Button roboButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
    }

    @FXML
    public void testRobot() throws InterruptedException, AWTException {
        robot = new Robot();
        robot.setAutoWaitForIdle(true);
        robot.delay(1000);
        //Proceeding to search for chrome
        robot.mouseMove(20,10);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);

        robot.keyPress(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_H);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_H);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_R);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_O);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_M);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_M);
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);

        //going to Youtube
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_T);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(100);

        robot.mouseMove(226, 67);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_G);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_G);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_O);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_O);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_G);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_G);
        robot.delay(300);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(3000);
        //Closing program

        robot.mouseMove(20, 10);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);

        robot.mouseMove(1269, 270);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);

        robot.mouseMove(885, 180);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);

    }

    /*robot.keyPress(KeyEvent.VK_CONTROL);
    robot.delay(100);
    robot.keyPress(KeyEvent.VK_ALT);
    robot.delay(100);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.delay(200);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(100);
    robot.keyRelease(KeyEvent.VK_ALT);
    robot.delay(100);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(100);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.delay(100);
    robot.keyPress(KeyEvent.VK_ALT);
    robot.delay(100);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.delay(100);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(100);
    robot.keyRelease(KeyEvent.VK_ALT);
    robot.delay(100);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(100);*/

    /*robot.keyPress(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_H);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_H);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_R);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_O);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(200);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(200);*/

}
