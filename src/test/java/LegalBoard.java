/*
 * LegalBoard.java
 * A JUnit test 
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
 */