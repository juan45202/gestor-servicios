import netscape.javascript.JSObject;

public class CacheHandler extends BaseHandler {

    @Override
    public void handle(JSObject request) {
        super.handle(request);
        System.out.println("busqueda en la cache");
    }

}
