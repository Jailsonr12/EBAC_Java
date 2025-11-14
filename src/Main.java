import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Bruno", "Masculino"));
        pessoas.add(new Pessoa("Carla", "Feminino"));
        pessoas.add(new Pessoa("Daniel", "Masculino"));

        List<Pessoa> mulheres = filtrarMulheres(pessoas);
        List<Pessoa> homens = filtrarHomens(pessoas);

        System.out.println("Mulheres:");
        mulheres.forEach(System.out::println);

        System.out.println("\nHomens:");
        homens.forEach(System.out::println);
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }

    public static List<Pessoa> filtrarHomens(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Masculino"))
                .collect(Collectors.toList());
    }
}
