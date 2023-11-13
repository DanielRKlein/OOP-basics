package aula05;

public class Lutador implements iLutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private String altura;
    private int peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;



    public Lutador(String nome, String nacionalidade, int idade, String altura, int peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        if (this.peso < 52) {
            throw new IllegalArgumentException("Peso do lutador é leve demais, inválido. Ele não pode ser instanciado.");
        }
        else if (this.peso <= 70) {
            this.categoria = "leve";
        }
        else if (this.peso <= 83) {
            this.categoria = "médio";
        }
        else {
            this.categoria = "pesado/open";
        }
    }

    public int getPeso() {
        return peso;
    }

    private void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    private void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        String msg = String.format(" diretamente da %s \n %s anos \n com %s de altura \n %d kilos \n da categoria %s \n com %d vitorias \n %d derrotas \n e %d empates \n VEM AI \n %s ", getNacionalidade(), getIdade(), getAltura(), getPeso(), getCategoria(), getVitorias(), getDerrotas(), getEmpates(), getNome());
        System.out.println(msg);
    }

    @Override
    public void status() {
        String msg = String.format("%s \n %s \n categoria %s \n %s \n %d anos \n %d kilos", getNome(), getNacionalidade(), getCategoria(), getAltura(), getIdade(), getPeso());
        System.out.println(msg);
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    
}
