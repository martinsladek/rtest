

//import com.sun.glass.ui.Robot;
//import com.sun.javafx.robot.FXRobotFactory;
//import javafx.scene.Scene;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RTest {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        while(true) {
            System.out.println("down");
            toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, Boolean.TRUE);
            sleep(1000);

            System.out.println("up");
            toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, Boolean.FALSE);
            sleep(1000);

            System.out.println("down");
            toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, Boolean.TRUE);
            sleep(1000);

            System.out.println("up");
            toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, Boolean.FALSE);
            sleep(1000);

            System.out.println("sleep 4 min");
            sleep(3 * 60 * 1000);
        }
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}