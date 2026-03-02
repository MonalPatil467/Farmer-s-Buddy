package PersonalProject.demo.mapper;

import PersonalProject.demo.dto.CropRequestDto;
import PersonalProject.demo.dto.CropResponseDto;
import PersonalProject.demo.entity.Crop;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CropMapper {
    Crop toEntity(CropRequestDto requestDto);
    CropResponseDto toDto(Crop crop);

    void updateCropFromDto(CropRequestDto request, @MappingTarget Crop crop);
}
