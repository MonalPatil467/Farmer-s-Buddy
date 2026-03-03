package PersonalProject.demo.service;

import PersonalProject.demo.dto.CropRequestDto;
import PersonalProject.demo.dto.CropResponseDto;

import java.util.List;

public interface CropService {



    List<CropResponseDto> getAllCrops();

    List<CropResponseDto> getCropsByFarmerId(Long farmerId);

    CropResponseDto getCropById(Long id);
    CropResponseDto updateCrop(Long id,CropRequestDto request);
    void deleteCrop(Long id);

}
