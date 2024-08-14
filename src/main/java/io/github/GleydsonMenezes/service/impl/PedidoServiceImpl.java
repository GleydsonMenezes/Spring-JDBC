package io.github.GleydsonMenezes.service.impl;

import io.github.GleydsonMenezes.domain.repository.Pedidos;
import io.github.GleydsonMenezes.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos resposity;

    public PedidoServiceImpl(Pedidos resposity) {
        this.resposity = resposity;
    }
}
