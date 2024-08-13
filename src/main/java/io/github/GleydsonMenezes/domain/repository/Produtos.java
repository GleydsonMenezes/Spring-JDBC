package io.github.GleydsonMenezes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.GleydsonMenezes.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
