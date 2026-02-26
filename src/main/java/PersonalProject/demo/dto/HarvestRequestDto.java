package PersonalProject.demo.dto;

import lombok.Data;

@Data
public class HarvestRequestDto {
    private Double quantity;
    private Double pricePerUnit;
    private Long cropId;
}
