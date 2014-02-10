package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.AssetinvInter;
import com.limited.app.service.Assetinv_interService;
import com.limited.app.bean.Inter;
import com.limited.app.service.InterService;
import com.limited.app.bean.Assetinv;
import com.limited.app.service.AssetinvService;

public class Assetinv_interAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(Assetinv_interAction.class);

	private static Assetinv_interService assetinv_interService = null;

	private AssetinvInter assetinv_inter;

	private List<Inter> inters;
	private Inter inter;
	private static InterService interService = null;
	private List<Assetinv> assetinvs;
	private Assetinv assetinv;
	private static AssetinvService assetinvService = null;
	
	private List<AssetinvInter> assetinv_inters;
	static{
		assetinv_interService=(Assetinv_interService)getService("assetinv_interService");
		interService =(InterService)getService("interService");
		assetinvService =(AssetinvService)getService("assetinvService");
	}

	public String save() {
		if (assetinv_inter.getId() == null) {
			logger.debug("Inserting Assetinv_inter");
			assetinv_interService.insert(assetinv_inter);
		} else {
			logger.debug("Updating Assetinv_inter:" + assetinv_inter.getId());
			assetinv_interService.update(assetinv_inter);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Assetinv_inter:" + assetinv_inter.getId());
		assetinv_interService.deleteByID(assetinv_inter.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Assetinv_inters");
		inter = (Inter)getServletRequest().getAttribute("inter");
		if (inter!=null && inter.getId()!=null){
			assetinv_inters = assetinv_interService.getByInterID(inter.getId());
		}
		assetinv = (Assetinv)getServletRequest().getAttribute("assetinv");
		if (assetinv!=null && assetinv.getId()!=null){
			assetinv_inters = assetinv_interService.getByAssetinvID(assetinv.getId());
		}
		if (assetinv_inters==null){
			clearLastAction();
			assetinv_inters = assetinv_interService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAssetinvInter(){
		try{
			if (assetinv_inter != null && assetinv_inter.getId() != null) {
				assetinv_inter = assetinv_interService.getByID(assetinv_inter.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			inters = interService.getAll();
			assetinvs = assetinvService.getAll();
			loadAssetinvInter();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAssetinvInter();
		if (assetinv_inter==null){
			assetinv_inter=  (AssetinvInter)getContextObj();
		}
		getServletRequest().setAttribute("assetinv_inter", assetinv_inter);
		setLastAction();
		setContextObj(assetinv_inter);
		return "select";
	}
	
	/**
	 * @return Returns the assetinv_inter.
	 */
	public AssetinvInter getAssetinv_inter() {
		return assetinv_inter;
	}

	/**
	 * @param assetinv_inter
	 *            The assetinv_inter to set.
	 */
	public void setAssetinv_inter(AssetinvInter assetinv_inter) {
		this.assetinv_inter = assetinv_inter;
	}

	/**
	 * @return Returns the assetinv_inters.
	 */
	public List<AssetinvInter> getAssetinv_inters() {
		return assetinv_inters;
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

