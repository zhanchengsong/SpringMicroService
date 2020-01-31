package zhancheng.microservices.review.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends CrudRepository<ReviewEntity, String> {
    @Transactional(readOnly = true)
    List<ReviewEntity> findByProductId(int productId);

    Optional<ReviewEntity> findById(int id);

    boolean existsById(int id);
}
