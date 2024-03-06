package corprate.maha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corprate.maha.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, String> {


}
