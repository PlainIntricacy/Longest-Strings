/**
 * Longest Strings *
 * https://www.codeeval.com/open_challenges/2/
 *
 * Author: todyerutz@plainintricacy.wordpress.com
 */

package LongString;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Tudor/IdeaProjects/LongestStrings/src/LongString/input.txt"));
        String line = reader.readLine();
        if(line!=null){
            System.out.println("Importing strings from local file...");
            int q = Integer.parseInt(line);
            ArrayList<String> stream = new ArrayList<String>();
            while((line=reader.readLine())!=null){
                stream.add(line);
            }
            selSort(stream);
            System.out.println("ArrayList Content:");
            for(String i:stream){
                System.out.println(i);
            }
            System.out.println("Longest " + q + " Strings:");
            for(int i=0; i<q; i++){
                System.out.println(stream.get(i));
            }
            reader.close();
        } else {
            System.out.println("INVALID INPUT - EMPTY FILE");
        }
    }

    public static void selSort(ArrayList<String> x){
        for(int i=0; i<x.size()-1; i++){
            int min = i;
            for(int j=i+1; j<x.size(); j++){
                if(x.get(j).length()>x.get(min).length()){
                    min = j;
                }
            }
            if(min!=i){
                Collections.swap(x, i, min);
            }
        }
    }
}
