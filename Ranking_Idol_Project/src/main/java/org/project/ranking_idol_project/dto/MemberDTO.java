//package org.project.ranking_idol_project.dto;
//
//import lombok.*;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Getter
//@Setter
//@NoArgsConstructor  // 기본 생성자 자동 생성
//@AllArgsConstructor // 필드를 모두 매개변수로 하는 생성자를 만들어준다
//@ToString
//public class MemberDTO {
//    //DTO : 회원정보에 필요한 내용들을 필드로 정의하고 해당 필드를 private으로 선언한다. 값은 getter,setter로 간접 접근해 사용한다.
//    //lombok : getter, setter 어노테이션을 통해 getter, setter를 자동으로 만들어준다
//    private Long id;
//    private String memberEmail;
//    private String memberPassword;
//    private String memberName;
//}