package hello.querydsl.repository;

import hello.querydsl.entity.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long>, MemberRepositoryCustom {
    List<Member> findByUsername(String username);
}
