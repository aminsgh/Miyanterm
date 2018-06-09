package aut.company;

public class PlayerOne extends PlayGround {
    private int scoreOne = 0;
    private Pixel[][] myGroundOfPlayerOne = new Pixel[10][10];
    private Pixel[][] enemyGroundOfPlayerOne = new Pixel[10][10];
    private String s1 = "";
    private String s2 = "";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public PlayerOne() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                myGroundOfPlayerOne[i][j] = new Pixel();
                enemyGroundOfPlayerOne[i][j] = new Pixel();
            }
        }
    }

    @Override
    public void addNewShip(Position position1, Position position2) {
        addNewShip(position1, position2, playerOneGround);
        setMyGround();
    }


    @Override
    public void hitShip(Position position, String type) {
        hitShip(position, type, playerTwoGround);
        setEnemyGround();
    }

    @Override
    public void addAScore() {
        scoreOne++;
    }

    @Override
    public boolean checkForWin() {
        if (scoreOne == 5) {
            System.out.println("player one is winner .....");
            return true;
        }
        return false;
    }

    @Override
    public void setMyGround() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                this.myGroundOfPlayerOne[i][j] = playerOneGround[i][j];
            }
        }

    }

    @Override
    public void setEnemyGround() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.enemyGroundOfPlayerOne[i][j] = playerTwoGround[i][j];


            }

        }
    }

    public Pixel[][] getMyGroundOfPlayerOne() {
        return myGroundOfPlayerOne;
    }

    public void setMyGroundOfPlayerOne(Pixel[][] myGroundOfPlayerOne) {
        this.myGroundOfPlayerOne = myGroundOfPlayerOne;
    }

    public Pixel[][] getEnemyGroundOfPlayerOne() {
        return enemyGroundOfPlayerOne;
    }

    public void setEnemyGroundOfPlayerOne(Pixel[][] enemyGroundOfPlayerOne) {
        this.enemyGroundOfPlayerOne = enemyGroundOfPlayerOne;
    }

    public Pixel getIndexOfMyGround(int i, int j) {
        return myGroundOfPlayerOne[i][j];
    }

    public void setIndexOfMyGround(Pixel myGround, int i, int j) {
        this.myGroundOfPlayerOne[i][j] = myGround;
    }

    public Pixel getIndexOfEnemyGround(int i, int j) {
        return enemyGroundOfPlayerOne[i][j];
    }

    public void setIndexOfEnemyGround(Pixel enemyGround, int i, int j) {
        this.enemyGroundOfPlayerOne[i][j] = enemyGround;
    }

    @Override
    public String toString() {
        s1 = "";
        s2 = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (myGroundOfPlayerOne[i][j].getPosition() == '@') {
                    s1 += ANSI_BLUE + myGroundOfPlayerOne[i][j].getPosition()  + "/";
                } else if (myGroundOfPlayerOne[i][j].getPosition() == '#') {
                    s1 += ANSI_RED + myGroundOfPlayerOne[i][j].getPosition()  + "/";
                } else {
                    s1 += ANSI_GREEN + myGroundOfPlayerOne[i][j].getPosition()  + "/";
                }
                if (enemyGroundOfPlayerOne[i][j].getPosition() == '@') {
                    s2 += ANSI_GREEN + (char) 215 + ANSI_GREEN + "/";
                } else if (enemyGroundOfPlayerOne[i][j].getPosition() == '#') {
                    s2 += ANSI_RED + enemyGroundOfPlayerOne[i][j].getPosition()  + "/";
                } else {
                    s2 += ANSI_GREEN + enemyGroundOfPlayerOne[i][j].getPosition()  + "/";
                }
            }
            s1 += "\n";
            s2 += "\n";
        }
        return "PlayerOne{" +
                "myGroundOfPlayerOne=\n" + s1 + "\n" +
                ", enemyGroundOfPlayerOne=\n" + s2 +
                '}';
    }


    public int getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(int scores) {
        scoreOne = scores;
    }
}
