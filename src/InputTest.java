import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	Student jimin;
	
	@Before
	public void init() {
		//jimin = new Student();
	}
	@Ignore@Test
	public void testInput() {
		Input input = new Input();
		input.input(jimin);
		//assertEquals("한지민",jimin.name);
	}
	
	@Test
	//assertEqals 라이브러리는 두 값을 비교해서 같으면 초록색 다르면 빨간색으로 표시됨
	public void testCalc() {
		Calc calc = new Calc();
		//jimin.kor=100; jimin.eng=90; jimin.mat=80;
		calc.calc(jimin);
		//assertEquals(270,jimin.tot);
		//assertEquals(270/3, (int)jimin.avg);
		//assertEquals('A', jimin.grade);
	}

}
