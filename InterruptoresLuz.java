public class InterruptoresLuz {
    public static void main(String[] args) {
        boolean interruptor1 = false, interruptor2 = false, interruptor3 = false;
        boolean sala1 = false, sala2 = false, sala3 = false;

        // 1. Ligar o interruptor 1 e esperar (simulação)
        interruptor1 = true;
        sala1 = interruptor1;  // Sala 1 fica ligada

        // 2. Desligar o interruptor 1 e ligar o interruptor 2
        interruptor1 = false;
        interruptor2 = true;
        sala2 = interruptor2;  // Sala 2 fica ligada

        if (sala1) {
            System.out.println("O interruptor 1 acende a lâmpada da sala 1.");
        }
        if (sala2) {
            System.out.println("O interruptor 2 acende a lâmpada da sala 2.");
        }
        if (!sala1 && !sala2) {
            System.out.println("O interruptor 3 acende a lâmpada da sala 3.");
        }
    }
}
