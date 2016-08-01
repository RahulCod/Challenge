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
import com.ccApp.cc.Discover;
import com.ccApp.cc.MC;
import com.ccApp.cc.Visa;

public class TestCaseTwo {
	
	private IPerson person = null;

	@Before
	public void doBeforeEachCase() {
		person = new Person();
	}
	
	@Test
	public void testCaseTwo() {
		person = new Person();
		List<CreditCard> cards = new ArrayList<CreditCard>();
		cards.add(new Visa().getCreditCard(100));
		cards.add(new Discover().getCreditCard(100));
		List<CreditCard> cardsTwo = new ArrayList<CreditCard>();
		cardsTwo.add(new MC().getCreditCard(100));
		List<Wallet> wallets = new ArrayList<Wallet>();
		Wallet wallet = new Wallet();
		wallet.setCards(cards);
		wallets.add(wallet);
		Wallet walletTwo= new Wallet();
		walletTwo.setCards(cardsTwo);
		wallets.add(walletTwo);
		person.setWallet(wallets);
		double actual =person.CalculateIntrest();
		assertTrue("16.0".equals(String.valueOf(actual)));
		assertTrue("11.0".equals(String.valueOf(person.getWallet().get(0).getInterestForWallet())));
		assertTrue("5.0".equals(String.valueOf(person.getWallet().get(1).getInterestForWallet())));
	}

	

}
