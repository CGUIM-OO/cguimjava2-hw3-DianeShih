import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
		
			private static ArrayList<Card> cards;
			
			
			
			public Deck(int nDeck){
				cards=new ArrayList<Card>();
				for(int i=1;i<=nDeck;i++)
				{
					for(Card.Suit s:Card.Suit.values())//���Cards�e��׃���ǻ�ɫ�@�����օ������|�Ѹĳ�Suit���ԣ����mҲҪ������
				
		        {
		            for(int Y=1; Y<=13;Y++)
		            {
		                cards.add(new Card(s,Y));
		            }
		        }  
				}
				//shuffle();//���ƶ��a������r���ǰ������ģ�����Ҫϴ��
				

			}	
			private static ArrayList<Card>usedCard;//�@�e�Ǵ��ѽ��l��ȥ����Щ��
			public static int nUsed;//��l��ȥ���Ŕ�
			public static void shuffle(){
				int i;
				Random rand=new Random();
				 for(i=1;i<=52;i++)
					 {
					 
					 i = rand.nextInt(53);
					 cards.add(cards.get(i));//���Áy�����S��ȡ��Cards��һ���ƣ�Ȼ����add�Mcards�e
					 cards.remove(cards.get(i));//���˕r����52+1��������Ҫremove��ȥ
					 }
				 
				
			}
			public static int j=1;
			public static Card getOneCard(){
				
				
				Card card1=new Card(cards.get(j).getSuit(),cards.get(j).getRank());//
				//usedCard.add(cards.get(j));
				usedCard.add(card1);//�ٌ�usedCard
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


