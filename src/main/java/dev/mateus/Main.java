package dev.mateus;

import dev.mateus.model.Cliente;
import dev.mateus.model.Produto;
import dev.mateus.repository.InMemoryRepository;

public class Main {
    static class ProdutoRepository extends InMemoryRepository<Produto> {}
    static class ClienteRepository extends InMemoryRepository<Cliente> {}

    public static void main(String[] args) {
        ProdutoRepository produtoRepo = new ProdutoRepository();
        ClienteRepository clienteRepo = new ClienteRepository();

        Produto p1 = new Produto(1, "Laptop", 3500.0);
        Produto p2 = new Produto(2, "Teclado", 150.0);
        produtoRepo.save(p1);
        produtoRepo.save(p2);
        
        Cliente c1 = new Cliente(1, "João Silva", "joao@email.com");
        Cliente c2 = new Cliente(2, "Maria Souza", "maria@email.com");
        clienteRepo.save(c1);
        clienteRepo.save(c2);

        System.out.println("Lista de Produtos:");
        for (Produto p : produtoRepo.findAll()) {
            System.out.println(p);
        }

        System.out.println("\nLista de Clientes:");
        for (Cliente c : clienteRepo.findAll()) {
            System.out.println(c);
        }
    }
}