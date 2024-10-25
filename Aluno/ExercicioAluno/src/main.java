import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno\n");
        String nome = input.nextLine();
        System.out.println("Digite o curso que ele está cursando");
        String curso = input.nextLine();
        System.out.println("Digite as três disciplinas que ele está cursando (digite o nome dela e em seguida aperte ENTER para inserir a próxima\n)");
        String disciplinaUm = input.nextLine();
        String disciplinaDois = input.nextLine();
        String disciplinaTres = input.nextLine();
        
        Aluno aluno = new Aluno( nome, curso, disciplinaUm, disciplinaDois, disciplinaTres);
        
        System.out.println("Digite as notas de cada disciplina do aluno");
        double notaUm = input.nextDouble();
        double notaDois = input.nextDouble();
        double notaTres = input.nextDouble();
        aluno.setNotas(notaUm, notaDois, notaTres);
        System.out.println(aluno.checarAprovacao(1));
        System.out.println(aluno.checarAprovacao(2));
        System.out.println(aluno.checarAprovacao(3));
}
        
}
