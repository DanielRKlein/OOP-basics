package aula08;

public class Vizualização {
    private Gafanhoto espectador;
    private Video filme;


    
    public Vizualização(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(espectador.getTotAssistido() + 1);
        this.filme.setViews(filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAval(5);
    }

    public void avaliar(int nota) {
        this.filme.setAval(nota);
    }

    
    @Override
    public String toString() {
        return "Vizualização [espectador=" + espectador + ", filme=" + filme + "]";
    }

    


    
    
}
