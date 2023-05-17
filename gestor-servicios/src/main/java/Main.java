import netscape.javascript.JSObject;

public class Main {

    public static void main(String[] args) {
        JSObject json = null;
        // Se crean 3 concrete handler para simular la cadena de responsabilidades
        Handler p1 = new CacheHandler();
        Handler p2 = new requestFilterHandler();
        Handler p3 = new SanitizeData();

        // Se crea la cadena de responsabilidades encolando las proocesos
        p1.setNext(p2);
        p2.setNext(p3);

        // Se inician las validaciones empezando por el p1
        p1.handle(json);

    }
}