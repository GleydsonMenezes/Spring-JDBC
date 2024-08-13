package io.github.GleydsonMenezes.domain.repository;

import io.github.GleydsonMenezes.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemsPedido extends JpaRepository <ItemPedido, Integer> {
}
