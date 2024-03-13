import java.util.Scanner;
// Romeu Bernardo Pedro : 30131
public class Main {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);        
        System.out.println("Digite as  Três Entradas OBS:Valores  Em Booleanos");
        boolean valor1  = ler.nextBoolean();
        boolean valor2  = ler.nextBoolean();
        boolean valor3  = ler.nextBoolean();
        PortaLogicaEndDuasEntrada porta2 = new PortaLogicaEndDuasEntrada(valor1,valor2);
        PortaLogicaEndTresEntradas porta3 = new PortaLogicaEndTresEntradas();
        
        while (true) {
            System.out.println("1-Mostrar Entradas \n 2-Caucular Saida Com Duas Entradas \n 3-Caucular Saida Com Três Entradas\n 4-Sair \n");
            int op = ler.nextInt();
            switch (op) {
                case 1: porta2.mostrarEntradas(); 
                break;
                case 2:System.out.println("\nSaída Com duas entradas é : "+ porta2.caucularSaida()); break;
                case 3: System.out.println("\nSaída Com três entradas é : "+ porta3.calcularSaidaFinal(valor1, valor2, valor3)); 
                break;
                case 4: break;
                default: System.out.println("Opção Inválida\n");
                break;
            }
            if(op==4)break;
        }
    }
}
