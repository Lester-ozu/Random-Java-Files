import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ChessBoardString
{
    public static void main(String[] args)
    {
        Board board = new Board();
        String s = createString(board);
        System.out.println(s);
    }

    private static String createString(Board board)
    {
        char empty = '.';
        char chars[] = new char[8*8+8];
        Arrays.fill(chars, empty);
        for (int y=0; y<8; y++)
        {
            chars[y*9+8] = '\n';
        }
        List<Piece> pieces = board.getPieces();
        for (Piece piece : pieces)
        {
            int x = piece.getX();
            int y = piece.getY();
            char c = charFor(piece);
            chars[x+y*9] = c;
        }
        String s = new String(chars);
        return s;
    }

    private static char charFor(Piece p)
    {
        char c = ' ';
        if (p instanceof King)
        {
            c = 'k';
        }
        else if (p instanceof Queen)
        {
            c = 'q';
        }
        else if (p instanceof Bishop)
        {
            c = 'b';
        }
        else if (p instanceof Knight)
        {
            c = 'n';
        }
        else if (p instanceof Rook)
        {
            c = 'r';
        }
        else if (p instanceof Pawn)
        {
            c = 'p';
        }
        if (p.getColor() == Color.WHITE)
        {
            c = Character.toUpperCase(c);
        }
        return c;
    }
}



class Board
{
    List<Piece> getPieces()
    {
        List<Piece> pieces = new ArrayList<Piece>();
        pieces.add(new King(Color.WHITE,3,4));
        pieces.add(new King(Color.BLACK,5,6));
        pieces.add(new Queen(Color.WHITE,7,2));
        pieces.add(new Queen(Color.BLACK,2,0));
        pieces.add(new Bishop(Color.WHITE,1,2));
        pieces.add(new Bishop(Color.BLACK,5,4));
        pieces.add(new Knight(Color.WHITE,5,1));
        pieces.add(new Knight(Color.BLACK,0,7));
        pieces.add(new Rook(Color.WHITE,2,2));
        pieces.add(new Rook(Color.BLACK,1,4));
        pieces.add(new Pawn(Color.WHITE,6,1));
        pieces.add(new Pawn(Color.BLACK,2,3));
        return pieces;
    }
}

enum Color
{
    BLACK,
    WHITE
}

abstract class Piece
{
    private Color color;
    private int x;
    private int y;
    Piece(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    Color getColor()
    {
        return color;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
}

class King extends Piece
{
    King(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
class Queen extends Piece
{
    Queen(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
class Bishop extends Piece
{
    Bishop(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
class Knight extends Piece
{
    Knight(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
class Rook extends Piece
{
    Rook(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
class Pawn extends Piece
{
    Pawn(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
