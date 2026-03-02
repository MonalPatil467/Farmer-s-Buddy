package PersonalProject.demo.service.impl;

import PersonalProject.demo.dto.CropRequestDto;
import PersonalProject.demo.dto.CropResponseDto;
import PersonalProject.demo.entity.Crop;
import PersonalProject.demo.entity.Farmer;
import PersonalProject.demo.mapper.CropMapper;
import PersonalProject.demo.repository.CropRepository;
import PersonalProject.demo.repository.FarmerRepository;
import PersonalProject.demo.service.CropService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CropServiceImpl implements CropService {
private final CropRepository cropRepository;
private final FarmerRepository farmerRepository;
private final CropMapper cropMapper;
    @Override
    public CropResponseDto createCrop(CropRequestDto request) {
        Farmer farmer=farmerRepository.findById(request.getFarmerId()).orElseThrow(()->
                new RuntimeException("farmer not found"));
        Crop crop=cropMapper.toEntity(request);
          crop.setFarmer(farmer);
          Crop saved=cropRepository.save(crop);
          return cropMapper.toDto(crop);
    }
    @Override
    public List<CropResponseDto> getllCrops() {
        return cropRepository.findAll()
                .stream()
                .map(cropMapper ::toDto)
                .toList();
    }

    @Override
    public CropResponseDto getCropById(Long id) {
        Crop crop=cropRepository.findById(id).orElseThrow(()->new RuntimeException("crop not found"));
        return cropMapper.toDto(crop);
    }

    @Override
    public CropResponseDto updateCrop(Long id, CropRequestDto request) {
        Crop crop= cropRepository.findById(id).orElseThrow(()->new RuntimeException("crop not found"));
        if(!crop.getFarmer().getId().equals(request.getFarmerId())){
            throw new RuntimeException("you are not allowed to update the credentials");
        }
        cropMapper.updateCropFromDto(request,crop);
        Crop savedCrop=cropRepository.save(crop);
        return cropMapper.toDto(savedCrop);
    }

    @Override
    public void deleteCrop(Long id) {
        Crop crop= cropRepository.findById(id).orElseThrow(()->new RuntimeException("crop not found"));
        cropRepository.delete(crop);
    }

    @Override
    public List<CropResponseDto> getCropsByFarmer(Long farmerId) {
        List<Crop> crops=cropRepository.findByFarmerId(farmerId);
        return crops.stream()
                .map(cropMapper::toDto)
                .toList();
    }

}
