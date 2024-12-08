package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {

    private Long id;
    private String description;
    private Long price;
    private Long count;
}
