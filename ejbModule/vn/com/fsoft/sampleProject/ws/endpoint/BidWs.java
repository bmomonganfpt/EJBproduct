package vn.com.fsoft.sampleProject.ws.endpoint;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import vn.com.fsoft.sampleProject.entities.Account;
import vn.com.fsoft.sampleProject.entities.Bid;
import vn.com.fsoft.sampleProject.entities.Item;

/**
 * Session Bean implementation class BidWs
 */
@Stateless
@LocalBean
@WebService(serviceName = "bidService", targetNamespace = "bids")
@SOAPBinding(style = Style.DOCUMENT)

public class BidWs implements BidWsRemote {

	/**
	 * Default constructor.
	 */
	public BidWs() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Bid> getBidding(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItem(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
