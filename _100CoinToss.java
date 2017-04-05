public class _100CoinToss{
  public static void main(String[] args){
    int Heads = 0;
    int Tails = 0;
    Coin coin = new Coin();
    for(int i = 1; i<=100; i++){
      coin.flip();
      if(coin.toString().equals("Heads")){Heads++;}
  if(coin.toString().equals("Tails")){Tails++;}
    }
    System.out.println("Heads: " + Heads);
    System.out.println("Tails: " + Tails);
  }
}
    