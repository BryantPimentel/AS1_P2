package SERVICES;

import MODEL.BusinessEntity;
import java.util.*;

/**
 * 
 */
public class BusinessService {

	/**
	 * Default constructor
	 */
	public BusinessService() {
	}

	/**
	 * @param id 
	 * @param BusinessName 
	 * @param FiscalAddress 
	 * @param NIT 
	 * @return
	 */
	public BusinessEntity getBusiness(int id, String BusinessName, String FiscalAddress, String NIT) {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public List<BusinessEntity> getAllBusiness() {
		// TODO implement here
		return null;
	}

	/**
	 * @param business 
	 * @return
	 */
	public void CreateBusiness(BusinessEntity business) {
            // TODO implement here

	}

	/**
	 * @param business 
	 * @return
	 */
	public void UpdateBusiness(BusinessEntity business) {
            // TODO implement here

	}

	/**
	 * @param id 
	 * @return
	 */
	public void DeleteBusinessById(int id) {
            // TODO implement here

	}

	/**
	 * @param business 
	 * @return
	 */
	public String getBusinessMessage(String business) {
		// TODO implement here
		return "";
	}

}