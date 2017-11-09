
/**
 * Description: Card這個方法是用來產生撲克牌（張）
 * 裡面包括printCard, getSuit和getRank這幾個方法
 */
class Card{
	private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13
	/**
	 * @param s suit
	 * @param r rank
	 */	
	public Card(int s,int r){
		suit=s;
		rank=r;
	}	
	//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
	public void printCard(Card card){
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		
		//用來儲存與花色相應的英文
		String s = "";
		//用來儲存與數字相應的英文
		String r = "";
		
		//判斷花色
		switch(card.suit)
		{
			case 1:
				s ="Clubs";
				break;
			case 2:
				s = "Diamonds";
				break;
			case 3:
				s = "Hearts";
				break;
			case 4:
				s = "Spades";
				break;
		}
		//判斷數字
		switch(card.rank)
		{
			case 1:
				r ="Ace";
				break;
			case 11:
				r = "Jack";
				break;
			case 12:
				r = "Queen";
				break;
			case 13:
				r = "King";
				break;
			//將A,J,Q,K之外的數值轉為string
			default:
				r = Integer.toString(card.rank);
				break;
		}
		//輸出撲克牌的花色與數字
		System.out.println(s+" "+r);
	}
	public int getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}