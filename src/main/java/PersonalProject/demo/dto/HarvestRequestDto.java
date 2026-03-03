package PersonalProject.demo.dto;

public record HarvestRequestDto(Double quantity,
                                Double pricePerUnit,
                                Long cropId) {
}
