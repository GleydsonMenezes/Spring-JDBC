package io.github.GleydsonMenezes.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "data_pedido")
    private LocalDate dataPedido;

    @Column(name = "total", length = 20, precision = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;


}
