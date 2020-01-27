package zhancheng.api.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Spring Service class for Product
 */
public interface ProductService {
    /**
     * Sample usage: curl $HOST:$PORT/product/1
     *
     * @param productId
     * @return the product, if found, else null
     */
    @GetMapping(
            value    = "/product/{productId}",
            produces = "application/json")
    Product getProduct(@PathVariable int productId);
}
