package site.spadeworker.penterest.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.spadeworker.penterest.domain.member.MemberRepository;
import site.spadeworker.penterest.domain.member.MemoryMemberRepository;

@Configuration
public class SpringConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
