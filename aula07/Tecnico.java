package aula07;

public class Tecnico extends Aluno {
    public Tecnico(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }



    protected String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }


    
    public void praticar() {
        System.out.println("praticando...");
    }
    
}
