package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Template;
import com.limited.app.service.TemplateService;

public class TemplateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(TemplateAction.class);

	private static TemplateService templateService = null;

	private Template template;

	
	private List<Template> templates;
	static{
		templateService=(TemplateService)getService("templateService");
	}

	public String save() {
		if (template.getId() == null) {
			logger.debug("Inserting Template");
			templateService.insert(template);
		} else {
			logger.debug("Updating Template:" + template.getId());
			templateService.update(template);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Template:" + template.getId());
		templateService.deleteByID(template.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Templates");
		if (templates==null){
			clearLastAction();
			templates = templateService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadTemplate(){
		try{
			if (template != null && template.getId() != null) {
				template = templateService.getByID(template.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadTemplate();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadTemplate();
		if (template==null){
			template=  (Template)getContextObj();
		}
		getServletRequest().setAttribute("template", template);
		setLastAction();
		setContextObj(template);
		return "select";
	}
	
	/**
	 * @return Returns the template.
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            The template to set.
	 */
	public void setTemplate(Template template) {
		this.template = template;
	}

	/**
	 * @return Returns the templates.
	 */
	public List<Template> getTemplates() {
		return templates;
	}
	
}

