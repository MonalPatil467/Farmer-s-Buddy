package PersonalProject.demo.service.impl;

import PersonalProject.demo.dto.CropRequestDto;
import PersonalProject.demo.dto.CropResponseDto;
import PersonalProject.demo.entity.Crop;
import PersonalProject.demo.mapper.CropMapper;
import PersonalProject.demo.repository.CropRepository;
import PersonalProject.demo.service.CropService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CropServiceImpl implements CropService {

    private final CropRepository cropRepository;
    private final CropMapper cropMapper;

    @Override
    public CropResponseDto createCrop(CropRequestDto request) {
        Crop crop = cropMapper.toEntity(request);
        Crop savedCrop = cropRepository.save(crop);
        return cropMapper.toDto(savedCrop);
    }

    @Override
    public List<CropResponseDto> getAllCrops() {
        return List.of();
    }

    @Override
    public CropResponseDto updateCrop(Long id, CropRequestDto request) {
        Crop crop = cropRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Crop not found"));

        if (!crop.getFarmer().getId().equals(request.FarmerId())) {
            throw new RuntimeException("Farmer mismatch");
        }

        cropMapper.updateCropFromDto(request, crop);
        Crop savedCrop = cropRepository.save(crop);
        return cropMapper.toDto(savedCrop);
    }

    @Override
    public void deleteCrop(Long id) {
        Crop crop = cropRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Crop not found"));
        cropRepository.delete(crop);
    }

    @Override
    public List<CropResponseDto> getCropsByFarmer(Long farmerId) {
        return List.of();
    }

    @Override
    public List<CropResponseDto> getCropsByFarmerId(Long farmerId) {
        return cropRepository.findByFarmerId(farmerId)
                .stream()
                .map(cropMapper::toDto)
                .toList();
    }

    @Override
    public CropResponseDto getCropById(Long id) {
        Crop crop = cropRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Crop not found"));
        return cropMapper.toDto(crop);
    }
}
