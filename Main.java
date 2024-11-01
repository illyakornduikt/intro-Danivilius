package main;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePannel gamePannel= new GamePannel();
        window.add(gamePannel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePannel.setupGame();
        gamePannel.startGameThread();
    }
}