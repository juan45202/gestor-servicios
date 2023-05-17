import netscape.javascript.JSObject;

// Esta clase puede ser opcional pero en caso de tener codigo repetido entre concrete handlers es util
public class BaseHandler implements Handler {

    public Handler next;

    // Este metodo implementa la logica  para definir la serie de eventos siguientes
    @Override
    public void setNext(Handler h) {
        next.setNext(h);
    }

    @Override
    public void handle(JSObject request) {
        // En este metodo iria el codigo en comun que tengan todos los handler que se creen para validaciones
    }
}
