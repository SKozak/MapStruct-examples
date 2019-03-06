package pl.com.skozak;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "description", target = "details")
    Product mapToProduct(ProductDTO productDTO);

    @Mapping(ignore = true, target = "details")
    @ProductWithoutDescription
    Product mapToProductWithoutDescription(ProductDTO productDTO);
}
