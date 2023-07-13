
package S2_2019.Q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String fileName = "./src/S2_2019/Q3/maze.txt";
        loadMaze(fileName);
    }
    
    public static void loadMaze(String fileName) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = "";
        int[][] maze = new int[5][5];
        while((str = br.readLine()) != null)
        {
            
        }
    }
}
