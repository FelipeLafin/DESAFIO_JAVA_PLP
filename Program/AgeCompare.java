import java.util.*;

class ComparaIdade implements Comparator<Aluno> {
    @Override
    public int compare(Aluno i1, Aluno i2) {
        return i1.getIdade().compareTo(i2.getIdade());
    }
}