package KeyActions;

import java.awt.*;

public class KeyMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KeyTest();
            }
        });
    }
}
