package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.AssetinvInter;
import com.limited.app.bean.AssetinvInterExample;
import com.limited.app.db.dao.AssetinvInterMapper;
@Service
public class AssetinvInterService extends BaseService{
	
	@Autowired
	private AssetinvInterMapper assetinvInterMapper;
	
	@Autowired
	private AssetinvInterExample assetinvInterExample;
	
	public AssetinvInterService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssetinvInterMapper getAssetinvInterMapper() {
		return assetinvInterMapper;
	}

	public void setAssetinvInterMapper(AssetinvInterMapper assetinvInterMapper) {
		this.assetinvInterMapper = assetinvInterMapper;
	}

	public AssetinvInterExample getAssetinvInterExample() {
		return assetinvInterExample;
	}

	public void setAssetinvInterExample(AssetinvInterExample example) {
		this.assetinvInterExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return assetinvInterMapper.countByExample(assetinvInterExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvInterMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(AssetinvInter alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(AssetinvInter record) {
		// TODO Auto-generated method stub
		return assetinvInterMapper.insert(record);
	}

	public AssetinvInter getByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvInterMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(AssetinvInter record) {
		// TODO Auto-generated method stub
		return assetinvInterMapper.updateByPrimaryKey(record);
	}

	public List<AssetinvInter> getAll(){
		return assetinvInterMapper.selectByExample(getAssetinvInterExample());
	}
	
	public List<AssetinvInter> getByInterID(int value){
		AssetinvInterExample.Criteria c=getAssetinvInterExample().createCriteria();
		c.andInterIdEqualTo(value);
		return assetinvInterMapper.selectByExample(getAssetinvInterExample());
	}
	
}
