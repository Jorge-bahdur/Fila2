import java.util.LinkedList;

public class Fila {
    private LinkedList<Object> elementos;

    public Fila() {
    this.elementos = new LinkedList<>();
    }
    
    public void enfileirar(Object valor) {
    elementos.addLast(valor);
    }
    
    public Object desenfileirar() {
    if (!elementos.isEmpty()) {
    return elementos.removeFirst();
    }
    return null; // Se a fila estiver vazia
    }
    
    public int contarOcorrencias(Object valor) {
    int contagem = 0;
    for (Object elemento : elementos) {
    if (elemento.equals(valor)) {
    contagem++;
    }
    }
    return contagem;
    }
    
}
