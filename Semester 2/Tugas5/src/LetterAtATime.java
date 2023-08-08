import java.util.Scanner;

public class LetterAtATime
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for ( int i=0; i<message.length(); i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;

        for ( int i=0; i<message.length(); i++ )
        {
            char letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' )
            {
                a_count++;
            } else if ( letter == 'e' || letter == 'E'){
                e_count++;
            } else if ( letter == 'i' || letter == 'I'){
                i_count++;
            } else if ( letter == 'o' || letter == 'O'){
                o_count++;
            } else if ( letter == 'u' || letter == 'U'){
                u_count++;
            }
        }

        System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
        System.out.println("Your message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
        System.out.println("Your message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
        System.out.println("Your message contains the letter 'o' " + o_count + " times. Isn't that interesting?");
        System.out.println("Your message contains the letter 'u' " + u_count + " times. Isn't that interesting?");
        // 1. String melebihi batas
        // 2. 3 (0,1,2) ya, karakter terakhir x
        // 3. Karna jika karakternya 5 jika pakai <= makan for akan mengambil perulangan (0,1,2,3,4,5) dan melebihi batas
    }
}