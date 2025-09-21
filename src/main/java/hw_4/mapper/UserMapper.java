package hw_4.mapper;

import hw_4.dto.UserRequestDTO;
import hw_4.dto.UserResponseDTO;
import hw_4.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationTime", ignore = true)
    User toEntity(UserRequestDTO dto);

    UserResponseDTO toDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationTime", ignore = true)
    void updateEntityFromDTO(UserRequestDTO dto, @MappingTarget User user);
}