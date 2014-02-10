package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Asset;
import com.limited.app.service.AssetService;
import com.limited.app.bean.Template;
import com.limited.app.service.TemplateService;
import com.limited.app.bean.Institution;
import com.limited.app.service.InstitutionService;

public class AssetAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(AssetAction.class);

	private static AssetService assetService = null;

	private Asset asset;

	private List<Template> templates;
	private Template template;
	private static TemplateService templateService = null;
	private List<Institution> institutions;
	private Institution institution;
	private static InstitutionService institutionService = null;
	
	private List<Asset> assets;
	static{
		assetService=(AssetService)getService("assetService");
		templateService =(TemplateService)getService("templateService");
		institutionService =(InstitutionService)getService("institutionService");
	}

	public String save() {
		if (asset.getId() == null) {
			logger.debug("Inserting Asset");
			assetService.insert(asset);
		} else {
			logger.debug("Updating Asset:" + asset.getId());
			assetService.update(asset);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Asset:" + asset.getId());
		assetService.deleteByID(asset.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Assets");
		template = (Template)getServletRequest().getAttribute("template");
		if (template!=null && template.getId()!=null){
			assets = assetService.getByTemplateID(template.getId());
		}
		institution = (Institution)getServletRequest().getAttribute("institution");
		if (institution!=null && institution.getId()!=null){
			assets = assetService.getByInstitutionID(institution.getId());
		}
		if (assets==null){
			clearLastAction();
			assets = assetService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAsset(){
		try{
			if (asset != null && asset.getId() != null) {
				asset = assetService.getByID(asset.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			templates = templateService.getAll();
			institutions = institutionService.getAll();
			loadAsset();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAsset();
		if (asset==null){
			asset=  (Asset)getContextObj();
		}
		getServletRequest().setAttribute("asset", asset);
		setLastAction();
		setContextObj(asset);
		return "select";
	}
	
	public String cancel(){
		getContextObj();
		return "lastaction";
	}
	/**
	 * @return Returns the asset.
	 */
	public Asset getAsset() {
		return asset;
	}

	/**
	 * @param asset
	 *            The asset to set.
	 */
	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	/**
	 * @return Returns the assets.
	 */
	public List<Asset> getAssets() {
		return assets;
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
	 * @return Returns the institutions.
	 */
	public List<Institution> getInstitutions() {
		return institutions;
	}
	
	public Institution getInstitution(){
		return institution;
	}
	
	public void setInstitution(Institution institution){
		this.institution = institution;
	}
}

