import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add (String passnum, String lastName){
        map.put(passnum, lastName);
    }

    String getbyPass(String passnum){
        return passnum + ":"+ map.get(passnum);
    }

    String getbyLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()){
                if(entry.getValue().equals(lastName))
                {
                    stringBuilder.append(entry.getKey()).append(":").append(lastName).append(" ");
                }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }
}















