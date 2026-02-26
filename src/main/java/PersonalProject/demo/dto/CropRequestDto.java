package PersonalProject.demo.dto;

import lombok.Data;

@Data
public class CropRequestDto {
    private String cropNmae;
    private String area;
    private String season;
    private String farmerId;
}
