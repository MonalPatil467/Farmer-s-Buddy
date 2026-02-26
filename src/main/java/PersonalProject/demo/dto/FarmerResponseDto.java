package PersonalProject.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FarmerResponseDto {
    private long id;
    private String name;
    private String phoneNo;
    private String village;
}
