package io.github.GleydsonMenezes;


import io.github.GleydsonMenezes.domain.entity.Cliente;
import io.github.GleydsonMenezes.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class Main {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {

            clientes.salvar(new Cliente ("Douglas"));
            clientes.salvar(new Cliente("Gleydson"));

           List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado.");
                clientes.atualizar(c);
            });

            clientes.buscarPorNome("Gle").forEach(System.out::println);

            clientes.obterTodos().forEach(c -> {
                clientes.deletar(c);
            });

            todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);



    }
}