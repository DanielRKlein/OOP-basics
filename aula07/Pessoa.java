package aula07;

public abstract class Pessoa {

    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected String sexo;

    public void fazerAniversario() {
        setIdade(this.idade++);
    }
    
}
