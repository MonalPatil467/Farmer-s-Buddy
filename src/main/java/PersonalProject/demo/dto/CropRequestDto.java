package PersonalProject.demo.dto;

import PersonalProject.demo.enums.Season;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CropRequestDto {
    private String cropName;
    private Double area;
    private Season season;
    private Long farmerId;
}
