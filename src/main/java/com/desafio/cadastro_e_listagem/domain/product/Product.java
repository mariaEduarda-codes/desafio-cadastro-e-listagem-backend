package com.desafio.cadastro_e_listagem.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    private Double price;

    private Boolean isAvailableForSale;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.description = requestProduct.description();
        this.price = requestProduct.price();
        this.isAvailableForSale = requestProduct.isAvailableForSale();
    }
}
