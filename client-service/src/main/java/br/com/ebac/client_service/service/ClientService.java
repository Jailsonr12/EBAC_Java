package main.java.br.com.ebac.client_service.service;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Client create(Client client) {
        client.setId(null);
        return repository.save(client);
    }

    public Client update(Long id, Client client) {
        Client existing = findById(id);
        existing.setName(client.getName());
        existing.setEmail(client.getEmail());
        existing.setDocument(client.getDocument());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}