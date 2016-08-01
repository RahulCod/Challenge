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
		/*<<<<<<PERSON 1>>>>>>>>*/
		personone = new Person();
		List<CreditCard> cards = new ArrayList<CreditCard>();
		cards.add(new Visa().getCreditCard(100));
		cards.add(new Discover().getCreditCard(100));
		cards.add(new MC().getCreditCard(100));
		List<Wallet> walletsone = new ArrayList<Wallet>();
		Wallet walletone = new Wallet();
		walletone.setCards(cards);
		walletsone.add(walletone);
		personone.setWallet(walletsone);
		double Persononeactual =personone.CalculateIntrest();
		assertTrue("16.0".equals(String.valueOf(Persononeactual)));
		assertTrue("16.0".equals(String.valueOf(personone.getWallet().get(0).getInterestForWallet())));

		
		/*<<<<<<PERSON 2>>>>>>>>*/
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
