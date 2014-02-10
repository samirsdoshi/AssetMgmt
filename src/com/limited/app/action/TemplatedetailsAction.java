package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Templatedetails;
import com.limited.app.service.TemplatedetailsService;
import com.limited.app.bean.Template;
import com.limited.app.service.TemplateService;
import com.limited.app.bean.Alloctype;
import com.limited.app.service.AlloctypeService;
import com.limited.app.bean.Sector;
import com.limited.app.service.SectorService;
import com.limited.app.bean.Industry;
import com.limited.app.service.IndustryService;
import com.limited.app.bean.Inter;
import com.limited.app.service.InterService;

public class TemplatedetailsAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(TemplatedetailsAction.class);

	private static TemplatedetailsService templatedetailsService = null;

	private Templatedetails templatedetails;

	private List<Template> templates;
	private Template template;
	private static TemplateService templateService = null;
	private List<Alloctype> alloctypes;
	private Alloctype alloctype;
	private static AlloctypeService alloctypeService = null;
	private List<Sector> sectors;
	private Sector sector;
	private static SectorService sectorService = null;
	private List<Industry> industrys;
	private Industry industry;
	private static IndustryService industryService = null;
	private List<Inter> inters;
	private Inter inter;
	private static InterService interService = null;
	
	private List<Templatedetails> templatedetailss;
	static{
		templatedetailsService=(TemplatedetailsService)getService("templatedetailsService");
		templateService =(TemplateService)getService("templateService");
		alloctypeService =(AlloctypeService)getService("alloctypeService");
		sectorService =(SectorService)getService("sectorService");
		industryService =(IndustryService)getService("industryService");
		interService =(InterService)getService("interService");
	}

	public String save() {
		if (templatedetails.getId() == null) {
			logger.debug("Inserting Templatedetails");
			templatedetailsService.insert(templatedetails);
		} else {
			logger.debug("Updating Templatedetails:" + templatedetails.getId());
			templatedetailsService.update(templatedetails);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Templatedetails:" + templatedetails.getId());
		templatedetailsService.deleteByID(templatedetails.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Templatedetailss");
		template = (Template)getServletRequest().getAttribute("template");
		if (template!=null && template.getId()!=null){
			templatedetailss = templatedetailsService.getByTemplateID(template.getId());
		}
		alloctype = (Alloctype)getServletRequest().getAttribute("alloctype");
		if (alloctype!=null && alloctype.getId()!=null){
			templatedetailss = templatedetailsService.getByAlloctypeID(alloctype.getId());
		}
		sector = (Sector)getServletRequest().getAttribute("sector");
		if (sector!=null && sector.getId()!=null){
			templatedetailss = templatedetailsService.getBySectorID(sector.getId());
		}
		industry = (Industry)getServletRequest().getAttribute("industry");
		if (industry!=null && industry.getId()!=null){
			templatedetailss = templatedetailsService.getByIndustryID(industry.getId());
		}
		inter = (Inter)getServletRequest().getAttribute("inter");
		if (inter!=null && inter.getId()!=null){
			templatedetailss = templatedetailsService.getByInterID(inter.getId());
		}
		if (templatedetailss==null){
			clearLastAction();
			templatedetailss = templatedetailsService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadTemplatedetails(){
		try{
			if (templatedetails != null && templatedetails.getId() != null) {
				templatedetails = templatedetailsService.getByID(templatedetails.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			templates = templateService.getAll();
			alloctypes = alloctypeService.getAll();
			sectors = sectorService.getAll();
			industrys = industryService.getAll();
			inters = interService.getAll();
			loadTemplatedetails();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadTemplatedetails();
		if (templatedetails==null){
			templatedetails=  (Templatedetails)getContextObj();
		}
		getServletRequest().setAttribute("templatedetails", templatedetails);
		setLastAction();
		setContextObj(templatedetails);
		return "select";
	}
	
	/**
	 * @return Returns the templatedetails.
	 */
	public Templatedetails getTemplatedetails() {
		return templatedetails;
	}

	/**
	 * @param templatedetails
	 *            The templatedetails to set.
	 */
	public void setTemplatedetails(Templatedetails templatedetails) {
		this.templatedetails = templatedetails;
	}

	/**
	 * @return Returns the templatedetailss.
	 */
	public List<Templatedetails> getTemplatedetailss() {
		return templatedetailss;
	}
	
	/**
	 * @return Returns the templates.
	 */
	public List<Template> getTemplates() {
		return templates;
	}
	
	public Template getTemplate(){
		return template;
	}
	
	public void setTemplate(Template template){
		this.template = template;
	}
	/**
	 * @return Returns the alloctypes.
	 */
	public List<Alloctype> getAlloctypes() {
		return alloctypes;
	}
	
	public Alloctype getAlloctype(){
		return alloctype;
	}
	
	public void setAlloctype(Alloctype alloctype){
		this.alloctype = alloctype;
	}
	/**
	 * @return Returns the sectors.
	 */
	public List<Sector> getSectors() {
		return sectors;
	}
	
	public Sector getSector(){
		return sector;
	}
	
	public void setSector(Sector sector){
		this.sector = sector;
	}
	/**
	 * @return Returns the industrys.
	 */
	public List<Industry> getIndustrys() {
		return industrys;
	}
	
	public Industry getIndustry(){
		return industry;
	}
	
	public void setIndustry(Industry industry){
		this.industry = industry;
	}
	/**
	 * @return Returns the inters.
	 */
	public List<Inter> getInters() {
		return inters;
	}
	
	public Inter getInter(){
		return inter;
	}
	
	public void setInter(Inter inter){
		this.inter = inter;
	}
}

