package academy.devdojo.youtube.course;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseApplicationTests {

	@Test
	void contextLoads() {
		char a = 'a';
		assertEquals('a', a);
	}

}
