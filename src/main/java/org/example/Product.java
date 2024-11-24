package org.example;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Setter
@lombok.Getter
@lombok.ToString
public class Product {

    private Long id;
    private String description;
    private Long price;
    private Long count;
}
