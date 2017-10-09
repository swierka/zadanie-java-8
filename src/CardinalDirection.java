public enum CardinalDirection {
    NORTH("północ"),
    EAST("wschód"),
    WEST("zachód"),
    SOUTH("południe"),
    UNDEFINED("!kierunek nieznany");

    private final String direction;
//    private final int directionNumber;

    CardinalDirection(String direction) {
        this.direction = direction;
//        this.directionNumber = directionNumber;
    }

    @Override
    public String toString() {
        return "Ok więc idziemy na " + direction;
    }

    public CardinalDirection convert(int num) {
        switch (num) {
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return WEST;
            case 3:
                return SOUTH;
            default:
                return UNDEFINED;
        }
    }
}
