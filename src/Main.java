public class Main {
    public static void main(String[] args) {
        ListaGenerica<Carro> lista = new ListaGenerica<>();

        lista.adicionar(new Honda());
        lista.adicionar(new Toyota());

        for (Carro c : lista.getItens()) {
            c.acelerar();
        }
    }
}
