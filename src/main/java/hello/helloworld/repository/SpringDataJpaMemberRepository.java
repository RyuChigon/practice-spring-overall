package hello.helloworld.repository;

import hello.helloworld.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL: select m from member where m.name = ?. ID는 JpaRepository에서 처리가 되지만
    // Name과 같은 통되지 않은 특성은 정의를 해주어야 한다.
    @Override
    Optional<Member> findByName(String name);
}
