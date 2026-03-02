package PersonalProject.demo.service;

import PersonalProject.demo.dto.CropRequestDto;
import PersonalProject.demo.dto.CropResponseDto;

import java.util.List;

public interface CropService {

    CropResponseDto createCrop(CropRequestDto cropRequestDto);
    List<CropResponseDto> getllCrops();
    CropResponseDto getCropById(Long id);
    CropResponseDto updateCrop(Long id,CropRequestDto request);
    void deleteCrop(Long id);
    List<CropResponseDto> getCropsByFarmer(Long farmerId);
}
