import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java", "a compiled high level object-oriented, platform independent language");
        }
        System.out.println(languages.get("Java"));
    }


}
