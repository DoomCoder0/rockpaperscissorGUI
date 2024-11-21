public class RockPaperScissorGUI {
    private int playerScore;
    private int computerScore;

    public RockPaperScissorGUI() {
        playerScore = 0;
        computerScore = 0;
    }

    public String play(String playerChoice) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice = choices[(int) (Math.random() * 3)];

        // Simple game logic
        if (playerChoice.equals(computerChoice)) {
            return "Draw!";
        } else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            playerScore++;
            return "You win! Computer chose " + computerChoice;
        } else {
            computerScore++;
            return "You lose! Computer chose " + computerChoice;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }
}
