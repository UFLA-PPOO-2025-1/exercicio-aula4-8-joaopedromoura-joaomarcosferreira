import java.awt.Color;

public class VisaoDetexto implements VisaoSimulador {
    private EstatisticasCampo estatisticas;

    public VisaoDetexto() {
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
        // Nada pra fazer por aqui
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        System.out.println("Passo: " + passo + " - " + estatisticas.obterDetalhesPopulacao(campo));
    }

    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {
        // Nada pra fazer por aqui
    }
}