public class Chess {

    static char[][] board = new char[8][8]; // chessboard
    static boolean whiteTurn = true; // turn tracker
    Chess chess =new Chess
    // initialize the chessboard with pieces in starting positions
    public static void initializeBoard() {
        // fill the board with spaces
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' ';
            }
        }

        // place the pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = 'P';
            board[6][i] = 'p';
        }

        // place the rooks
        board[0][0] = 'R';
        board[0][7] = 'R';
        board[7][0] = 'r';
        board[7][7] = 'r';

        // place the knights
        board[0][1] = 'N';
        board[0][6] = 'N';
        board[7][1] = 'n';
        board[7][6] = 'n';

        // place the bishops
        board[0][2] = 'B';
        board[0][5] = 'B';
        board[7][2] = 'b';
        board[7][5] = 'b';

        // place the queens
        board[0][3] = 'Q';
        board[7][3] = 'q';

        // place the kings
        board[0][4] = 'K';
        board[7][4] = 'k';
    }

    // print the current state of the chessboard
    public static void printBoard() {
        System.out.println("  A B C D E F G H"); // print the column labels
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " "); // print the row labels
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // move a piece on the chessboard
    public static void movePiece(int startRow, int startCol, int endRow, int endCol) {
        board[endRow][endCol] = board[startRow][startCol]; // move the piece
        board[startRow][startCol] = ' '; // clear the original position
    }

    // check if a move is valid
    public static boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        char piece = board[startRow][startCol]; // the piece to be moved

        // check if the start and end positions are on the board
        if (startRow < 0 || startRow > 7 || startCol < 0 || startCol > 7
                || endRow < 0 || endRow > 7 || endCol < 0 || endCol > 7) {
            return false;
        }
        return true;
    }
}

