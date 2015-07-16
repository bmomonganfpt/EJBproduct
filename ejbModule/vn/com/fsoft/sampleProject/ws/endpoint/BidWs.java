package vn.com.fsoft.sampleProject.ws.endpoint;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import vn.com.fsoft.sampleProject.business.Bidding;
import vn.com.fsoft.sampleProject.business.BiddingLocal;
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

	@EJB
	Bidding bidding;

	public BidWs() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Bid> getBidding(@WebParam(name = "Account") Account account) {

		return null;
	}

	@Override
	public Item getItem(@WebParam(name = "Account") Account account) {

		return bidding.getItem(account);
	}

}
