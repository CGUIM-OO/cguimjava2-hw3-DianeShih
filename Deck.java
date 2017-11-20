import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
		
			private static ArrayList<Card> cards;
			
			
			
			public Deck(int nDeck){
				cards=new ArrayList<Card>();
				for(int i=1;i<=nDeck;i++)
				{
					for(Card.Suit s:Card.Suit.values())//當Deck花色已變成suit的型態來存取,迴圈Cardclass裡的Suit 命民為s=Suit的values
				
		        {
		            for(int Y=1; Y<=13;Y++)
		            {
		                cards.add(new Card(s,Y));
		            }
		        }  
				}
				shuffle();//這是第一次拿到完全按照順序地牌要先洗牌，所以呼叫洗牌的方法
			
				

			}	
			private static ArrayList<Card>usedCard;//方法陣列的usedcard
			public static int nUsed;//方法nused
			public static void shuffle(){
				//寸取洗牌時把一張牌拿出來放到旁邊去
				if(usedCard.size() != 0)//當發出去的牌(usedCard)這個arraylist的長度不等於零時
				{
					for(Card card : usedCard)//迴圈發出去的排等同於card
					{
						cards.add(card);//cards是原本那一組鋪克牌再加上以發出去的排(card)
					}
					usedCard.clear();
					nUsed = 0;//
				}
				//存取洗牌時隨便抽一張牌將牠放到第一張牌去
				int i;
				Random rand=new Random();
				 for(i=0;i<=52;i++)//陣列從一開始所以i要從0開始要不然會少一張牌
					 {
					 
					 int j = rand.nextInt(53);
					Card tea=cards.get(j);
					 cards.set(j,cards.get(i));//set在隨機取出的一張牌j，插入第i張牌
					 cards.set(i,tea);//set將第i張牌放進tea裡
					 }
				 
				
			}
			public static int j=1;
			public static Card getOneCard(){
				
			
				/*Card card1=new Card(cards.get(j).getSuit(),cards.get(j).getRank());
				usedCard.add(cards.get(j));*/
	
				
				Card card1 = cards.get(0);//card1是從cards取出的陣列第0牌
				
				usedCard.add(card1);// 將cards1地牌放進usedcard裡
				nUsed = nUsed + 1;// 每放一次n牌數used鳩要加一
				
				cards.remove(card1);

				if (nUsed == 52)// 
				{
					shuffle();
				}
				
				return card1;

			}
			
			
			
			public ArrayList<Card> getAllCards(){
				return cards;
			}
		

	}


