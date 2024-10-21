public class Aplicacao{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1850, "Claúdio");
        funcionario.exibirDados();
        Gerente gerente = new Gerente(2500, "Antônio", 300);
        gerente.addComissao(100);
        gerente.exibirDados();
        Horista horista = new Horista("Jefferson", 0, 70, 20);
        horista.exibirDados();
    }
}