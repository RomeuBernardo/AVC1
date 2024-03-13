/**
 * Classe que representa uma porta lógica AND com duas entradas.
 */
public class PortaLogicaEndDuasEntrada {
    private boolean entrada1;
    private boolean entrada2;

    /**
     * Construtor da classe.
     *
     * @param entrada1 O valor da primeira entrada.
     * @param entrada2 O valor da segunda entrada.
     */
    public PortaLogicaEndDuasEntrada(boolean entrada1, boolean entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    /**
     * Método para exibir os valores das entradas.
     */
    public void mostrarEntradas() {
        System.out.println("Entrada 1 é: " + this.entrada1 + " Entrada 2 é: " + this.entrada2);
    }

    /**
     * Método para calcular e retornar o valor da saída da porta lógica AND.
     *
     * @return O valor da saída da porta lógica AND.
     */
    public boolean caucularSaida() {
        return this.entrada1 && this.entrada2;
    }
}
