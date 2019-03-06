package pl.com.skozak.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.com.skozak.model.SomeDictionary;
import pl.com.skozak.model.Source;
import pl.com.skozak.model.Target;

import java.util.UUID;

@Mapper(imports = {UUID.class, SomeDictionary.class},componentModel = "spring")
public interface SourceTargetMapper {

    @Mapping(target = "id", source = "sourceId", defaultExpression = "java( UUID.randomUUID().toString() )")
    Target sourceToTarget(Source s);


    @Mapping(target = "dictionary",
            expression = "java( new SomeDictionary( s.getKey(), s.getValue() ) )")
    Target sourceToTargetWithCustomObject(Source s);
}
