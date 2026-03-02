package PersonalProject.demo.dto;

import PersonalProject.demo.enums.Season;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder

public class CropResponseDto {
    private Long id;
    private String cropName;
    private Double area;
    private Season season;
    private Long farmerId;
}
