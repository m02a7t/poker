package poker;

import java.util.*;
import java.lang.Math;
/**
 * Created by dish on 9/9/16.
 * ranks are for poker, rank(ace) = 13 > rank(2) = 1
 * hands will be ranked by their highest value over an array
 * playerhand.ranks = [13 13 12 12 12] vs player2hand.ranks[10 10 10 11 11]
 * three of a kind QQQ > three of a kind 10 10 10 in a full house tree
 * sort hands by type
 * hand rankings go by type -> then method for ranking hands of the same type
 * hand output is winning hand, all hands played, all ranks played
 * board theoretical nuts rank + hand
 * how often do the nuts board?
 * how far down (in the rank tables) was the winning hand from the nuts?
 * ... build a hand ranks table for all possible hands by rank. every possible straight, flush, FH, etc...
 *
 */
public class deck52 {

    private int N = 52;
    private int[] deckindex = new int[N];
    private String[] suit = new String[N];
    private String[] face = new String[N];
    private int[] rank = new int[N];

    public deck52()
    {
        for (int j = 0; j < N; j++) {
            deckindex[j] = j;

            switch ((int) Math.floor(j / 13) % 4) {
                case 0:
                    suit[j] = "clubs";
                    break;
                case 1:
                    suit[j] = "diamonds";
                    break;
                case 2:
                    suit[j] = "hearts";
                    break;
                case 3:
                    suit[j] = ("spades");
                    break;
                default:
                    break;
            }

            switch (j % 13) {
                case 0:
                    face[j] = "ace";
                    rank[j] = 13;
                    break;
                case 10:
                    face[j] = "jack";
                    rank[j] = 10;
                    break;
                case 11:
                    face[j] = "queen";
                    rank[j] = 11;
                    break;
                case 12:
                    face[j] = "king";
                    rank[j] = 12;
                    break;
                default:
                    face[j] = (Integer.toString(j % 13 + 1));
                    rank[j] = j % 13;
                    break;
            }

        } // end build loop

    } // end deck52() constructor

    public static void main(String[] args)

    {
        deck52 deck = new deck52();
        int n = 52;

        for (int i = 0; i < n; i++)
        {
            System.out.println(deck.deckindex[i] + " = " + deck.face[i] + " of " + deck.suit[i] + " rank:" + deck.rank[i]);
        }


    }
} // end deck52 class


