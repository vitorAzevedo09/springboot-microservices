package academy.devdojo.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import academy.devdojo.youtube.core.model.ApplicationUser;

@Repository
public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long>{
  ApplicationUser findByUsername(String username);
}
