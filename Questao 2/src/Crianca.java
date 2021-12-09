public class Crianca implements Runnable {
    private String nome;
    private Bola bola;
    private Thread c;
    // Construtor para salvar as configurações de cada Thread
    public Crianca(String nome, Bola bola, int priority) {
        this.nome = nome;
        this.bola = bola;
        this.c = new Thread(this, nome);
        this.c.setPriority(priority);
    }
    // Inicia as Threads
    public void iniciar() {
        this.c.start();
    }
    // Roda as instruções durante a execução das threads
    @Override
    public void run() {
        this.bola.setCrianca(this);
    }
    // Retorna o nome da Thread(Jogador) para a saída
    public String pegarNome() {
        return this.nome;
    }
}
