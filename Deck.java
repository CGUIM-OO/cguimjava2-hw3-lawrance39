import java.util.ArrayList;

/**
 * Description: Deck這個方法是用來產生一或多副撲克牌
 * 裡面包括printDeck和getAllCards兩個方法
 */
class Deck{
	private ArrayList<Card> cards;
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and 3 for loops to add card into deck
		//Sample code start
		//Card card=new Card(1,1); ->means new card as clubs ace
		//cards.add(card);
		//Sample code end
		
		//產生幾副牌
		for(int i = 0; i < nDeck ;i++) 
		{
			//產生花色suit
			for(int j = 1; j <= 4; j++)
			{
				//產生數字rank
				for(int k = 1; k <= 13; k++)
				{
					Card card = new Card(j,k);
					//將撲克牌放入ArrayList
					cards.add(card);
				}
			}
		}		
	}	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards, 
		//TODO: please implement and reuse printCard method in Card class (5 points)
		for(Card c:cards)
		{
			c.printCard(c);
		}

	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}