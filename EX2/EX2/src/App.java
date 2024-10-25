public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("A");
        fila.enfileirar("C");
        
        int contagem = fila.contarOcorrencias("A");
        System.out.println(contagem); // Imprime "2"
    }
}
