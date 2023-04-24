package classes;

public class Bolsista extends Aluno{
    private double bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }


    public double getBolsa(){ 
        return bolsa;
    }

    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + "é bolsista, pagamento facilitado.");
    }    

}
