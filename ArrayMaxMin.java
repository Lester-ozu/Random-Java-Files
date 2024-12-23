import java.util.*;

public class ArrayMaxMin {

   static boolean validMelding1 = false, validMelding2 = false;
   
   static Random random = new Random();
   
   static String [] cardDeck = {"Spade 1", "Spade 2", "Spade 3", "Spade 4", "Spade 5", "Spade 6", "Spade 7", "Spade 8", "Spade 9", "Spade 10", "Spade Jack", "Spade Queen", "Spade King",
                                "Clover 1", "Clover 2", "Clover 3", "Clover 4", "Clover 5", "Clover 6", "Clover 7", "Clover 8", "Clover 9", "Clover 10", "Clover Jack", "Clover Queen", "Clover King",
                                "Heart 1", "Heart 2", "Heart 3", "Heart 4", "Heart 5", "Heart 6", "Heart 7", "Heart 8", "Heart 9", "Heart 10", "Heart Jack", "Heart Queen", "Heart King",
                                "Diamond 1", "Diamond 2", "Diamond 3", "Diamond 4", "Diamond 5", "Diamond 6", "Diamond 7", "Diamond 8", "Diamond 9", "Diamond 10", "Diamond Jack", "Diamond Queen", "Diamond King"};
   
   static String [] player1Deck = new String [13];
   static String [] player2Deck = new String [13];
   static String [] player3Deck = new String [13];
   static ArrayList<String> leftoverCards = new ArrayList<>();
   
   static int player1CardCount = 12, player2CardCount = 12, player3CardCount = 13;
   
   public static void main(String[] args) {
   
      cardDissemination();
      cardsToBePicked();
      
      for (String cards : player1Deck) {
      
         System.out.print(cards + " ");
      }
      
      System.out.println();
      
      for (String cards : player2Deck) {
      
         System.out.print(cards + " ");
      }
      
      System.out.println();
      
      for (String cards : player3Deck) {
      
         System.out.print(cards + " ");
      }
      
      System.out.println();
      
      for (String cards : leftoverCards) {
      
         System.out.print(cards + " ");
      }
   }
   
   public static void cardDissemination() {
   
      String randomCard;
      boolean cardVoid = true;
             
      for (int i = 0 ; i < player1CardCount ; i++) {
             
         randomCard = cardDeck[random.nextInt(52)];      
            
         for (int j = 0 ; j < player1CardCount ; j++) {
               
            try {
                  
               if (player1Deck[j] != null && player1Deck[j].equals(randomCard) ||
                   player2Deck[j] != null && player2Deck[j].equals(randomCard) ||
                   player3Deck[j] != null && player3Deck[j].equals(randomCard)) {
                              
                  i--;
                  cardVoid = false;
                  break;
               }
            }
               
            catch (Exception e) {
            }
                        
         }
            
         if (cardVoid) {   
            
            player1Deck[i] = randomCard;
         }
            
         cardVoid = true;
               
      }
             
      for (int i = 0 ; i < player2CardCount ; i++) {
             
         randomCard = cardDeck[random.nextInt(52)];
               
         for (int j = 0 ; j < player2CardCount ; j++) {
                  
            try {
                  
               if (player1Deck[j] != null && player1Deck[j].equals(randomCard) ||
                   player2Deck[j] != null && player2Deck[j].equals(randomCard) ||
                   player3Deck[j] != null && player3Deck[j].equals(randomCard)) {
                              
                  i--;
                  cardVoid = false;
                  break;
               }
            }
               
            catch (Exception e) {
            }              
         }
            
         if (cardVoid) {      
            
            player2Deck[i] = randomCard;
         }
            
         cardVoid = true;
               
      }
             
      for (int i = 0 ; i < player3CardCount ; i++) {
             
         randomCard = cardDeck[random.nextInt(52)];
               
         for (int j = 0 ; j < player3CardCount ; j++) {
                  
            try {
                  
               if (player1Deck[j] != null && player1Deck[j].equals(randomCard) ||
                   player2Deck[j] != null && player2Deck[j].equals(randomCard) ||
                   player3Deck[j] != null && player3Deck[j].equals(randomCard)) {
                              
                  i--;
                  cardVoid = false;
                  break;
               }
            }
               
            catch (Exception e) {
            }              
         }
            
            
         if (cardVoid) {
                  
            player3Deck[i] = randomCard;
         }
            
         cardVoid = true;
               
      }
      
      
   }
   
   public static void cardsToBePicked() {
      
      boolean ceaseDeck1, ceaseDeck2, ceaseDeck3;
      int i = 0, j = 0;
      
      while (i <= 51) {
         
         j = 0;
         ceaseDeck1 = true;
         ceaseDeck2 = true;
         ceaseDeck3 = true;
            
         while (j < 13) {
            
            if (j < player1Deck.length && player1Deck[j] != null && cardDeck[i].equals(player1Deck[j])) {
               ceaseDeck1 = false;   
            }
            
            
            if (j < player2Deck.length && player2Deck[j] != null && cardDeck[i].equals(player2Deck[j])) {
               ceaseDeck2 = false;   
            }
            
            if (j < player3Deck.length && player3Deck[j] != null && cardDeck[i].equals(player3Deck[j])) {
               ceaseDeck3 = false;   
            }
            
            j++;
         }
         
         if (ceaseDeck1 && ceaseDeck2 && ceaseDeck3) {
         
            leftoverCards.add(cardDeck[i]);
         }
         
         i++;
      }
   }

}