
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntesDepois {

	@BeforeEach
	void before() {
		System.out.println("@Before");
	}
	
	@AfterEach
	void after() {
		System.out.println("@After");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("@BeforeAll");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("@AfterAll");
	}	
	
	@Test
	void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	void test3() {
		System.out.println("Teste 3");
	}	

}
