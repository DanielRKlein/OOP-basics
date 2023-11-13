package aula02;
public class aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.carga = 90;

        //c1.tampada = true;
        
        //tamapda está private, então temos que chamar o metodo tampar ou destampar para ter acesso a esse atributo privado, uma vez que quem vai estar alterando-o é uma função que SE LOCALIZA *DENTRO* da propria classe, logo nao desrrespeita o conceito de private, veja a seguir:

        c1.tampar();
        System.out.println("Estou executando o comando c1.tampar()");
        c1.status();
        c1.destampar();
        System.out.println("Estou executando o comando c1.destampar()");
        c1.status();

        //agora uma nova caneta usando getters setter e construtor

        Caneta c2 = new Caneta();

        System.out.println("acabei de criar essa caneta, aqui vai o status dela:");
        c2.status();

        c2.setCor("verde");
        c2.setModelo("esfeografica-padrão");
        c2.setTampada(false);

        System.out.println("acabei de mudar os atributos usando getters e setters");
        c2.status();






    }
}

