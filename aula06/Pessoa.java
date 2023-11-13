package aula06;

public class Pessoa {
    private String name;
    private int age;
    private String sexo;

    public Pessoa(String name, int age, String sexo) {
        this.name = name;
        this.age = age;
        this.sexo = sexo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void Aniversario() {
        this.setAge(this.getAge() + 1);
    }
    
}
