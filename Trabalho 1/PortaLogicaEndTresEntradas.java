/**
 * Classe que representa uma porta lógica AND com três entradas.
 */
public class PortaLogicaEndTresEntradas {

    /**
     * Construtor padrão da classe.
     */
    public PortaLogicaEndTresEntradas() {}

    /**
     * Método para calcular a saída da porta lógica AND com três entradas.
     *
     * @param entrada1 O valor da primeira entrada.
     * @param entrada2 O valor da segunda entrada.
     * @param entrada3 O valor da terceira entrada.
     * @return O resultado da operação lógica AND com três entradas.
     */
    public boolean calcularSaidaFinal(boolean entrada1, boolean entrada2, boolean entrada3) {
        // Criando uma instância da classe PortaLogicaEndDuasEntrada para calcular a saída com duas entradas
        PortaLogicaEndDuasEntrada porta = new PortaLogicaEndDuasEntrada(entrada1, entrada2);
        // Realizando a operação lógica AND entre a saída da porta com duas entradas e a terceira entrada
        return porta.caucularSaida() && entrada3;
    }
}

