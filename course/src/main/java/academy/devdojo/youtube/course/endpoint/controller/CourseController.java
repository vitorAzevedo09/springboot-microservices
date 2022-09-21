package academy.devdojo.youtube.course.endpoint.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.course.endpoint.service.CourseService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/course")
@Slf4j
public class CourseController {
  private final CourseService courseService;

  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping("/v1/admin/course/")
  public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
    return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
  }
}
