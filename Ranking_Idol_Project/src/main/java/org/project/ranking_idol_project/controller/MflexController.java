package org.project.ranking_idol_project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.ranking_idol_project.document.MflexDocument;
import org.project.ranking_idol_project.service.MflexService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MflexController {

    private final MflexService mflexService;

//    @GetMapping(value = "/mflex")
//    public String apiKeyTest(@RequestParam String name) {
//        MflexDocument mflexDocument = mflexService.getMflexData(name);
//       log.info("MongoController. airbnbDto : {}", mflexDocument);
//        return "save";
//    }
    @GetMapping("/mflex")
    public String saveForm() {  // 지금은 restful API가 아닌 화면을 return 하는 방식으로 control
        return "save"; // => templates 폴더의 save.html을 찾아감
    }
}
