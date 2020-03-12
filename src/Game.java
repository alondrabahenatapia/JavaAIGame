import java.util.Scanner;
public class Game {


    public static void main(String[] args) {


        Board b = new Board();
        Human student = new Human("Alondra",1);
        Computer apple = new Computer("Apple",2);
        Scanner sc = new Scanner(System.in);



        System.out.println("What is your move?");
        int answer = sc.nextInt();
        b.makeMove(answer,student.getToken());
        b.makeMove(apple.determineMove(),apple.getToken());



    }

}

