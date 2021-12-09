public class Teste {
    public static void main(String[] args) {
        
        Bola bola = new Bola();

        // Criando as Threads, definindo o nome e a prioridade, e depois iniciando elas.
        
        new Crianca("Tércio", bola, 10).iniciar();
        new Crianca("Raquel", bola, 8).iniciar();
        new Crianca("Rodolfo", bola,7).iniciar();
        new Crianca("Tácito", bola, 2).iniciar();
        new Crianca("Rômulo", bola, 4).iniciar();
        new Crianca("Thiago", bola, 2).iniciar();
        new Crianca("Paes", bola, 6).iniciar();
        new Crianca("Patrick", bola, 1).iniciar();
        new Crianca("Barbosa", bola, 3).iniciar();
        new Crianca("Elthon", bola, 2).iniciar();
        
    }    
        
}
