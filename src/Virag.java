import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Virag {
    public void time(String a){
        Pattern p = Pattern.compile("([01][0-9]|2[0-3]\\d):[0-5]\\d");
        Matcher m = p.matcher(a);
        if(m.find())
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }
    public void word(String a){
        Pattern p = Pattern.compile("Завтра (\\w*)");
        Matcher m = p.matcher(a);
        if(m.find())
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }
}


