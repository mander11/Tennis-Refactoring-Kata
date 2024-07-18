public class TennisGame6 implements TennisGame {
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score++;
        else
            player2Score++;

    }

    public String getScore()
    {
        switch (scoreType())
        {
            case TIE: return tieScore();
        }
        

        if (isEndGame())
        {
            return endGameScore();
        }

        return regularScore();
    }

    private SCORE_TYPE scoreType() {
        if (isTieScore())
        {
            return SCORE_TYPE.TIE;
        }

        return SCORE_TYPE.REGULAR;
    }

    private String regularScore() {
        return scoreTranslation(player1Score) + "-" + scoreTranslation(player2Score);
    }

    private String tieScore() {
        String tieScore;
        switch (player1Score)
        {
            case 0:
                tieScore = "Love-All";
                break;
            case 1:
                tieScore = "Fifteen-All";
                break;
            case 2:
                tieScore = "Thirty-All";
                break;
            default:
                tieScore = "Deuce";
                break;
        }
        return tieScore;
    }

    private String endGameScore() {
        String result;
        String endGameScore;

        if (player1Score - player2Score == 1) {
            endGameScore = "Advantage " + player1Name;
        } else if (player1Score - player2Score == -1) {
            endGameScore = "Advantage " + player2Name;
        } else if (player1Score - player2Score >= 2) {
            endGameScore = "Win for " + player1Name;
        } else {
            endGameScore = "Win for " + player2Name;
        }

        result = endGameScore;
        return result;
    }

    private boolean isEndGame() {
        return areScroresAbove4();
    }

    private boolean areScroresAbove4() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private String scoreTranslation(int player1Score1) {
        return switch (player1Score1) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }

    private boolean isTieScore() {
        return player1Score == player2Score;
    }
}
