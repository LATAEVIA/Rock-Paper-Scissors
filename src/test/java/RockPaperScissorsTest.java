import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissorsp1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player1 wins!", testRockPaperScissors.findWinner("rock", "scissors"));
  }

  @Test
  public void checkWinner_rockBeatsScissorsp2() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player2 wins!", testRockPaperScissors.findWinner("scissors", "rock"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaperp1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player1 wins!", testRockPaperScissors.findWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaperp2() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player2 wins!", testRockPaperScissors.findWinner("paper", "scissors"));
  }

  @Test
  public void checkWinner_paperBeatsRockp1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player1 wins!", testRockPaperScissors.findWinner("paper", "rock"));
  }

  @Test
  public void checkWinner_paperBeatsRockp2() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("player2 wins!", testRockPaperScissors.findWinner("rock", "paper"));
  }

  @Test
  public void checkWinner_tie() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("tie!", testRockPaperScissors.findWinner("rock", "rock"));
  }
}
