

public class Card {
	 enum Suit{Club, Diamond, Heart, Spade};//����ɫ׃��enum��ȡ���Kȡ����Suit
	   
	    Suit c1;//��Suit�����֞�c1
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
			if(getSuit().equals("Club"))//����equal���ʾ��getsuit��λ�Þ�Club�r���t���cSuit.Club��λ����ͬ
				System.out.print(Suit.Club);
			if(getSuit().equals("Diamond"))
					System.out.print(Suit.Diamond);
			if(getSuit().equals("Heart"))
					System.out.print(Suit.Heart);
			if(getSuit().equals("Spade"))
					System.out.print(Suit.Spade);
				
			
			/*char a=(char)getSuit();
			
			switch(a)
			{
			case'1':
			System.out.println("Clubs");
				break;
			case '2':
			System.out.println("Diamonds");
				break;
			case '3':
				System.out.println("Hearts");	
				break;
			case '4':
				System.out.println("Spades");
				break;
			}*/
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
			return c1; //�ь� getSuit()�Č��Ըĳ�Suit��
		}
		public int getRank(){
			return rank;
		}
	

}



