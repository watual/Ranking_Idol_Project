//package org.project.ranking_idol_project.service;
//
//import lombok.RequiredArgsConstructor;
//import org.project.ranking_idol_project.dto.MemberDTO;
//import org.project.ranking_idol_project.entity.MemberEntity;
//import org.project.ranking_idol_project.repository.MflexRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//    private final MflexRepository mflexRepository;
//    public void save(MemberDTO memberDTO) {
//        // 1. dto -> entity 변환
//        // 2. repository의 save 메소드 호출
//        // 방법 1. service클래스에서 별도의 메소드를 하나 두고 바꾸는 방법
//        // 방법 2. entity 메소드에다 변환하는 팩트리 메소드를 두고 하는 방법[변환방법 빌더패턴 사용, 일반메소드 방식 사용 등]
//        MemberEntity.toMemberEntity(memberDTO);
//        // repository의 save메소드 호출(조건 entity객체를 넘겨줘야 함
//    }
//}
