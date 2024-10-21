//utilizando o tema do meu grupo de AMS que foi banco
public class contaBancaria{
    protected double saldo;
    protected String nome;
    
    public contaBancaria(double saldo,String nome){
        this.saldo = saldo;
        this.nome = nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getNome(){
        return this.nome;
    }
    public Double realizarPagamento(double valorPagamento){
        if (this.saldo - valorPagamento < 0){
            return "Não é Possível realizar o pagamento";
        } 
    }
    }
