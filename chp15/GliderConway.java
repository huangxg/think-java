import javax.swing.JFrame;

public class GliderConway extends Conway {
    public GliderConway() {
        grid = new InfiniteGridCanvas(5, 5, 20);
        grid.turnOn(1, 2);
        grid.turnOn(2, 3);
        grid.turnOn(3, 1);
        grid.turnOn(3, 2);
        grid.turnOn(3, 3);
    }

    public static void main(String[] args) {
        String title = "Conway's Game of Life";
        Conway game = new GliderConway();
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(game.grid);
        frame.pack();
        frame.setVisible(true);
        game.mainloop();
    }
}
