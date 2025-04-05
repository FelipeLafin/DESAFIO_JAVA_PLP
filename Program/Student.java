
public class Aluno implements Comparable<Aluno>{
    public String nomes;
    public Integer idades;
    private Double notas;

    public Aluno(String nomes, int idades, Double notas){
        this.nomes = nomes;
        this.idades = idades;
        this.notas = notas;
    }

    public Integer getIdade() {
        return idades;
    }
    public String getNome() {
        return nomes;
    }
    public Double getNota() {
        return notas;
    }

    @Override
    public String toString(){
        return "A nota final do aluno: " + nomes + " de " + idades + " anos é " + notas;
    }

    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(this.notas, outro.notas);
    }
}