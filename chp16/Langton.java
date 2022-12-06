import javax.swing.JFrame;

public class Langton extends Automaton {
    private int xpos;
    private int ypos;
    private int head; // 0=North, 1=East, 2=South, 3=West

    public Langton(int rows, int cols) {
        grid = new GridCanvas(rows, cols, 10);
        xpos = rows / 2;
        ypos = cols / 2;
        head = 0;
    }

    public void update() {
        flipCell();
        moveAnt();
    }

    private void flipCell() {
        Cell cell = grid.getCell(xpos, ypos);
        if (cell.isOff()) {
            head = (head + 1) % 4;    // turn right
            cell.turnOn();
        } else {
            head = (head + 3) % 4;    // turn left
            cell.turnOff();
        }
    }

    private void moveAnt() {
        if (head == 0) {
            ypos -= 1;
        } else if (head == 1) {
            xpos += 1;
        } else if (head == 2) {
            ypos += 1;
        } else {
            xpos -= 1;
        }
    }

    public void run(String title, int rate) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(this.grid);
        frame.pack();
        frame.setVisible(true);
        this.mainloop(rate);
    }

    private void mainloop(int rate) {
        while (true) {
    
            // update the drawing
            this.update();
            grid.repaint();
    
            // delay the simulation
            try {
                Thread.sleep(1000 / rate);
            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }

    public static void main(String[] args) {
        Langton game = new Langton(61, 61);
        game.run("Langton's Ant", 1); 
    }
}
