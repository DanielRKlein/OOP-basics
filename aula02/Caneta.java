package aula02;
public class Caneta {

    //atributos


    public  String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;


    //CONSTRUTOR
    public Caneta() {
         
        this.cor = "verde";
        this.modelo = "seila";
        this.ponta = 0.75f;
        this.carga = 2;
        this.tampada = true;
    }


    //getters


    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public int getCarga() {
        return this.carga;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    //setters


    public void setModelo(String set) {
        this.modelo = set;
    }

    public void setCor(String set) {
        this.cor = set;
    }

    public void setPonta(float set) {
        this.ponta = set;
    }

    public void setCarga(int set) {
        this.carga = set;
    }

    public void setTampada(boolean set) {
        this.tampada = set;
    }


    //metodos ou  funçoes do objeto

    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Nao da pra rabiscar com a caneta tampada");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }

    
}
