package zhancheng.microservices.product.services;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import zhancheng.api.product.Product;
import zhancheng.microservices.product.persistence.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    // Create a mapping from Entity to actual object
    // Same name fields are mapped to each other
    // Target field serviceAddress is ignored at target class
    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true)
    })
    Product entityToApi(ProductEntity entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "version", ignore = true)
    })
    ProductEntity apiToEntity(Product api);
}
