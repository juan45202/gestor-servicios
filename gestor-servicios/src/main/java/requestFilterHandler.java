import netscape.javascript.JSObject;

public class requestFilterHandler extends BaseHandler {

    @Override
    public void handle(JSObject request) {
        super.handle(request);
        System.out.println("filtro de las multiples solicitudes de la misma IP");
    }

}
