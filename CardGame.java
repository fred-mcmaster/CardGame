{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
public class Card \{\
  \
  public final static int SPADES = 0;   \
  public final static int HEARTS = 1;\
  public final static int DIAMONDS = 2;\
  public final static int CLUBS = 3;\
\
\
  public final static int ACE = 1;\
  public final static int JACK = 11;    \
  public final static int QUEEN = 12;  \
  public final static int KING = 13;\
  \
  protected String rank;\
  protected String suit;\
  \
  private String getRank()\{\
  	return rank;\
  \}\
  private String getSuit()\{\
  	return suit;\
  \}\
  \
  public String toString()\{\
  	return String.format(rank + "of" + suit);\
  \}\
\}\
\
\
\
public class Deck \{\
	\
  	private Card[] deck;\
    \
    \
    public Deck () \{\
      	// Card with no jokers\
        deck = new Card[52];\
        int counter = 0;\
        // Add card to this deck\
        for ( int suit = 0; suit <= 3; suit++ ) \{\
            for ( int value = 1; value <= 13; value++ ) \{\
                deck[counter] = new Card(value,suit);\
                counter++;\
            \}\
        \}\
    \}\
    \
    \
    public void Shuffling() \{\
    \
    	  for ( int i = deck.length-1; i > 0; i-- ) \{\
            int random = (int)(Math.random()*(i+1));\
            Card tmp = deck[i];\
            deck[i] = deck[random];\
            deck[random] = tmp;\
        \}\
    \}\
\} \
\
public class HandCard \{\
	\
	private ArrayList<Card> cards;\
    \
    public void AddCard(Card card)\{\
    \
    	if (c != null) cards.add(card);\
    \}\
    \
    public RemoveCard(Card card)\{\
    \
    	cards.remove(card);\
    \}\
    \
    public void clearAll()\{\
      	cards.clear();\
    \}\
    \
\}\
\
public class Player \{\
	\
    private String Fname;\
    private String Lname;\
    private int id;\
    \
    public String getFname() \{\
        return Fname;\
    \}\
     \
    public void setFname(String Fname) \{\
        this.Fname = Fname;\
    \}\
 \
    public String getLname() \{\
        return Lname;\
    \}\
     \
    public void setLastname(String Lname) \{\
        this.Lname = Lname;\
    \}\
    \
    public int id() \{\
        return Lname;\
    \}\
     \
    public void setId(int id) \{\
        this.id = id;\
    \}\
\}\
\
public class Game \{\
	\
    public Game () \{\
    \
    	public int num_decks_used = 1;\
        public int num_players = 3;\
        public Deck[] game_decks;\
        \
    \}\
    \
    public HandCard[] SplitCard(int players, Deck[] game_deck) \{\
    	ArrayList<Hand> hands = new Hand();\
        for (i= 0; i < game_deck; i++)\{\
        	game_deck[i].Shuffling();    \
        \}\
        for (player= 0; i < players; player++)\{\
        	hands[player].game_desk[player];    \
        \}\
       \
        return hands;\
    \}\
    \
	public Card CompareCard(Card[] twoCards)\{\
    	\
        //Compare alorithm\
        \
    	return Card;\
    \}\
\}\
\
\
class Main \{\
  public static void main(String[] args) \{\
    \
    Game myGame = new Game();\
    \
    game.splitCard();\
\
  \}\
\}\
}