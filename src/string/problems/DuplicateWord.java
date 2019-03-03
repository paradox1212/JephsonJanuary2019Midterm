import java.util.HashMap;
import java.util.Map;


/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {


    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        // first let us split string into words

        String[] words = st.split(" ");




        Map<String,String> wordMap = new HashMap<String,String>();

        for(int i=0;i<words.length;i++) {

            String word = words[i].toUpperCase(); // for case insensitive comparison

            if(wordMap.get(word)!=null) {

                // we found a duplicated word!

                System.out.println("Duplicated/Repeated word:"+word);

            }else {

                wordMap.put(word, word);

            }

        }

    }

}





