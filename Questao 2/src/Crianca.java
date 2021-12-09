public class Crianca implements Runnable {
    private String name;
    private Bola bola;
    private Thread t;

    public Crianca(String name, Bola bola, int priority) {
        this.name = name;
        this.bola = bola;

        this.t = new Thread(this, name);
        this.t.setPriority(priority);
    }

    public String getName() {
        return this.name;
    }

    public void start() {
        this.t.start();

    }

    @Override
    public void run() {
        this.bola.setCrianca(this);
    }
}
