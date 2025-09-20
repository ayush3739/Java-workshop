package Day7;

import java.util.Locale;
import java.util.ResourceBundle;

public class localizationDemo {

    private static void showMessages(Locale locale){
        ResourceBundle bundle=ResourceBundle.getBundle("messages_french", locale);
        
        System.out.println("Locale: "+locale);
        System.out.println("greeting: "+bundle.getString("greeting"));
        System.out.println("ask.name: "+bundle.getString("ask.name"));
        System.out.println("farewell: "+bundle.getString("farewell"));
        System.out.println("------------------------------------");
    }
    public static void main(String[] args) {
        //for single locale

        Locale frenchLocale=new Locale("french");
        showMessages(frenchLocale);
        
    }
}
