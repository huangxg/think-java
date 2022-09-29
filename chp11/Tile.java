public class Tile {
    private char letter;
    private int value;

    public static void main(String[] args) {
        Tile tile = new Tile('Z', 10);
        printTile(tile);
        System.out.println(tile);

        Tile tile1 = new Tile('Z', 10);
        Tile tile2 = new Tile('X', 14);
        System.out.println(tile.equals(tile1));
        System.out.println(tile.equals(tile2));
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Tile tile) {
        System.out.printf("Tile: %c, %d\n", tile.letter, tile.value);
    }

    public String toString() {
        return String.format("Tile: %c, %d", letter, value);
    }

    public boolean equals(Tile that) {
        return letter == that.letter && value == that.value;
    }

    public char getLetter() {
      return letter;
    }

    public int getValue() {
      return value;
    }

    public void setLetter(char letter) {
      this.letter = letter;
    }

    public void setValue(int value) {
      this.value = value;
    }
}
