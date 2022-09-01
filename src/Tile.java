import javax.rmi.CORBA.Util;

public class Tile {
    final char letter;
    final int points;
    final char blankLetter;

    public Tile(char letter){
        this.letter = letter;
        this.points = Utils.getValue(letter);
    }
}