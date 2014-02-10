package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.AssetinvAlloc;
import com.limited.app.service.Assetinv_allocService;
import com.limited.app.bean.Alloctype;
import com.limited.app.service.AlloctypeService;
import com.limited.app.bean.Assetinv;
import com.limited.app.service.AssetinvService;

public class Assetinv_allocAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(Assetinv_allocAction.class);

	private static Assetinv_allocService assetinv_allocService = null;

	private AssetinvAlloc assetinv_alloc;

	private List<Alloctype> alloctypes;
	private Alloctype alloctype;
	private static AlloctypeService alloctypeService = null;
	private List<Assetinv> assetinvs;
	private Assetinv assetinv;
	private static AssetinvService assetinvService = null;
	
	private List<AssetinvAlloc> assetinv_allocs;
	static{
		assetinv_allocService=(Assetinv_allocService)getService("assetinv_allocService");
		alloctypeService =(AlloctypeService)getService("alloctypeService");
		assetinvService =(AssetinvService)getService("assetinvService");
	}

	public String save() {
		if (assetinv_alloc.getId() == null) {
			logger.debug("Inserting Assetinv_alloc");
			assetinv_allocService.insert(assetinv_alloc);
		} else {
			logger.debug("Updating Assetinv_alloc:" + assetinv_alloc.getId());
			assetinv_allocService.update(assetinv_alloc);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Assetinv_alloc:" + assetinv_alloc.getId());
		assetinv_allocService.deleteByID(assetinv_alloc.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Assetinv_allocs");
		alloctype = (Alloctype)getServletRequest().getAttribute("alloctype");
		if (alloctype!=null && alloctype.getId()!=null){
			assetinv_allocs = assetinv_allocService.getByAlloctypeID(alloctype.getId());
		}
		assetinv = (Assetinv)getServletRequest().getAttribute("assetinv");
		if (assetinv!=null && assetinv.getId()!=null){
			assetinv_allocs = assetinv_allocService.getByAssetinvID(assetinv.getId());
		}
		if (assetinv_allocs==null){
			clearLastAction();
			assetinv_allocs = assetinv_allocService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadAssetinvAlloc(){
		try{
			if (assetinv_alloc != null && assetinv_alloc.getId() != null) {
				assetinv_alloc = assetinv_allocService.getByID(assetinv_alloc.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			alloctypes = alloctypeService.getAll();
			assetinvs = assetinvService.getAll();
			loadAssetinvAlloc();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadAssetinvAlloc();
		if (assetinv_alloc==null){
			assetinv_alloc=  (AssetinvAlloc)getContextObj();
		}
		getServletRequest().setAttribute("assetinv_alloc", assetinv_alloc);
		setLastAction();
		setContextObj(assetinv_alloc);
		return "select";
	}
	
	/**
	 * @return Returns the assetinv_alloc.
	 */
	public AssetinvAlloc getAssetinv_alloc() {
		return assetinv_alloc;
	}

	/**
	 * @param assetinv_alloc
	 *            The assetinv_alloc to set.
	 */
	public void setAssetinv_alloc(AssetinvAlloc assetinv_alloc) {
		this.assetinv_alloc = assetinv_alloc;
	}

	/**
	 * @return Returns the assetinv_allocs.
	 */
	public List<AssetinvAlloc> getAssetinv_allocs() {
		return assetinv_allocs;
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

