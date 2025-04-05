import java.util.*;


public class App {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        String[] nomes = {"Felipe", "Gustavo", "Igor", "Ana", "Beatriz", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel",
        "Helena", "Isabela", "João", "Karen", "Lucas", "Maria", "Nathalia", "Olavo", "Paula", "Ricardo", "Sofia"};

        int[] idades = {25, 30, 22, 19, 35, 40, 28, 33, 21, 27, 31, 26, 24, 29, 23, 32, 34, 38, 36, 37};

        double[] notas = {9.5, 7.8, 6.4, 8.3, 10.0, 5.2, 6.7, 8.9, 7.1, 9.0, 6.0, 8.5, 7.6, 6.9, 7.3, 9.3,
        8.0, 6.1, 7.4, 9.8};
        
        Aluno aluno;
        for(int i = 0; i < notas.length; i++){
            aluno = new Aluno(nomes[i], idades[i], notas[i]);
            alunos.add(aluno);
        }

        System.out.println("\nOrdem de alunos por nota:\n");
        Collections.sort(alunos.reversed());
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        System.out.println("\n------------------------------------------------------\n");

        System.out.println("Ordem de alunos por idade:\n");
        ComparaIdade comparaIdade;
        comparaIdade = new ComparaIdade();
        alunos.sort(comparaIdade.reversed());
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        System.out.println("\n------------------------------------------------------\n");

        System.out.println("Ordem de alunos por nome:\n");
        ComparaNome comparaNome;
        comparaNome = new ComparaNome();
        alunos.sort(comparaNome);
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
    }
}