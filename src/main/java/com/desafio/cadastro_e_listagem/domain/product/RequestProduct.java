package com.desafio.cadastro_e_listagem.domain.product;

public record RequestProduct(String name,
                             String description,
                             Double price,
                             Boolean isAvailableForSale) {
}
