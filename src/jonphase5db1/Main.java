package jonphase5db1;

import java.io.File;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Jon Janet 7/22/11
 * Class main reads customer information from a file to determine in which states
 * we have customers. The file contains records with customer first name,
 * last name, street address, city, and state. All of the records are read from
 * the file and only the state information is stored into a data structure
 * alphabetically without duplicates. This list is then printed to the screen.
 */
public class Main
{

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
        ListReader reader = new ListReader(new File("CustomerList.txt"));

        SortedSet<String> states = new TreeSet<String>(reader.getState());
        System.out.println("The states that we have customers in are:");
        printSet(states);

    }

    private static void printSet(SortedSet<String> states)
    {
        for (String s : states)
        {
            System.out.printf("%s", s);
            System.out.println();
        }
    }
}
