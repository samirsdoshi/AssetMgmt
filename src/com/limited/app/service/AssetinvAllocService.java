package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.AssetinvAlloc;
import com.limited.app.bean.AssetinvAllocExample;
import com.limited.app.db.dao.AssetinvAllocMapper;
@Service
public class AssetinvAllocService extends BaseService{
	
	@Autowired
	private AssetinvAllocMapper assetinvAllocMapper;
	
	@Autowired
	private AssetinvAllocExample assetinvAllocExample;
	
	public AssetinvAllocService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssetinvAllocMapper getAssetinvAllocMapper() {
		return assetinvAllocMapper;
	}

	public void setAssetinvAllocMapper(AssetinvAllocMapper AssetinvAllocMapper) {
		this.assetinvAllocMapper = AssetinvAllocMapper;
	}

	public AssetinvAllocExample getAssetinvAllocExample() {
		return assetinvAllocExample;
	}

	public void setAssetinvAllocExample(AssetinvAllocExample example) {
		this.assetinvAllocExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return assetinvAllocMapper.countByExample(assetinvAllocExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvAllocMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(AssetinvAlloc alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(AssetinvAlloc record) {
		// TODO Auto-generated method stub
		return assetinvAllocMapper.insert(record);
	}

	public AssetinvAlloc getByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvAllocMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(AssetinvAlloc record) {
		// TODO Auto-generated method stub
		return assetinvAllocMapper.updateByPrimaryKey(record);
	}
	
	public List<AssetinvAlloc> getAll(){
		return assetinvAllocMapper.selectByExample(getAssetinvAllocExample());
	}
	
	public List<AssetinvAlloc> getByAssetinvID(int value){
		AssetinvAllocExample.Criteria c = getAssetinvAllocExample().createCriteria();
		c.andAssetinvIdEqualTo(value);
		return assetinvAllocMapper.selectByExample(getAssetinvAllocExample());
	}
		
	public List<AssetinvAlloc> getByAlloctypeID(int value){
		AssetinvAllocExample.Criteria c = getAssetinvAllocExample().createCriteria();
		c.andAlloctypeIdEqualTo(value);
		return assetinvAllocMapper.selectByExample(getAssetinvAllocExample());
	}

}
