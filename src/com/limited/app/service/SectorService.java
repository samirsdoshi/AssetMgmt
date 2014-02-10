package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Sector;
import com.limited.app.bean.SectorExample;
import com.limited.app.db.dao.SectorMapper;
@Service
public class SectorService extends BaseService{
	
	@Autowired
	private SectorMapper sectorMapper;
	
	@Autowired
	private SectorExample sectorExample;
	
	public SectorService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SectorMapper getSectorMapper() {
		return sectorMapper;
	}

	public void setSectorMapper(SectorMapper sectorMapper) {
		this.sectorMapper = sectorMapper;
	}

	public SectorExample getSectorExample() {
		return sectorExample;
	}

	public void setSectorExample(SectorExample example) {
		this.sectorExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getSectorExample().clear();
		return sectorMapper.countByExample(sectorExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return sectorMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Sector alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Sector record) {
		// TODO Auto-generated method stub
		return sectorMapper.insert(record);
	}

	public Sector getByID(Integer id) {
		// TODO Auto-generated method stub
		return sectorMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Sector record) {
		// TODO Auto-generated method stub
		return sectorMapper.updateByPrimaryKey(record);
	}

	public List<Sector> getAll(){
		getSectorExample().clear();
		return sectorMapper.selectByExample(getSectorExample());
	}
	
	public List<Sector> getByDesc(String value){
		getSectorExample().clear();
		getSectorExample().createCriteria().andSecNameEqualTo(value);
		return sectorMapper.selectByExample(getSectorExample());
	}
}
