package aula07;

public class Professor extends Pessoa {
    protected String especialidade;
    protected float salario;
    

    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void receberAumento(float aumento) {
        this.setSalario(this.salario + aumento);
    }


}
