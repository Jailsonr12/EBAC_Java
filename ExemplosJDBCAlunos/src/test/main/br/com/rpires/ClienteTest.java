/**
 *
 */
package br.com.rpires;

import org.junit.Test;

import br.com.rpires.dao.ClienteDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Rodrigo Pires");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setNome("Rodrigo Pires Atualizado");
        Integer qtdAtualizar = dao.atualizar(clienteBD);
        assertNotNull(qtdAtualizar);
        assertTrue(qtdAtualizar == 1);

        Cliente clienteAtualizado = dao.consultar(clienteBD.getCodigo());
        assertNotNull(clienteAtualizado);
        assertEquals("Rodrigo Pires Atualizado", clienteAtualizado.getNome());

        List<Cliente> clientes = dao.buscarTodos();
        assertNotNull(clientes);
        assertFalse(clientes.isEmpty());

        boolean achou = false;
        for (Cliente c : clientes) {
            if (c.getCodigo().equals(cliente.getCodigo())) {
                achou = true;
                break;
            }
        }
        Integer qtdDel = dao.excluir(clienteAtualizado);
        assertNotNull(qtdDel);
        assertTrue(qtdDel == 1);
    }
}
