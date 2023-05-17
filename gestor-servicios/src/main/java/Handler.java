import netscape.javascript.JSObject;

interface Handler {

    // Instancias de metodos que deben ser implementados por las clase hijas
    public void setNext(Handler h);
    public void handle(JSObject request);

}
