package co.com.choucair.certificacion.academy.helpers;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Utils {

    private Utils() {
    }

    private static final List<String> dataCredentials = new ArrayList<>();

    public static List<String> getCredentials() {
        dataCredentials.add("YXBvbG8=");
        dataCredentials.add("Tm9tZW9sdmlkZTIwMjIr");
        return dataCredentials;
    }

    public static String decode64(String texto){
        String text = new String(Base64.getDecoder().decode(texto));
        return text;
    }
}
