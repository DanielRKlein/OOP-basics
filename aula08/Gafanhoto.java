package aula08;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

 public Gafanhoto(String login, String nome, int idade, Sexo sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
        this.setTotAssistido(this.totAssistido +=1);
    }

    @Override
    public String toString() {
        return "Gafanhoto [login=" + login + "," + super.toString() + ", totAssistido=" + totAssistido + "]";
    }

    
   
    

}
