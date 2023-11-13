package aula06;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(Pessoa leitor, String titulo, String autor, int totPag) {
        this.leitor = leitor;
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }




    @Override
    public void abrir() {
    if (isAberto() == false) {
        setAberto(true);
    }
    else {
        System.out.println("o livro já está aberto");
    }
    }

    @Override
    public void fechar() {
        if (isAberto()) {
            setAberto(false);
        }
        else {
            System.out.println("o livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        System.out.println("folheando...");
    }

    @Override
    public void avançarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() - 1);
        }
    }
    
    public void detalhes() {
        String msg = String.format("total de paginas: %d \n pag_atual: %d \n \n nome do autor: %s \n está aberto? %b \n quem está lendo o livro: ", getTotPag(), getPagAtual(), getAutor(), isAberto());
        System.out.println(msg + this.leitor.getName());
    }
}
