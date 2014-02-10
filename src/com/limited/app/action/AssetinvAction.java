package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Assetinv;
import com.limited.app.service.AssetinvService;
import com.limited.app.bean.Asset;
import com.limited.app.service.AssetService;

public class AssetinvAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(AssetinvAction.class);

	private static AssetinvService assetinvService = null;

	private Assetinv assetinv;

	private List<Asset> assets;
	private Asset asset;
	private static AssetService assetService = null;
	
	private List<Assetinv> assetinvs;
	static{
		assetinvService=(AssetinvService)getService("assetinvService");
		assetService =(AssetService)getService("assetService");
	}

	public String save() {
		if (assetinv.getId() == null) {
			logger.debug("Inserting Assetinv");
			assetinvService.insert(assetinv);
		} else {
			logger.debug("Updating Assetinv:" + assetinv.getId());
			assetinvService.update(assetinv);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Assetinv:" + assetinv.getId());
		assetinvService.deleteByID(assetinv.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Assetinvs");
		asset = (Asset)getServletRequest().getAttribute("asset");
		if (asset!=null && asset.getId()!=null){
			assetinvs = assetinvService.getByAssetID(asset.getId());
		}
		if (assetinvs==null){
			clearLastAction();
			assetinvs = assetinvService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAssetinv(){
		try{
			if (assetinv != null && assetinv.getId() != null) {
				assetinv = assetinvService.getByID(assetinv.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			assets = assetService.getAll();
			loadAssetinv();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAssetinv();
		if (assetinv==null){
			assetinv=  (Assetinv)getContextObj();
		}
		getServletRequest().setAttribute("assetinv", assetinv);
		setLastAction();
		setContextObj(assetinv);
		return "select";
	}
	
	/**
	 * @return Returns the assetinv.
	 */
	public Assetinv getAssetinv() {
		return assetinv;
	}

	/**
	 * @param assetinv
	 *            The assetinv to set.
	 */
	public void setAssetinv(Assetinv assetinv) {
		this.assetinv = assetinv;
	}

	/**
	 * @return Returns the assetinvs.
	 */
	public List<Assetinv> getAssetinvs() {
		return assetinvs;
	}
	
	/**
	 * @return Returns the assets.
	 */
	public List<Asset> getAssets() {
		return assets;
	}
	
	public Asset getAsset(){
		return asset;
	}
	
	public void setAsset(Asset asset){
		this.asset = asset;
	}
}

