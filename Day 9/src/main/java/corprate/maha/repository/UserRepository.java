package corprate.maha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import corprate.maha.model.User;

public interface UserRepository extends JpaRepository<User , String> {

    Optional<User> findByEmail(String email);

}

