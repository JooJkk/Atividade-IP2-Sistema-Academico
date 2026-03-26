public class Aluno {
    private String nome;
    private int idade;
    private Curso[] curso;

    public Aluno(String nome, int idade, Curso[] curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade) {
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

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso() {
        this.curso = curso;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome+" | "+"Idade: "+idade);
        if (curso!=null){
            int lg = curso.length;
            for(int i=0;i<lg;i++){
                int j=i+1;
                IO.println("Curso "+j+": "+curso[i].getNome()+" | "+"Carga Horária: "+curso[i].getCargaHoraria()+"h | "+"Professor: "+curso[i].getProfessor().getNome());
            }
        }
        else{
            IO.println("Nenhum curso associado.");
        }
        IO.println("-------------------");
    }
}