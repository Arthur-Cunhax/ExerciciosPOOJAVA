//Exercício 03 - Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um Aluno, como nome,matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado(nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informal o nome das disciplinas mostra as notas e mostra se o aluno foi aprovado ou não.
public class Aluno{
    private String nome;
    private String curso;
    private String disciplinaUm;
    private String disciplinaDois;
    private String disciplinaTres;
    private double notaDisciplinaUm;
    private double notaDisciplinaDois;
    private double notaDisciplinaTres;
    

    public Aluno(String nome,String curso, String disciplinaUm, String disciplinaDois, String disciplinaTres){
        this.nome = nome;
        this.curso = curso;
        this.disciplinaUm = disciplinaUm;
        this.disciplinaDois = disciplinaDois;
        this.disciplinaTres = disciplinaTres;
    }
    public void setNotaDiscUm(double nota){
        this.notaDisciplinaUm = nota;
    }
    public void setNotaDiscDois(double nota){
        this.notaDisciplinaDois = nota;
    }
    public void setNotaDiscTres(double nota){
        this.notaDisciplinaTres = nota;
    }
    public void setNotas(double notaUm, double notaDois, double notaTres){
        this.notaDisciplinaUm = notaUm;
        this.notaDisciplinaDois = notaDois;
        this.notaDisciplinaTres = notaTres;
    }
}
