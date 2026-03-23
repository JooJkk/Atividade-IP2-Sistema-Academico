public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;

    public Aluno(String nome, int idade, Curso curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso() {
        this.curso = curso;
    }

    public void exibirInfo() {
        IO.println("Aluno: " + nome + " | " + "Idade: " + idade);
        if (curso!=null){
            IO.println("Curso: " + curso.getNome() + " | " + "Carga Horária: " + curso.getCargaHoraria() + "h");
            if (curso.getProfessor()!=null){
                IO.println("Professor" + curso.getProfessor().getNome() + " | " + "Especialidade: " + curso.getProfessor().getEspecialidade());
            }
        }
        else{
            IO.println("Nenhum curso associado");
        }
        IO.println("-------------------------------------");
    }
}
