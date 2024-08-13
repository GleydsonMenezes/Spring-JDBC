package io.github.GleydsonMenezes.domain.repository;

import io.github.GleydsonMenezes.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
