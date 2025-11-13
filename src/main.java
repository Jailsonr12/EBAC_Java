public class main {

    public static void main(String[] args) {
        Class<?> clazz = Cliente.class;

        Tabela tabela = clazz.getAnnotation(Tabela.class);

        String nomeTabela = tabela.value();

        System.out.println("Nome da anotação:" + nomeTabela);

    }
}
