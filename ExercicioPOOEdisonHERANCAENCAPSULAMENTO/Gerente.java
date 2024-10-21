public class Gerente extends Funcionario{
    private double comissao;
    public Gerente(double salario, String nome, double comissao){
        super(salario,nome);
        this.comissao = comissao;
    }
    public double getComissao(){
        return comissao;
    }
    public double addComissao(double venda){
        this.comissao += venda;
        return comissao;
    }
    @Override
    public void exibirDados(){
        System.out.println("Gerente : " + this.nome + "\nSalário : " + this.salario + "\nReceberá de Comissão : " + this.comissao);
    }
}