void main() {
    Professor p1 = new Professor("joelson", "programacao");
    Curso c1 = new Curso("ip2", 60, p1);
    Aluno a1 = new Aluno("João", 19);
    Aluno a2 = new Aluno("Alice", 22, c1);

    a1.exibirInfo();
    a2.exibirInfo();
}
