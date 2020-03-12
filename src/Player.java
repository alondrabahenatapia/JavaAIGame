public class Player {
    //Product
    private String name;
    private int token;
    //constructor
    public Player(String name, int token) {
        this.name = name;
        this.token = token;
    }
    //methods
    public Player(String  name) {
        this.name = name;
    }

    public String  getName() {
        return name;
    }



}
