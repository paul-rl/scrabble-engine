import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Game {
    boolean isGameOver = false;
    int currPlayer = -1;
    final ArrayList<Tile> TILE_BAG = new ArrayList<Tile>();
    final HashSet<Tile> PLAYER_ONE_RACK = new HashSet<Tile>();
    final HashSet<Tile> PLAYER_TWO_RACK = new HashSet<Tile>();
    GameBoard board;
    
    // Initial setup of the game, consists of 4 phases:
    //  1. Deciding who goes first
    //  2. Initialize board
    //  3. Initializing tile bag
    //  4. Draw player tiles
    public void setupGame(){
        currPlayer = (Math.random() < 0.5) ? Constants.PLAYER_ONE : Constants.PLAYER_TWO;
        board = new GameBoard();
        populateTileBag();
        drawTiles(Constants.PLAYER_ONE, 7);
        drawTiles(Constants.PLAYER_TWO, 7);
    }
    public void run(){
        setupGame();
        while(!isGameOver) {

        }
    }

    public void populateTileBag(){
        for (int i = 0; i < Constants.VALID_LETTERS.length; i++) {
            int freq = Utils.getFrequency(Constants.VALID_LETTERS[i]);
            for (int j = 0; j < freq; j++) {
                TILE_BAG.add(new Tile(Constants.VALID_LETTERS[i]));
            }
        }
    }
    
    public void drawTiles(int player, int numTiles){
        HashSet<Tile> rack = (player == Constants.PLAYER_ONE) ? PLAYER_ONE_RACK : PLAYER_TWO_RACK;

        // Can't draw this many tiles!
        // TODO: Figure out how to handle error here
        if (numTiles > TILE_BAG.size()) {

            return;
        }

        for (int i = 0; i < TILE_BAG.size(); i++) {
            rack.add(TILE_BAG.remove(TILE_BAG.size() - 1));
        }
    }
    
}
