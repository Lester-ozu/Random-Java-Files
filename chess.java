public class chess {

   public static void main (String [] args) {
   
      public static char [][] gameBoard = {{' ',' ','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                             {'8',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'7',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'6',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'5',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'4',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'3',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'2',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|','-','-','-','|'},
                             {'1',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                             {' ',' ','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'},
                             {' ',' ',' ',' ','a',' ',' ',' ','b',' ',' ',' ','c',' ',' ',' ','d',' ',' ',' ','e',' ',' ',' ','f',' ',' ',' ','g',' ',' ',' ','h',' ',' '}};
                             
      initializedGameBoard(gameBoard);
      printGameBoard(gameBoard);
         
   }
   
   public static void printGameBoard (char [][] gameBoard) {
         for ( char [] rows : gameBoard) {
            for ( char cell : rows) {
               System.out.print(cell + " ");
            }
            System.out.println();
         }
   }
   
   public static char[][] initializedGameBoard(char[][] gameBoard) {
   
      //Initialization of black pieces
      gameBoard[3][4] = 'p';
      gameBoard[3][8] = 'p';
      gameBoard[3][12] = 'p';
      gameBoard[3][16] = 'p';
      gameBoard[3][20] = 'p';
      gameBoard[3][24] = 'p';
      gameBoard[3][28] = 'p';
      gameBoard[3][32] = 'p';
      
      gameBoard[1][4] = 'r';
      gameBoard[1][8] = 'h';
      gameBoard[1][12] = 'b';
      gameBoard[1][16] = 'q';
      gameBoard[1][20] = 'k';
      gameBoard[1][24] = 'b';
      gameBoard[1][28] = 'h';
      gameBoard[1][32] = 'r';

      
      //Initialization of white pieces
      gameBoard[13][4] = 'P';
      gameBoard[13][8] = 'P';
      gameBoard[13][12] = 'P';
      gameBoard[13][16] = 'P';
      gameBoard[13][20] = 'P';
      gameBoard[13][24] = 'P';
      gameBoard[13][28] = 'P';
      gameBoard[13][32] = 'P';
      
      gameBoard[15][4] = 'R';
      gameBoard[15][8] = 'H';
      gameBoard[15][12] = 'B';
      gameBoard[15][16] = 'Q';
      gameBoard[15][20] = 'K';
      gameBoard[15][24] = 'B';
      gameBoard[15][28] = 'H';
      gameBoard[15][32] = 'R';
      
      return gameBoard;
      
   }
   
}

