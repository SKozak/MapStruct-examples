package pl.com.skozak.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.com.skozak.model.entity.Product;
import pl.com.skozak.model.dto.ProductDTO;
import pl.com.skozak.annotation.ProductWithoutDescription;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "description", target = "details")
    Product mapToProduct(ProductDTO productDTO);

    @Mapping(ignore = true, target = "details")
    @ProductWithoutDescription
    Product mapToProductWithoutDescription(ProductDTO productDTO);
}
