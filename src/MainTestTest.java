import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void conterMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Bruno", "Masculino"));
        pessoas.add(new Pessoa("Carla", "Feminino"));
        pessoas.add(new Pessoa("Daniel", "Masculino"));

        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertFalse(mulheres.isEmpty());

        assertTrue(
                mulheres.stream()
                        .allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino")),
                "Achou alguém que não é Feminino na lista de mulheres!"
        );

        assertTrue(
                mulheres.stream()
                        .noneMatch(p -> p.getSexo().equalsIgnoreCase("Masculino")),
                "Tem Masculino na lista de mulheres!"
        );
    }
}