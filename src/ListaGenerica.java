import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    public List<T> itens = new ArrayList<>();

    public void adicionar(T item){
        itens.add(item);
    }

    public List<T> getItens(){
        return itens;
    }
}

