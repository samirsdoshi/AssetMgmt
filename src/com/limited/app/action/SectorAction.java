package com.limited.app.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.limited.app.bean.Sector;
import com.limited.app.service.SectorService;

public class SectorAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static Log logger = LogFactory.getLog(SectorAction.class);

	private static SectorService sectorService = null;

	private Sector sector;

	
	private List<Sector> sectors;
	static{
		sectorService=(SectorService)getService("sectorService");
	}

	public String save() {
		if (sector.getId() == null) {
			logger.debug("Inserting Sector");
			sectorService.insert(sector);
		} else {
			logger.debug("Updating Sector:" + sector.getId());
			sectorService.update(sector);
		}
		return nextAction(SUCCESS);
	}

	public String delete() {
		logger.debug("Deleting Sector:" + sector.getId());
		sectorService.deleteByID(sector.getId());
		return nextAction(SUCCESS);
	}

	public String doList() {
		logger.debug("Listing Sectors");
		if (sectors==null){
			clearLastAction();
			sectors = sectorService.getAll();
		}
		return SUCCESS;
	}
	
	private void loadSector(){
		try{
			if (sector != null && sector.getId() != null) {
				sector = sectorService.getByID(sector.getId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public String input() {
		try{
			loadSector();
		}catch(Exception e){
			e.printStackTrace();
		}		
		return INPUT;
	}
	public String select(){
		loadSector();
		if (sector==null){
			sector=  (Sector)getContextObj();
		}
		getServletRequest().setAttribute("sector", sector);
		setLastAction();
		setContextObj(sector);
		return "select";
	}
	
	/**
	 * @return Returns the sector.
	 */
	public Sector getSector() {
		return sector;
	}

	/**
	 * @param sector
	 *            The sector to set.
	 */
	public void setSector(Sector sector) {
		this.sector = sector;
	}

	/**
	 * @return Returns the sectors.
	 */
	public List<Sector> getSectors() {
		return sectors;
	}
	
}

