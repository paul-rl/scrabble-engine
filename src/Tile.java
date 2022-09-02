

public class Tile {
    final char letter;
    final int points;
    char blankLetter;

    public Tile(char letter){
        this.letter = letter;
        this.points = Utils.getValue(letter);
    }
}