package org.project.ranking_idol_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    //회원가입 페이지 요청 출력
    @GetMapping("/save")
    public String saveForm() {  // 지금은 restful API가 아닌 화면을 return 하는 방식으로 control
        return "svae"; // => templates 폴더의 save.html을 찾아감
    }
}
