void main() {
    Professor p1 = new Professor("Joao", "Programacao");
    Professor p2 = new Professor("Maicon", "Analise de Dados");
    Curso c1 = new Curso("IP2", 60, p1);
    Curso c2 = new Curso("ICC", 60, p2);
    Aluno a1 = new Aluno("Gerson", 21, new Curso[]{c1,c2});
    Curso[] cursosDoAluno2 = new Curso[1];
    cursosDoAluno2[0] = c1;
    Aluno a2 = new Aluno("Alice", 19, cursosDoAluno2);
    Aluno a3 = new Aluno("Jorge", 24);

    a1.exibirInfo();
    a2.exibirInfo();
    a3.exibirInfo();
}
