package jonphase5db1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;



/**
 *
 * @author Jon Janet 7/22/11
 * class ListReader uses BufferedReader to read a file and then tokenizes it and
 *  adds the state to the collection states
 */
public class ListReader
{
    private TreeSet states;

    /**
     * constructor ListReader creates new TreeSet
     * @param file
     * @throws IOException
     */
    public ListReader(File file) throws IOException
    {       
        states = new TreeSet<String>();
        readInfo(file);
    }// end constructor Listreader

    /**
     * method readInfo reads file by line and tokenizes, then adds state to
     * collection states
     * @param file
     * @throws IOException
     */
    private void readInfo(File file) throws IOException
    {       
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String Line;
        while ((Line = reader.readLine()) != null)
        {
            StringTokenizer tokens = new StringTokenizer(Line, ",");
            String first = tokens.nextToken().trim();
            String last = tokens.nextToken().trim();
            String address = tokens.nextToken().trim();
            String city = tokens.nextToken().trim();
            String state = tokens.nextToken().trim();
         
            states.add(state);
        }

    }// end method readInfo

    /**
     *
     * @return states
     */
    public TreeSet getState()
    {
        return states;
    } //end method getState

}// end class ListReader
