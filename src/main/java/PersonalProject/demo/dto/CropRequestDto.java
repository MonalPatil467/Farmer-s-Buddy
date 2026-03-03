package PersonalProject.demo.dto;

import PersonalProject.demo.enums.Season;
import lombok.Data;


public record CropRequestDto(
         String cropName,
         Double area,
        Season season,
        Long FarmerId
) {

}
