package cursojava.executavel;

import cursojava.classes.Aluno;

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

        String disciplina1 = JOptionPane.showInputDialog("Digite o disciplina 1");
        String nota1 = JOptionPane.showInputDialog("Digite a nota1");

        String disciplina2 = JOptionPane.showInputDialog("Digite o disciplina 2");
        String nota2 = JOptionPane.showInputDialog("Digite a nota2");

        String disciplina3 = JOptionPane.showInputDialog("Digite o disciplina 3");
        String nota3 = JOptionPane.showInputDialog("Digite a nota3");

        String disciplina4 = JOptionPane.showInputDialog("Digite o disciplina 4");
        String nota4 = JOptionPane.showInputDialog("Digite a nota4");

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

        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);
        // sempre resgata o objeto e seta o atributo




        Aluno aluno2 = new Aluno(); //Pedro
        Aluno aluno3 = new Aluno(); //Ageu
        Aluno aluno4 = new Aluno("Maria"); //Construtor com argumentos
        Aluno aluno5 = new Aluno("Rafael", 50);
        //o new chama o contrutor do objeto. (instanciar o objeto)

        System.out.println(aluno1.toString()); //Descricao do objeto na memoria, pode ser sem o toString
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());




        /*Equals e hashcode (Diferenciar objetos)*/
/*
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ageu");
        aluno1.setNumeroCpf("01462719120");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ageu");
        aluno2.setNumeroCpf("26182548304");

        if (aluno1.equals(aluno2)) {
            System.out.println("Alunos Iguais");
        }else {
            System.out.println("Alunos Diferentes");
        }

 */



    }
}
