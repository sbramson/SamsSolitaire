/*
 * CoreTest.java
 * A JUnit test for the part of the game that handles rules and mechanics, maintaining and evolving
 * the game state.
 *
 * so this could potentially call smaller tests that check the legality of smaller parts of the board
 * i.e. individual free cells, individual foundation piles, individual tableu columns
 * but even if they all confirmed that they had legal cards, a subset of the deck, limited to whatever
 * bounds (such as 0 to 1 for free cells) and under whatever restrictions (alternating colors in tableu
 * columns, or strict increasing order within a suit for foundation piles), they would not naturally pick
 * up the global information that THIS test would need, namely to identify that all 52 playing cards are
 * out there somewhere
 *
 * So maybe it wouldn't be a big deal to have all those checks live in one class, here, just for the
 * sake of that global deck information
 *
 * But another thought is that some of this legality logic might be needed in the game itself!
 *
 * there is a potential partitioning into legal boards and legal *starting* boards
 * both of which have to tackle the many cases covering the random positions of cards
 *
 * One way to start small and simple is to make sure there are exactly the 52 playing cards there should
 * be. Which implies that those cards, "the deck", could live at the top level of the whole game's architecture.
 */
 
import static org.junit.Assert.*;
import org.junit.*;

import main.java.core.SolitaireCore;

public class CoreTest {
	
	// Are the 52 normal playing cards in play?
	@Test
	public void testStandard52CardsExist() {
		SolitaireCore core = new SolitaireCore();
		
		// so how should the test code structure the cards so as to check against the real code
	}
}