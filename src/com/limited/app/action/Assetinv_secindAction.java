package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.AssetinvSecind;
import com.limited.app.service.Assetinv_secindService;
import com.limited.app.bean.Industry;
import com.limited.app.service.IndustryService;
import com.limited.app.bean.Sector;
import com.limited.app.service.SectorService;
import com.limited.app.bean.Assetinv;
import com.limited.app.service.AssetinvService;

public class Assetinv_secindAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(Assetinv_secindAction.class);

	private static Assetinv_secindService assetinv_secindService = null;

	private AssetinvSecind assetinv_secind;

	private List<Industry> industrys;
	private Industry industry;
	private static IndustryService industryService = null;
	private List<Sector> sectors;
	private Sector sector;
	private static SectorService sectorService = null;
	private List<Assetinv> assetinvs;
	private Assetinv assetinv;
	private static AssetinvService assetinvService = null;
	
	private List<AssetinvSecind> assetinv_secinds;
	static{
		assetinv_secindService=(Assetinv_secindService)getService("assetinv_secindService");
		industryService =(IndustryService)getService("industryService");
		sectorService =(SectorService)getService("sectorService");
		assetinvService =(AssetinvService)getService("assetinvService");
	}

	public String save() {
		if (assetinv_secind.getId() == null) {
			logger.debug("Inserting Assetinv_secind");
			assetinv_secindService.insert(assetinv_secind);
		} else {
			logger.debug("Updating Assetinv_secind:" + assetinv_secind.getId());
			assetinv_secindService.update(assetinv_secind);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Assetinv_secind:" + assetinv_secind.getId());
		assetinv_secindService.deleteByID(assetinv_secind.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Assetinv_secinds");
		industry = (Industry)getServletRequest().getAttribute("industry");
		if (industry!=null && industry.getId()!=null){
			assetinv_secinds = assetinv_secindService.getByIndustryID(industry.getId());
		}
		sector = (Sector)getServletRequest().getAttribute("sector");
		if (sector!=null && sector.getId()!=null){
			assetinv_secinds = assetinv_secindService.getBySectorID(sector.getId());
		}
		assetinv = (Assetinv)getServletRequest().getAttribute("assetinv");
		if (assetinv!=null && assetinv.getId()!=null){
			assetinv_secinds = assetinv_secindService.getByAssetinvID(assetinv.getId());
		}
		if (assetinv_secinds==null){
			clearLastAction();
			assetinv_secinds = assetinv_secindService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAssetinvSecind(){
		try{
			if (assetinv_secind != null && assetinv_secind.getId() != null) {
				assetinv_secind = assetinv_secindService.getByID(assetinv_secind.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			industrys = industryService.getAll();
			sectors = sectorService.getAll();
			assetinvs = assetinvService.getAll();
			loadAssetinvSecind();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAssetinvSecind();
		if (assetinv_secind==null){
			assetinv_secind=  (AssetinvSecind)getContextObj();
		}
		getServletRequest().setAttribute("assetinv_secind", assetinv_secind);
		setLastAction();
		setContextObj(assetinv_secind);
		return "select";
	}
	
	/**
	 * @return Returns the assetinv_secind.
	 */
	public AssetinvSecind getAssetinv_secind() {
		return assetinv_secind;
	}

	/**
	 * @param assetinv_secind
	 *            The assetinv_secind to set.
	 */
	public void setAssetinv_secind(AssetinvSecind assetinv_secind) {
		this.assetinv_secind = assetinv_secind;
	}

	/**
	 * @return Returns the assetinv_secinds.
	 */
	public List<AssetinvSecind> getAssetinv_secinds() {
		return assetinv_secinds;
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
	 * @return Returns the assetinvs.
	 */
	public List<Assetinv> getAssetinvs() {
		return assetinvs;
	}
	
	public Assetinv getAssetinv(){
		return assetinv;
	}
	
	public void setAssetinv(Assetinv assetinv){
		this.assetinv = assetinv;
	}
}

