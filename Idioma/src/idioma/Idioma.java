package idioma;

import java.util.Locale;

public class Idioma {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema operacional é");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
