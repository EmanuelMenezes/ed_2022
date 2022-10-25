public class Questao2 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];

    }

    public static Aluno[] inserirAlunoNaPrimeiraPosicaoDisponivel(Aluno[] alunos) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = 123;
        aluno.curso = "ADS";
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
        return alunos;
    }

    public static void imprimirAlunos(Aluno[] alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static Aluno[] removerAlunoPorMatricula(Aluno[] alunos, int matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].matricula == matricula) {
                alunos[i] = null;
                break;
            }
        }
        return alunos;
    }

    public static int imprimirNumeroPosicoesVazias(Aluno[] alunos) {
        int numeroPosicoesVazias = 0;
        for (Aluno aluno : alunos) {
            if (aluno == null) {
                numeroPosicoesVazias++;
            }
        }
        System.out.println(numeroPosicoesVazias);
        return numeroPosicoesVazias;
    }

    public static Aluno[] adicionarAlunoAumentarArrayCasoNecessario(Aluno[] alunos) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = 123;
        aluno.curso = "ADS";
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
            if (i == alunos.length - 1) {
                Aluno[] novoArray = new Aluno[alunos.length + 5];
                for (int j = 0; j < alunos.length; j++) {
                    novoArray[j] = alunos[j];
                }
                novoArray[alunos.length] = aluno;
                alunos = novoArray;
            }
        }
        return alunos;
    }

    public static Aluno[] inserirAlunoUltimaPosicao(Aluno[] alunos) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = 123;
        aluno.curso = "ADS";
        if (alunos[alunos.length - 1] == null) {
            alunos[alunos.length - 1] = aluno;
        } else {
            Aluno[] novoArray = new Aluno[alunos.length + 5];
            for (int j = 0; j < alunos.length; j++) {
                novoArray[j] = alunos[j];
            }
            novoArray[alunos.length] = aluno;
            alunos = novoArray;
        }
        return alunos;
    }

    public static Aluno[] inserirAlunoPrimeiraPosicao(Aluno[] alunos) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = 123;
        aluno.curso = "ADS";
        if (alunos[0] == null) {
            alunos[0] = aluno;
        } else {
            Aluno[] novoArray = new Aluno[alunos.length + 5];
            for (int j = 0; j < alunos.length; j++) {
                novoArray[j + 1] = alunos[j];
            }
            novoArray[0] = aluno;
            alunos = novoArray;
        }
        return alunos;
    }
}
