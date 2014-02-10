package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Alloctype;
import com.limited.app.service.AlloctypeService;

public class AlloctypeAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(AlloctypeAction.class);

	private static AlloctypeService alloctypeService = null;

	private Alloctype alloctype;

	
	private List<Alloctype> alloctypes;
	static{
		alloctypeService=(AlloctypeService)getService("alloctypeService");
	}

	public String save() {
		if (alloctype.getId() == null) {
			logger.debug("Inserting Alloctype");
			alloctypeService.insert(alloctype);
		} else {
			logger.debug("Updating Alloctype:" + alloctype.getId());
			alloctypeService.update(alloctype);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Alloctype:" + alloctype.getId());
		alloctypeService.deleteByID(alloctype.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Alloctypes");
		if (alloctypes==null){
			clearLastAction();
			alloctypes = alloctypeService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAlloctype(){
		try{
			if (alloctype != null && alloctype.getId() != null) {
				alloctype = alloctypeService.getByID(alloctype.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadAlloctype();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAlloctype();
		if (alloctype==null){
			alloctype=  (Alloctype)getContextObj();
		}
		getServletRequest().setAttribute("alloctype", alloctype);
		setLastAction();
		setContextObj(alloctype);
		return "select";
	}
	
	/**
	 * @return Returns the alloctype.
	 */
	public Alloctype getAlloctype() {
		return alloctype;
	}

	/**
	 * @param alloctype
	 *            The alloctype to set.
	 */
	public void setAlloctype(Alloctype alloctype) {
		this.alloctype = alloctype;
	}

	/**
	 * @return Returns the alloctypes.
	 */
	public List<Alloctype> getAlloctypes() {
		return alloctypes;
	}
	
}

