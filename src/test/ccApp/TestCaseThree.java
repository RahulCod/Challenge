package test.ccApp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.Wallet.Wallet;
import com.ccApp.IPerson;
import com.ccApp.Person;
import com.ccApp.cc.CreditCard;
import com.ccApp.cc.MC;
import com.ccApp.cc.Visa;

public class TestCaseThree {
	
	private IPerson person = null;

	@Before
	public void doBeforeEachCase() {
		person = new Person();
	}
	
	@Test
	public void testCaseThree() {
		TestCaseTwo t=new TestCaseTwo();
		t.testCaseTwo();
		Person personTwo = new Person();
		List<CreditCard> cards = new ArrayList<CreditCard>();
		cards.add(new Visa().getCreditCard(100));
		cards.add(new MC().getCreditCard(100));
		List<Wallet> wallets = new ArrayList<Wallet>();
		Wallet wallet = new Wallet();
		wallet.setCards(cards);
		wallets.add(wallet);
		personTwo.setWallet(wallets);
		double actual =personTwo.CalculateIntrest();
		assertTrue("15.0".equals(String.valueOf(actual)));
		assertTrue("15.0".equals(String.valueOf(personTwo.getWallet().get(0).getInterestForWallet())));
	}

	

}
