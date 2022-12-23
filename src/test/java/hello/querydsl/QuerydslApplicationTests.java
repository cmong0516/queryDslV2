package hello.querydsl;

import hello.querydsl.dto.MemberSearchCondition;
import hello.querydsl.dto.MemberTeamDto;
import hello.querydsl.entity.Member;
import hello.querydsl.entity.Team;
import hello.querydsl.repository.MemberRepository;
import java.util.List;
import javax.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuerydslApplicationTests {

	@Autowired
	EntityManager em;

	@Autowired
	MemberRepository memberRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void searchTest() {

		MemberSearchCondition condition = new MemberSearchCondition();
		condition.setAgeGoe(35);
		condition.setAgeLoe(40);
		condition.setTeamName("teamB");

		List<MemberTeamDto> result = memberRepository.search(condition);

		for (MemberTeamDto memberTeamDto : result) {
			System.out.println(memberTeamDto);
		}

	}

}
