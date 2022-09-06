package academy.devdojo.youtube.course.endpoints.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.model.Course;
import academy.devdojo.youtube.course.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
@Slf4j
public class CourseService {
	private static final Logger log = LoggerFactory.getLogger(CourseService.class);
	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	public CourseRepository getcourseRepository() {
		return courseRepository;
	}
	
	public Iterable<Course> list(Pageable pageable) {
		log.info("Listing all courses");
		return courseRepository.findAll(pageable);
	}
	
}
