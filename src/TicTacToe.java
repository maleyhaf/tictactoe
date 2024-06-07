public class TicTacToe {

    private char[][] board;
    private Player currentPlayer;
    
    // constructors
    public TicTacToe(){
        board = new char[3][3];
        initializeBoard();
    }

    public TicTacToe(Player assign){
        this();
        setCurrentPlayer(assign);
    }

    // initializing board
    void initializeBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

    // setters & getters
    void setCurrentPlayer(Player assPlayer){
        this.currentPlayer = assPlayer;
    }
    Player getCurrentPlayer(){
        return this.currentPlayer;
    }

    char[][] getBoard(){
        return this.board;
    }

    // logic methods to check if board is full by rows & columns
    boolean checkBoardFull(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    boolean checkWin(){
        return (checkRows() || checkColumns() || checkDiagnol());
    }

    boolean checkRows(){
        for(int i = 0; i < 3; i++){
            if(checkRowCol(board[i][0], board[i][1], board[i][2])){
                return true;
            }
        }
        return false;
    }

    boolean checkColumns(){
        for(int i = 0; i < 3; i++){
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagnol(){
        return ((checkRowCol(board[0][0], board[1][1], board[2][2])) ||
                (checkRowCol(board[0][2], board[1][1], board[2][0])));
        
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
    }

    
}
