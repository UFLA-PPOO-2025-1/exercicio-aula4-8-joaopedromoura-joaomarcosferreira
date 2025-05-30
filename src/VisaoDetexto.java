import java.awt.Color;

public class VisaoDetexto implements VisaoSimulador {
    // Usado para calcular e armazenar estatísticas da simulação
    private EstatisticasCampo estatisticas;

    /*
     * A visão de texto exibe informações sobre a simulação no terminal
     */
    public VisaoDetexto() {
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
        // Nada pra fazer por aqui
    }

    /**
     * Determina se a simulação deve continuar a ser executada.
     * 
     * @return true Se houver mais de uma espécie viva.
     */
    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    /**
     * Exibe informações sobre a simulação no terminal
     * 
     * @param passo Qual iteração do passo está sendo exibida
     * @param campo O campo cujo o estado será exibido
     */
    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        System.out.println("Passo: " + passo + " - " + estatisticas.obterDetalhesPopulacao(campo));
    }

    /**
     * Prepara para uma nova execução
     */
    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {
        // Nada pra fazer por aqui
    }
}