package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Institution;
import com.limited.app.service.InstitutionService;

public class InstitutionAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(InstitutionAction.class);

	private static InstitutionService institutionService = null;

	private Institution institution;

	
	private List<Institution> institutions;
	static{
		institutionService=(InstitutionService)getService("institutionService");
	}

	public String save() {
		if (institution.getId() == null) {
			logger.debug("Inserting Institution");
			institutionService.insert(institution);
		} else {
			logger.debug("Updating Institution:" + institution.getId());
			institutionService.update(institution);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Institution:" + institution.getId());
		institutionService.deleteByID(institution.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Institutions");
		if (institutions==null){
			clearLastAction();
			institutions = institutionService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadInstitution(){
		try{
			if (institution != null && institution.getId() != null) {
				institution = institutionService.getByID(institution.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadInstitution();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadInstitution();
		if (institution==null){
			institution=  (Institution)getContextObj();
		}
		getServletRequest().setAttribute("institution", institution);
		setLastAction();
		setContextObj(institution);
		return "select";
	}
	
	/**
	 * @return Returns the institution.
	 */
	public Institution getInstitution() {
		return institution;
	}

	/**
	 * @param institution
	 *            The institution to set.
	 */
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	/**
	 * @return Returns the institutions.
	 */
	public List<Institution> getInstitutions() {
		return institutions;
	}
	
}

