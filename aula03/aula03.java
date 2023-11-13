package aula03;

public class aula03 {
    public static void main (String[] args) {
        Banco conta01 = new Banco();

        conta01.abrirConta("Daniel", "55576873");
        conta01.getInfo();

        conta01.depositar(1000);
        conta01.getInfo();

        conta01.sacar(1500);
        conta01.getInfo();

        conta01.pagarMensal();
        conta01.getInfo();
        
        conta01.fecharConta();
        conta01.getInfo();
    }
    


    
}
