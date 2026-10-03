public class HomeInterface {
    private light l;
    private tv t;
    private ac a;

    public HomeInterface() {
        this.l = new light();
        this.t = new tv();
        this.a = new ac();
    }

    public void turnOnlight() { l.turnOn(); }
    public void turnOfflight() { l.turnOff(); }

    public void turnOntv() { t.turnOn(); }
    public void turnOfftv() { t.turnOff(); }

    public void turnOnac() { a.turnOn(); }
    public void turnOffac() { a.turnOff(); }

    public void turnOnAll() {
        l.turnOn();
        t.turnOn();
        a.turnOn();
    }

    public void turnOffAll() {
        l.turnOff();
        t.turnOff();
        a.turnOff();
    }
}
