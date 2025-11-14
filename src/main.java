import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Bruno", "Masculino"));
        pessoas.add(new Pessoa("Carla", "Feminino"));
        pessoas.add(new Pessoa("Daniel", "Masculino"));

        List<Pessoa> mulheres = pessoas.stream()
                                        .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                                        .toList();

        List<Pessoa> homens = pessoas.stream()
                                        .filter(p -> p.getSexo().equalsIgnoreCase("Masculino"))
                                        .toList();

        System.out.println("Mulheres:");
        mulheres.forEach(System.out::println);

        System.out.println("\nHomens:");
        homens.forEach(System.out::println);

    }
}
