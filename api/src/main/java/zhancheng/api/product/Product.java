package zhancheng.api.product;

import lombok.*;

@Getter
@AllArgsConstructor
public class Product {
    private int productId;
    private String name;
    private int weight;
    private String serviceAddress;
}

