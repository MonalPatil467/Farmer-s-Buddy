package PersonalProject.demo.dto;

import PersonalProject.demo.enums.Season;

public record CropResponseDto(
        Long id,
         String cropName,
         Double area,
         Season season,
         Long farmerId) {
}
