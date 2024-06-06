import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private Main() {
        // set JFrame's title
        super("Connect 4 Deluxe");

        // prevent resizing of window
        setResizable(false);

        // center top-level JPanels (*Screen.java)
        setLayout(new GridLayout());

        // close program if user closes window
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        add(new GameScreen(game));
        add(new MenuScreen());

        pack();

        // center window with respect to viewport
        setLocationRelativeTo(null);

        // make everything visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
