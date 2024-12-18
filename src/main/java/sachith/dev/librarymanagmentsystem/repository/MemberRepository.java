package sachith.dev.librarymanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sachith.dev.librarymanagmentsystem.entity.Member;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
    Member findByUsernameAndPassword(String username, String password);
    Optional<Member> findByUsername(String username);
}
