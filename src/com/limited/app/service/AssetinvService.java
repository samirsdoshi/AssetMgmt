package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Assetinv;
import com.limited.app.bean.AssetinvExample;
import com.limited.app.db.dao.AssetinvMapper;
@Service
public class AssetinvService extends BaseService{
	
	@Autowired
	private AssetinvMapper assetinvMapper;
	
	@Autowired
	private AssetinvExample assetinvExample;
	
	public AssetinvService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssetinvMapper getAssetinvMapper() {
		return assetinvMapper;
	}

	public void setAssetinvMapper(AssetinvMapper assetinvMapper) {
		this.assetinvMapper = assetinvMapper;
	}

	public AssetinvExample getAssetinvExample() {
		return assetinvExample;
	}

	public void setAssetinvExample(AssetinvExample example) {
		this.assetinvExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getAssetinvExample().clear();
		return assetinvMapper.countByExample(assetinvExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Assetinv alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(Assetinv record) {
		// TODO Auto-generated method stub
		return assetinvMapper.insert(record);
	}

	public Assetinv getByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Assetinv record) {
		// TODO Auto-generated method stub
		return assetinvMapper.updateByPrimaryKey(record);
	}

	public List<Assetinv> getAll(){
		getAssetinvExample().clear();
		return assetinvMapper.selectByExample(getAssetinvExample());
	}

	public List<Assetinv> getByAssetID(int value){
		getAssetinvExample().clear();
		getAssetinvExample().createCriteria().andAssetidEqualTo(value);
		return assetinvMapper.selectByExample(getAssetinvExample());
	}

	public List<Assetinv> getByDate(java.util.Date value){
		getAssetinvExample().clear();
		getAssetinvExample().createCriteria().andAsofdateEqualTo(value);
		return assetinvMapper.selectByExample(getAssetinvExample());
	}

}
