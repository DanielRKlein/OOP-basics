package aula08;

public class Video implements AcoesVideo {
    private String titulo;
    private int aval;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.reproduzindo = false;
        this.views = 0;
        this.curtidas = 0;
        this.aval = 0;
    }

    public void setAval(int aval) {
        this.aval = aval;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAval() {
        return aval;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (isReproduzindo() == false) {
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (isReproduzindo()) {
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", aval=" + aval + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }

    

    
}
