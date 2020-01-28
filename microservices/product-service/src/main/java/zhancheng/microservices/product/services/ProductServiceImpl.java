package zhancheng.microservices.product.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import zhancheng.api.product.Product;
import zhancheng.api.product.ProductService;
import zhancheng.util.exception.InvalidInputException;
import zhancheng.util.exception.NotFoundException;
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
        if (productId < 1) throw new InvalidInputException("Invalid productId: " + productId);

        if (productId == 13) throw new NotFoundException("No product found for productId: " + productId);

        return new Product(productId, "name-" + productId, 123, serviceUtil.getServiceAddress());
    }
}
