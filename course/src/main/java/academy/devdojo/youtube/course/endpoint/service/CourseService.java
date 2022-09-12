package academy.devdojo.youtube.course.endpoint.service;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CourseService {
    private final CourseRepository courseRepository;
    private final Logger log = LoggerFactory.getLogger(CourseService.class);
    
    public CourseService(CourseRepository courseRepository) {
    	this.courseRepository = courseRepository;  
	}
    
    public Iterable<Course> list(Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}