package zhancheng.microservices.product.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import zhancheng.api.product.Product;
import zhancheng.api.product.ProductService;
import zhancheng.util.http.ServiceUtil;

@RestController
public class ProductServiceImpl implements ProductService {
    private final ServiceUtil serviceUtil;
    @Autowired
    public ProductServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }
    @Override
    public Product getProduct(int productId) {
        return new Product(productId, "name-" + productId, 123,
                serviceUtil.getServiceAddress());
    }
}
