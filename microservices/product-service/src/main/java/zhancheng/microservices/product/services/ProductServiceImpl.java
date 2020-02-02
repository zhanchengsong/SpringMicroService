package zhancheng.microservices.product.services;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import zhancheng.api.product.Product;
import zhancheng.api.product.ProductService;
import zhancheng.microservices.product.persistence.ProductEntity;
import zhancheng.microservices.product.persistence.ProductRepository;
import zhancheng.util.exception.InvalidInputException;
import zhancheng.util.exception.NotFoundException;
import zhancheng.util.http.ServiceUtil;

@RestController
public class ProductServiceImpl implements ProductService {
    private final ServiceUtil serviceUtil;
    private final ProductRepository repository;
    private final ProductMapper mapper;
    @Autowired
    public ProductServiceImpl(ProductRepository repository, ServiceUtil serviceUtil, ProductMapper mapper) {
        this.serviceUtil = serviceUtil;
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public Product getProduct(int productId) {
        if (productId < 1) throw new InvalidInputException("Invalid productId: " + productId);
        // orElseThrow takes an Exception supplier, which can be defined as annonymaus function that throws and exception
        ProductEntity entity = repository.findByProductId(
                productId).orElseThrow(() -> new NotFoundException("No product found for productId: " + productId)
        );
        Product response = mapper.entityToApi(entity);
        response.setServiceAddress(serviceUtil.getServiceAddress());
        return response;
    }

    @Override
    public Product createProduct(Product body) {
        try {
            ProductEntity entity = mapper.apiToEntity(body);
            ProductEntity newEntity = repository.save(entity);
            return mapper.entityToApi(newEntity);
        } catch (DuplicateKeyException dke) {
            throw new InvalidInputException("Duplicate key, Product Id: " +
                    body.getProductId());
        }
    }

    @Override
    public void deleteProduct(int productId) {
        // Java function passed in as annymous function for Consumer
        // Magical lambda after Java 8
        repository.findByProductId(productId).ifPresent(entity -> repository.delete(entity));
    }
}
