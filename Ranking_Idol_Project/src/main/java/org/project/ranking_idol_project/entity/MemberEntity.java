//package org.project.ranking_idol_project.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.project.ranking_idol_project.dto.MemberDTO;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//
//// spring data jpa 방식 사용중 : DB의 테이블을 자바에서 객체처럼 사용 가능하도록 도와줌
//// entity가 table 역할
//@Entity
//@Setter
//@Getter
//@Table(name = "member_table") // table 이름 지정, 기존 동일명 테이블이 있다면 삭제
//public class MemberEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql에서 auto_increment를 지정함, oracle의 시퀀스
//    private Long id;
//    //내부 column들 지정
//    @Column(unique = true) // unique 제약조건 추가 : 중복된 값 입력 불가능
//    private String memberEmail; // 카멜케이스로 이름을 작성하면 member_email처럼 언더바로 전환해줌
//
//    @Column   //크기 지정 가능
//    private String memberName;
//
//    @Column
//    private String mamberMovie_id;
//
//    @Column
//    private String memberText;
//
//    @Column
//    private String memberDate;
//
//    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
//        MemberEntity memberEntity = new MemberEntity();
//        memberEntity.setMemberEmail(memberDTO.getMemberEmail()); // DTO의 값을 entity형식으로 전달
//        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
//        memberEntity.setMemberName(memberDTO.getMemberName());
//        return memberEntity;
//    }
//}
