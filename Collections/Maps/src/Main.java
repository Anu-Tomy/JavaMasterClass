import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java","a compiled high level object-oriented, platform independent language" );
        languages.put("Python", "an interpreted,object-oriented, high-level programming language with dynamic semantic");
        languages.put("Algol", "an algorithmic language");

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
        System.out.println("=========================================");

        if(languages.containsKey("Java")){
            System.out.println("Java already exists in the map");
        }else{
            languages.put("Java", "a compiled high level object-oriented, platform independent language");
        }
        //System.out.println(languages.get("Java"));
    }

}
