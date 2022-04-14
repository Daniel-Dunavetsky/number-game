import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attie = random();
        
        System.out.println("pick a number 1 - 80");
        int silas = sc.nextInt();
        
        if (silas == attie){
            System.out.println("Correct wooooo");
        }
        else{
            System.out.print("Nope, try again | the number was: ");
            System.out.print(attie);
        }
    }

    private static int random() {
        var raum = RANDOM;
        return raum.nextInt(81);
    }
}
