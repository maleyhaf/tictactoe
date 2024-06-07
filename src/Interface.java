import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame{

    // needed variables for the game
    public static final int WIDTH = 900;
    public static final int HEIGHT = 500;
    private TicTacToe theGame;
    private Player playerOne;
    private Player playerTwo;
    private JButton[][] buttons;

    public Interface(){
        super();
        theGame = new TicTacToe();
        buttons = new JButton[3][3];

        // window set up
        setSize(WIDTH, HEIGHT);
        setTitle("TicTacToe by Maleyha!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
