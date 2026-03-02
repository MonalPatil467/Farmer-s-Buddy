package PersonalProject.demo.controller;

import PersonalProject.demo.repository.CropRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
public class cropController {
    CropRepository cropRepository;

}
