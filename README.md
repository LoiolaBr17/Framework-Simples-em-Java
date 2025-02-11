# Framework Simples em Java

## About <a name = "about"></a>
Crud simples para demonstrar uma interface genérica.

## Getting Started <a name = "getting_started"></a>

## Usage
Passo 1:
Crie um model 
``` java
package dev.mateus.model;

public class Produto {
    private final int id;
    private final String nome;
    private final double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome='" + nome + '\'' + ", preco=" + preco + '}';
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

```

Passo 2:
Crie uma nova classe estática para o modelo acima que implemente InMemoryRepository passando o model
acima para ser substituido pelo tipo genérico

```java
    static class ProdutoRepository extends InMemoryRepository<Produto> {}
``` 

Passo 3: Teste as operações de crud:
```java
    Produto p1 = new Produto(1, "Laptop", 3500.0);
    Produto p2 = new Produto(2, "Teclado", 150.0);
    produtoRepo.save(p1);
    produtoRepo.save(p2);
```


### Prerequisites
Java JDK 11 

### Installing
Para iniciar a aplicação Digite:
    java -jar app.jar


