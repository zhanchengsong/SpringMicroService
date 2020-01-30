package zhancheng.microservices.product.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, String> {
    // Naming convention declaration of query
    Optional<ProductEntity> findByProductId(int productId);
}
