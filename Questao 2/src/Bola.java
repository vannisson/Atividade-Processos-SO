class Bola {

    private Crianca crianca;

    public void setCrianca(Crianca crianca) { 
        synchronized (this) {
            // Caso outra Thread esteja com a bola, a thread ficará esperar o notify()
            while (this.crianca != null)
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            // Caso a outra Thread termine sua execução, outra Thread é escolhida
            this.crianca = crianca;
            
            System.out.println(this.crianca.pegarNome() + " está com a bola agora");
            try {
                // Espera os 3 segundos com a bola
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Passa a bola e notifica as outras threads.
            this.crianca = null;
            notify();
        }
    }

}