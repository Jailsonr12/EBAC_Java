package main.br.com.rpires;

import br.com.rpires.dao.ProdutoDAO;
import main.br.com.rpires.dao.IProdutoDAO;
import main.br.com.rpires.domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void crudlProdutoTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("P01");
        produto.setNome("Teclado Mecânico");

        Integer qtd = dao.cadastrar(produto);
        assertNotNull(qtd);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setNome("Teclado Mecânico RGB");
        Integer qtdAtualizar = dao.atualizar(produtoBD);
        assertNotNull(qtdAtualizar);
        assertTrue(qtdAtualizar == 1);

        Produto produtoAtualizado = dao.consultar(produtoBD.getCodigo());
        assertNotNull(produtoAtualizado);
        assertEquals("Teclado Mecânico RGB", produtoAtualizado.getNome());

        // Listar (buscarTodos)
        List<Produto> produtos = dao.buscarTodos();
        assertNotNull(produtos);
        assertFalse(produtos.isEmpty());

        boolean achou = false;
        for (Produto p : produtos) {
            if (p.getCodigo().equals(produto.getCodigo())) {
                achou = true;
                break;
            }
        }
        assertTrue(achou);
        Integer qtdDel = dao.excluir(produtoAtualizado);
        assertNotNull(qtdDel);
        assertTrue(qtdDel == 1);
    }
}
