package org.project.ranking_idol_project.service;

import lombok.RequiredArgsConstructor;
import org.project.ranking_idol_project.dto.MemberDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
    }
}
