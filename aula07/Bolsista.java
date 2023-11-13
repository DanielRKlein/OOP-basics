package aula07;

public final class Bolsista extends Aluno {
    protected String bolsa;

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("renovando bolsa...");
    }

    @Override
    public final void pagarMensalidade() {
        System.out.println("pagou mensalidade mais barato");
    }
}
