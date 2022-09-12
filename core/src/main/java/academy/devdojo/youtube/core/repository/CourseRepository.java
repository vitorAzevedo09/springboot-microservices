package academy.devdojo.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import academy.devdojo.youtube.core.model.Course;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
}
