class Bola {

    private Crianca crianca;

    public void setCrianca(Crianca crianca) { 
        synchronized (this) {
            while (this.crianca != null)
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            this.crianca = crianca;

            System.out.println(this.crianca.getName() + " está com a bola agora");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.crianca = null;
            notify();
        }
    }

}