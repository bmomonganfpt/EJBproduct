package vn.com.fsoft.sampleProject.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import vn.com.fsoft.sampleProject.entities.Account;
import vn.com.fsoft.sampleProject.entities.Bid;
import vn.com.fsoft.sampleProject.entities.Item;

/**
 * Session Bean implementation class Bidding
 */
@Stateful
@LocalBean
public class Bidding implements BiddingLocal {

	/**
	 * Default constructor.
	 */
	public Bidding() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Bid> getBiddings(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItem(Account account) {
		Item item = new Item();
		item.setId(1L);
		item.setItemAccount(200.00);
		item.setItemName("Sample Item");
		item.setAccount(account);
		return item;
	}

}
