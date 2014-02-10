package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Industry;
import com.limited.app.service.IndustryService;

public class IndustryAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(IndustryAction.class);

	private static IndustryService industryService = null;

	private Industry industry;

	
	private List<Industry> industrys;
	static{
		industryService=(IndustryService)getService("industryService");
	}

	public String save() {
		if (industry.getId() == null) {
			logger.debug("Inserting Industry");
			industryService.insert(industry);
		} else {
			logger.debug("Updating Industry:" + industry.getId());
			industryService.update(industry);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Industry:" + industry.getId());
		industryService.deleteByID(industry.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Industrys");
		if (industrys==null){
			clearLastAction();
			industrys = industryService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadIndustry(){
		try{
			if (industry != null && industry.getId() != null) {
				industry = industryService.getByID(industry.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadIndustry();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadIndustry();
		if (industry==null){
			industry=  (Industry)getContextObj();
		}
		getServletRequest().setAttribute("industry", industry);
		setLastAction();
		setContextObj(industry);
		return "select";
	}
	
	/**
	 * @return Returns the industry.
	 */
	public Industry getIndustry() {
		return industry;
	}

	/**
	 * @param industry
	 *            The industry to set.
	 */
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	/**
	 * @return Returns the industrys.
	 */
	public List<Industry> getIndustrys() {
		return industrys;
	}
	
}

