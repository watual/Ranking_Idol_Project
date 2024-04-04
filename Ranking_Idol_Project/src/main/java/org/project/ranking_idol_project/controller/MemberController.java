//package org.project.ranking_idol_project.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.project.ranking_idol_project.dto.MemberDTO;
//import org.project.ranking_idol_project.service.MemberService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//@RequiredArgsConstructor
//public class MemberController {
//    // 생성자 주입 > [아래 필드를 매개변수로 하는] [위 컨트롤 생성자]를 RequiredArgsConstructor 어노테이션이 만들어준다.
//    // Controller 클래스가 Service 클래스의 객체들을 주입받는다. / 메서드나 필드 등을 사용할 수 있게 된다.
//    private final MemberService memberService;
//    //회원가입 페이지 요청 출력
//    @GetMapping("/member/save")
//    public String saveForm() {  // 지금은 restful API가 아닌 화면을 return 하는 방식으로 control
//
//        return "save"; // => templates 폴더의 save.html을 찾아감
//    }
//
//    @PostMapping("/member/save")
//    public String save(@ModelAttribute MemberDTO memberDTO) {
//
//        System.out.println("MemberController.save");
//        // soutp 모든 파라매서 print
//        System.out.println("memberDTO = " + memberDTO);
//        // MemberService memberService = new MemberService(); 등의 객체 생성방법을 Spring에선 선호하지 않는다.
//        // 객체 주입 방식에는 3가지가 있으며 여기선 생성자 주입 방식을 쓴다.
//        memberService.save(memberDTO);
//        return "index";
//    }
//}
