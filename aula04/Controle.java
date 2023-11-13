package aula04;

public class Controle implements Controlador {
    private int vol;
    private boolean ligado;
    private boolean tocando;

    

    public Controle() {
        this.setVol(50);
        this.setLigado(true);
        this.setTocando(true);
    }
    public int getVol() {
        return vol;
    }
    public void setVol(int vol) {
        this.vol = vol;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean isTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?" + this.isLigado());
        System.out.println("está tocando?" + this.isTocando());
        System.out.print("Volume: " + this.getVol());
        for (int i = 0; i <= this.getVol(); i+=10) {
            System.out.print("|");
        }

    }
    @Override
    public void fecharMenu() {
        System.out.println("fechando menu...");
    }
    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVol(this.getVol() + 5);
        }
    }
    @Override
    public void menosVolume() {
         if (this.isLigado()) {
            this.setVol(this.getVol() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVol() > 0) {
            this.setVol(this.getVol() - this.getVol());
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVol() == 0) {
            this.setVol(this.getVol());
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && this.isTocando() == false) {
            System.out.println("play");
        }
    }
    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            System.out.println("pause");
        }
    }


}
