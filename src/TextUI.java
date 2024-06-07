/*
 * THIS IS INTERFACE IS JUST TO TEST IF THE GAME ACTUALLY WORKS
 * Just based on text, no graphic interface
 */

import java.util.Scanner;

import javax.print.attribute.standard.PageRanges;

public class TextUI {

    private Player xPlayer;
    private Player yPlayer;
    private Player currPlayer;
    private TicTacToe game;
    private Scanner scn;

    TextUI(){
        xPlayer = new Player();
        xPlayer.setType('X');
        yPlayer = new Player();
        yPlayer.setType('O');
        game = new TicTacToe();
        scn = new Scanner(System.in);
    }

    void enterNames(Player assign){
        System.out.println("Enter Player (" + assign.getType() + ") Name: ");
        assign.setName(scn.nextLine());

        //scn.close();

    }

    void printGame(){
        System.out.println("-------------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                System.out.print(game.getBoard()[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void startGame(){
        enterNames(xPlayer);
        enterNames(yPlayer);

        currPlayer = xPlayer;

        printGame();

        int row, col;
        boolean changeP = true;
        while(!game.checkBoardFull()){
            System.out.println(currPlayer.getName() + "'s Turn");
            System.out.println("Enter row: ");
            row = scn.nextInt();
            System.out.println("Enter column: ");
            col = scn.nextInt();

            if ((row >= 0) && (row < 3)) {
                if ((col >= 0) && (col < 3)) {
                    if (game.getBoard()[row][col] == ' ') {
                        game.getBoard()[row][col] = currPlayer.getType();
                        if(game.checkWin()){
                            printGame();
                            System.out.println(currPlayer.getName() + " WINS!");
                            return;
                        }
                        changeP = true;
                    }
                } else{
                    System.out.println("Invalid COLUMN Input! Try Again.");
                    changeP = false;
                }
            } else{
                System.out.println("Invalid ROW Input! Try Again.");
                changeP = false;
            }

            printGame();

            if(changeP){
                currPlayer = (currPlayer == xPlayer) ? yPlayer : xPlayer;
            }
        }

        scn.close();
    }

    public static void main(String args[]) {
        //System.out.println("Testing Compilation...\n");
        
        TextUI textUI = new TextUI();
        textUI.startGame();

    }
}
