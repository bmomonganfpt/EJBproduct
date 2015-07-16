package vn.com.fsoft.sampleProject.ws.endpoint;

import java.util.List;

import javax.ejb.Remote;

import vn.com.fsoft.sampleProject.entities.Account;
import vn.com.fsoft.sampleProject.entities.Bid;
import vn.com.fsoft.sampleProject.entities.Item;

@Remote
public interface BidWsRemote {

	public List<Bid> getBidding(Account account);

	public Item getItem(Account account);
}
