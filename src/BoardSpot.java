class BoardSpot {
    final String SPECIAL_FEATURE;
    Tile currTile;
    
    public BoardSpot(String feature) {
        SPECIAL_FEATURE = feature;
    }

    public void setTile(Tile tile) {
        currTile = tile;
    }
}