
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> names = new HashMap<String,String>();
        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");
        
        String name = names.get("mikael");
        System.out.println(name);
    }

}
