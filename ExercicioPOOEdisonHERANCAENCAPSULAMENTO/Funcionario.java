//tentei utilizar o tema do meu grupo de AMS que foi banco, mas não encontrei nenhuma maneira de aplicar isso então vou utilizar o exemplo do slide
public class Funcionario{
    protected double salario;
    protected String nome;
    
    public Funcionario(double salario,String nome){
        this.salario = salario;
        this.nome = nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getNome(){
        return this.nome;
    }
    public void exibirDados(){
        System.out.println("Funcionário : " + this.nome + "\nSalário : " + this.salario);
    }
}
    