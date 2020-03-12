public class Computer extends Player{
    //products
    private int token;

    //Constructor
    public Computer(String name, int token) {
        super(name,token);
        this.token = token;
    }
    //methods
    public int getToken() {
        return token;
    }

    public int determineMove() {

        int row = (int )(Math.random() * 8);



        return row;


    }
}
