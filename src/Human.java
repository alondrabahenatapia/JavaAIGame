public class Human extends Player{
    //products
    private int token;

    //Constructor
    public Human(String name, int token) {
        super(name,token);
        this.token = token;
    }
    //methods
    public int getToken() {
        return token;
    }
}
