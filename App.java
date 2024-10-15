import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 260;
        int boardHeight = 640;

        JFrame frame = new JFrame("Fplappy Bird");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}