package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Inter;
import com.limited.app.service.InterService;

public class InterAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(InterAction.class);

	private static InterService interService = null;

	private Inter inter;

	
	private List<Inter> inters;
	static{
		interService=(InterService)getService("interService");
	}

	public String save() {
		if (inter.getId() == null) {
			logger.debug("Inserting Inter");
			interService.insert(inter);
		} else {
			logger.debug("Updating Inter:" + inter.getId());
			interService.update(inter);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Inter:" + inter.getId());
		interService.deleteByID(inter.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Inters");
		if (inters==null){
			clearLastAction();
			inters = interService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadInter(){
		try{
			if (inter != null && inter.getId() != null) {
				inter = interService.getByID(inter.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadInter();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadInter();
		if (inter==null){
			inter=  (Inter)getContextObj();
		}
		getServletRequest().setAttribute("inter", inter);
		setLastAction();
		setContextObj(inter);
		return "select";
	}
	
	/**
	 * @return Returns the inter.
	 */
	public Inter getInter() {
		return inter;
	}

	/**
	 * @param inter
	 *            The inter to set.
	 */
	public void setInter(Inter inter) {
		this.inter = inter;
	}

	/**
	 * @return Returns the inters.
	 */
	public List<Inter> getInters() {
		return inters;
	}
	
}

