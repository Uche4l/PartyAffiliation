import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String partyAfil = "";


        System.out.print("Enter your party affilition  [R,D,I]: ");
        partyAfil = in.nextLine();

        if (partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println(" you get a Republican elephant");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println(" you get a Demacratic Donkey");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println(" you get a Independent Man");
        }
        else
        {
            System.out.println("i don't know what party this is: " + partyAfil);
        }
    }

}