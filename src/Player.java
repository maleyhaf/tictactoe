public class Player {

    // variables
    private String name;
    private char type;
    private int wins;
    private int loses;

    // default constructor
    public Player(){
        //setName("UnNamed Player")
        this.wins = 0;
        this.loses = 0;
    }

    // constructor w/name
    public Player (String assign){
        this();
        setName(assign);
    }

    // constructor w/name & type
    public Player (String assign1, char assign2){
        this();
        setName(assign1);
        setType(assign2);
    }


    // get & set for player name
    void setName(String assign){
        this.name = assign;
    }
    String getName(){
        return this.name;
    }

    // get & set for player type (X/O)
    void setType(char assign){
        this.type = assign;
    }
    char getType(){
        return this.type;
    }

}
                

    

        