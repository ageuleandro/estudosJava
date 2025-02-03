package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //new Aluno() é uma instancia (criação de objeto)
        //aluno1 é uma referência para o objeto aluno

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        String idade = JOptionPane.showInputDialog("Digite a idade do aluno");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        String rg = JOptionPane.showInputDialog("Digite o registro de geral");
        String numeroCpf = JOptionPane.showInputDialog("Digite o numero de CPF");
        String nomeMae = JOptionPane.showInputDialog("Digite o nome do Mae");



        Aluno aluno1 = new Aluno(); //Joao
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai("Ageu Leandro Alves Junior");
        aluno1.setDataMatricula("01/01/2025");
        aluno1.setNomeEscola("Cantinho do Arco-íris");
        aluno1.setSerieMatriculado("Jardim de infância");


        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome do Disciplina " + pos + " ?");
            String notaDisciplina = JOptionPane.showInputDialog("Digite a nota do disciplina " + pos + " ?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(notaDisciplina);
            disciplina.setNota(Double.parseDouble(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }



        System.out.println(aluno1.toString()); //Descricao do objeto na memoria, pode ser sem o toString
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());






/*
        Aluno aluno2 = new Aluno(); //Pedro
        Aluno aluno3 = new Aluno(); //Ageu
        Aluno aluno4 = new Aluno("Maria"); //Construtor com argumentos
        Aluno aluno5 = new Aluno("Rafael", 50);
        //o new chama o contrutor do objeto. (instanciar o objeto)

 */










    }
}
