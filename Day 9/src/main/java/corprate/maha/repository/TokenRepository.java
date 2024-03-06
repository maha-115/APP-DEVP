package corprate.maha.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import corprate.maha.model.Token;


public interface TokenRepository extends JpaRepository<Token,String> {

    List<Token> findAllByUser_IdAndExpiredIsFalseAndRevokedIsFalse(String id);

    Optional<Token> findByToken(String token);

}

