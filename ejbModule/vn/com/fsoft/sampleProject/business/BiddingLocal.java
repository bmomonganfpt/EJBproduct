package vn.com.fsoft.sampleProject.business;

import java.util.List;

import javax.ejb.Local;

import vn.com.fsoft.sampleProject.entities.Account;
import vn.com.fsoft.sampleProject.entities.Bid;
import vn.com.fsoft.sampleProject.entities.Item;

@Local
public interface BiddingLocal {

	public List<Bid> getBiddings(Account account);

	public Item getItem(Account account);

}
