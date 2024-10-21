public class Horista extends Funcionario{
    private int horas;
    private double valorHora;
    public Horista(String nome, double salario,int horas, int valorHora){
        super(salario,nome);
        this.salario = horas*valorHora;
        this.horas = horas;
        this.valorHora = valorHora;
        this.nome = nome;
    }
    @Override
    public void exibirDados(){
        System.out.println("Horista : " + this.nome + "\nValor Hora: " + this.valorHora + "\nHoras Trabalhadas : " + this.horas + "\nSalario : " + this.salario);
    }
}
