public class Teste {
    public static void main(String[] args) {
        
        Bola bola = new Bola();

        // Criando as Threads, definindo o nome e a prioridade, e depois iniciando elas.
        
        new Crianca("Tércio", bola, 10).start();
        new Crianca("Raquel", bola, 8).start();
        new Crianca("Rodolfo", bola,7).start();
        new Crianca("Tácito", bola, 2).start();
        new Crianca("Rômulo", bola, 4).start();
        new Crianca("Thiago", bola, 2).start();
        new Crianca("Paes", bola, 6).start();
        new Crianca("Patrick", bola, 1).start();
        new Crianca("Barbosa", bola, 3).start();
        new Crianca("Elthon", bola, 2).start();
        
    }    
        
}
