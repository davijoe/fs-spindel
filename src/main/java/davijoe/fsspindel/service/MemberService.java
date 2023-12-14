package davijoe.fsspindel.service;

import davijoe.fsspindel.entity.Member;
import davijoe.fsspindel.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Invalid member Id:" + id));
    }
}
