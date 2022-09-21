class GameBoard {
    public BoardSpot[][] board;

    public GameBoard(){
        board = new BoardSpot[Constants.BOARD_LENGTH][Constants.BOARD_LENGTH];
        initializeBoard();
    }
    
    private void initializeBoard() {
        String[] TOP_LEFT_TO_MID = {
            Constants.TRIPLE_WORD,
            Constants.DOUBLE_WORD,
            Constants.DOUBLE_WORD,
            Constants.DOUBLE_WORD,
            Constants.DOUBLE_WORD,
            Constants.TRIPLE_LETTER,
            Constants.DOUBLE_LETTER,
            Constants.START
        };
        // Initialize start
        board[Constants.BOARD_LENGTH / 2 + 1][Constants.BOARD_LENGTH / 2 + 1] = new BoardSpot(Constants.START);
        // Initialize top-left to mid
        for (int i = 0; i < Constants.BOARD_LENGTH / 2; i++) {
            board[i][i] = new BoardSpot(TOP_LEFT_TO_MID[i]);
        }
        // Initialize mid to bot-right
        for (int i = Constants.BOARD_LENGTH - 1; i > Constants.BOARD_LENGTH / 2 + 1; i--) {
            board[i][i] = new BoardSpot(TOP_LEFT_TO_MID[Constants.BOARD_LENGTH - 1 - i]);
        }
        // Initialize bot-left to mid
        for (int i = 0; i < Constants.BOARD_LENGTH / 2; i++) {
            board[Constants.BOARD_LENGTH - 1 - i][i] = new BoardSpot(TOP_LEFT_TO_MID[i]);
        }
        // Initialize mid to top-right
        for (int i = Constants.BOARD_LENGTH - 1; i > Constants.BOARD_LENGTH / 2 + 1; i--) {
            board[Constants.BOARD_LENGTH - 1 - i][i] = new BoardSpot(TOP_LEFT_TO_MID[Constants.BOARD_LENGTH - 1 - i]);
        }

        // Initialize non-diagonals
        // TODO: Figure out better way to do this
        board[0][3] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[0][7] = new BoardSpot(Constants.TRIPLE_WORD);
        board[0][11] = new BoardSpot(Constants.DOUBLE_LETTER);
        
        board[1][5] = new BoardSpot(Constants.DOUBLE_WORD);
        board[1][9] = new BoardSpot(Constants.DOUBLE_WORD);
        
        board[2][6] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[2][8] = new BoardSpot(Constants.DOUBLE_LETTER);
    
        board[3][0] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[3][7] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[3][14] = new BoardSpot(Constants.DOUBLE_LETTER);

        board[5][1] = new BoardSpot(Constants.DOUBLE_WORD);
        board[5][13] = new BoardSpot(Constants.DOUBLE_WORD);

        board[6][2] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[6][12] = new BoardSpot(Constants.DOUBLE_LETTER);

        board[7][0] = new BoardSpot(Constants.TRIPLE_WORD);
        board[7][3] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[7][11] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[7][14] = new BoardSpot(Constants.TRIPLE_WORD);

        board[14 - 0][3] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[14 - 0][7] = new BoardSpot(Constants.TRIPLE_WORD);
        board[14 - 0][11] = new BoardSpot(Constants.DOUBLE_LETTER);
        
        board[14 - 1][5] = new BoardSpot(Constants.DOUBLE_WORD);
        board[14 - 1][9] = new BoardSpot(Constants.DOUBLE_WORD);
         
        board[14 - 2][6] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[14 - 2][8] = new BoardSpot(Constants.DOUBLE_LETTER);
     
        board[14 - 3][0] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[14 - 3][7] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[14 - 3][14] = new BoardSpot(Constants.DOUBLE_LETTER);
 
        board[14 - 5][1] = new BoardSpot(Constants.DOUBLE_WORD);
        board[14 - 5][13] = new BoardSpot(Constants.DOUBLE_WORD);
 
        board[14 - 6][2] = new BoardSpot(Constants.DOUBLE_LETTER);
        board[14 - 6][12] = new BoardSpot(Constants.DOUBLE_LETTER);
    }
}