public class SmartTv {
   // Atributos - Caracteristicas do objeto smartTv
    boolean ligada = false;
    int canal = 1;
    int volume =25;

    // Metodo sem parametro - 
    public void aumentarCanal() {
        canal ++;
        System.out.println("Aumentando o canal para: " + volume);
    } 
    public void diminuirCanal() {
        canal --;
        System.out.println("Aumentando o canal para: " + volume);
    }

    // Metodo com parametro - valor
    public void selecionarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarVolume() {
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume() {
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }



}
