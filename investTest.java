package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Detyra.Investment;

class investTest {

	private static final double DELTA = 0.01;
	
	@Test
	public void invest_returnsInvestmentments_allParametersCorrect(){
		assertEquals(1758, Investment.invest(1500, 4, 4.3), DELTA);
	}
	
	@Test
	public void invest_returnsInvestmentments_allParametersLarger(){
		assertEquals(3828, Investment.invest(3000, 6, 4.6), DELTA);
	}
	
	@Test
	public void invest_returnsInvestmentments_firstParam0(){
		assertEquals(0, Investment.invest(0, 10, 3.8), DELTA);
	}
	
	@Test
	public void invest_returnsInvestmentments_secondParam0(){
		assertEquals(4000, Investment.invest(4000, 0, 3.8), DELTA);
	}

	@Test
	public void invest_returnsInvestmentments_thirdParam0(){
		assertEquals(2000, Investment.invest(2000, 10, 0), DELTA);
	}

}
