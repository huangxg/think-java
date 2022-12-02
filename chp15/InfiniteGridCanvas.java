public class InfiniteGridCanvas extends GridCanvas {
    public InfiniteGridCanvas(int rows, int cols, int size) {
        super(rows, cols, size);
    }

    public int test(int r, int c) {
        r += numRows();
        r = r % numRows();
        c += numCols();
        c = c % numCols();

        return array[r][c].isOn() ? 1 : 0;
    }
}
