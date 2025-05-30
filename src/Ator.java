import java.util.List;

public interface Ator {
    // Classe que serve de interface para qualquer ator presente na simulação

    boolean estaVivo();

    void agir(List<Ator> novosAtores);
}