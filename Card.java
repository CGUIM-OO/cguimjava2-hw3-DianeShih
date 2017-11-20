

public class Card {
	 enum Suit{Club, Diamond, Heart, Spade};//將花色放在enum裡來存取，其資料型態取名為為Suit
	   
	    Suit c1;//此enum取一個名為c1
		private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4 if I need to definition the suit and rank  String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		  //String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		private int rank; //1~13
		/**
		 * @param s suit
		 * @param r rank
		 */
		public Card(Suit s,int value){
			c1=s;
			rank=value;
		}	
		
		public void printCard(){
			/*if(getSuit().equals("Club"))
			System.out.print(Suit.Club);
			if(getSuit().equals("Diamond"))
					System.out.print(Suit.Diamond);
			if(getSuit().equals("Heart"))
					System.out.print(Suit.Heart);
			if(getSuit().equals("Spade"))
					System.out.print(Suit.Spade);*/
				
			System.out.println(getSuit());//原意為當getSuit為club時，則顯示出Suit裡的Club，但由於getSuit與print出來的值相同，所以直接print getSuit 就好
			if(getRank()==1)
			System.out.println("Ace");
			if(getRank()==2)
				System.out.println("2");
			if(getRank()==3)
				System.out.println("3");
			if(getRank()==4)
				System.out.println("4");
			if(getRank()==5)
				System.out.println("5");
			if(getRank()==6)
				System.out.println("6");
			if(getRank()==7)
				System.out.println("7");
			if(getRank()==8)
				System.out.println("8");
			if(getRank()==9)
				System.out.println("9");
			if(getRank()==10)
				System.out.println("10");
				if(getRank()==11)
			System.out.println("jack");
				if(getRank()==12)
				System.out.println("Queen");	
				if(getRank()==13)
				System.out.println("king");
				
		}
		public Suit getSuit(){
			return c1; //因為getSuit的型態已改成enum且資料型態是Suit，所以public的部分要改，
					   //並且將花色的值(getSuit)回傳到c1李
		}
		public int getRank(){
			return rank;
		}
	

}



