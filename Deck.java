import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
		
			private static ArrayList<Card> cards;
			
			
			
			public Deck(int nDeck){
				cards=new ArrayList<Card>();
				for(int i=1;i<=nDeck;i++)
				{
					for(Card.Suit s:Card.Suit.values())//因為Cards裡的變數是花色這個部分參數性質已改成Suit所以，後續也要接著改
				
		        {
		            for(int Y=1; Y<=13;Y++)
		            {
		                cards.add(new Card(s,Y));
		            }
		        }  
				}
				//shuffle();//當牌都產生出來時，是按照順序的，所以要洗牌
				

			}	
			private static ArrayList<Card>usedCard;//這裡是存已經發出去的那些排
			public static int nUsed;//存發出去的排數
			public static void shuffle(){
				int i;
				Random rand=new Random();
				 for(i=1;i<=52;i++)
					 {
					 
					 i = rand.nextInt(53);
					 cards.add(cards.get(i));//利用亂數來隨便取出Cards的一張牌，然後再add進cards裡
					 cards.remove(cards.get(i));//因為此時會有52+1張牌所以要remove出去
					 }
				 
				
			}
			public static int j=1;
			public static Card getOneCard(){
				
				
				Card card1=new Card(cards.get(j).getSuit(),cards.get(j).getRank());//
				//usedCard.add(cards.get(j));
				usedCard.add(card1);//再將usedCard
				nUsed=nUsed+1;
				
				if(nUsed==52)
				{
					shuffle();
				}
				j=j+1;
				//return cards.get(nUsed);
				return card1;
				
			}
			
			
			
			public ArrayList<Card> getAllCards(){
				return cards;
			}
		

	}


