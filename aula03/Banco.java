package aula03;

import java.util.Scanner;

public class Banco {
    Scanner scanner = new Scanner(System.in);
    public String numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    //gettters e setters

    public String getNumConta() {
        return numConta;
    }
    private void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    private void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    private void setDono(String dono) {
        this.dono = dono;
    }
    public int getSaldo() {
        return saldo;
    }
    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    private void setStatus(boolean status) {
        this.status = status;
    }

    public void getInfo() { // escreve na tela as informações da conta do cliente
        String msg = String.format(" ---------------------------------\n num da conta = %s \n dono da conta = %s \n tipo da conta = %s \n saldo = %d \n ---------------------------------", getNumConta(), getDono(), getTipo(), getSaldo());
        System.out.println(msg);
    }

    private void asktipo() { //esse método private serve pra disparar um input dentro do método abrirConta() pro usuario pra saber qual tipo de conta ele deseja abrir
        do {
                System.out.println("qual é o tipo de conta? (cc ou cp)");
                this.tipo = scanner.next();                                                     //loop do-while pra garantir que o usuario responda 'cc' ou 'cp'
            } while (!this.tipo.equals("cc") && !this.tipo.equals("cp"));

        this.setTipo(this.tipo);
    }

    public void abrirConta(String nome, String num) {
        if (status == false) {
            asktipo();
            if (this.tipo == "cc") {
                this.setSaldo(50);;
            }
            else {
                this.setSaldo(150);
            }
            this.setDono(nome);
            this.setNumConta(num);

            this.setStatus(true);
        }
        else {
            this.setStatus(false);
        }
    }

    public void fecharConta() {
        if (this.status == true) {
            if (this.saldo > 0 ) {
                sacar(this.saldo);
                this.setNumConta(null);
                System.out.println("conta fechada");
            }
            else if (this.saldo < 0) {
                System.out.println("não é possivel fechar essa conta pois ela tem um débito de" + this.saldo);
            }
        }
        else {
            System.out.println("antes de fechar uma conta, abra uma");
        }
    }

    public void depositar(int num) {
        if (this.status == true) {
            
            this.setSaldo(this.saldo + num);
        }
        else {
            System.out.println("impossivel, conta não localizada");
        }
    }

    public void sacar(int num) {
        if (this.status == true) {
            if (num <= this.saldo) {
                this.setSaldo(this.saldo - num);;
            }
            else {
                System.out.println("esse valor não está disponivel na sua conta");;
            }
        }
    }

    public void pagarMensal() {
         if (this.status == true) {
            if (tipo == "cc") {
                this.setSaldo(saldo - 12);
            }
            else if (tipo == "cp") {
                this.setSaldo(saldo - 20);
            }
         }
    }
    public Banco() {
        this.status = false;
    }

    
}
