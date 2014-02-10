package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.AssetinvSecind;
import com.limited.app.bean.AssetinvSecindExample;
import com.limited.app.db.dao.AssetinvSecindMapper;
@Service
public class Assetinv_secindService extends BaseService{
	
	@Autowired
	private AssetinvSecindMapper assetinvSecindMapper;
	
	@Autowired
	private AssetinvSecindExample assetinvSecindExample;
	
	public Assetinv_secindService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssetinvSecindMapper getAssetinvSecindMapper() {
		return assetinvSecindMapper;
	}

	public void setAssetinvSecindMapper(AssetinvSecindMapper assetinvSecindMapper) {
		this.assetinvSecindMapper = assetinvSecindMapper;
	}

	public AssetinvSecindExample getAssetinvSecindExample() {
		return assetinvSecindExample;
	}

	public void setAssetinvSecindExample(AssetinvSecindExample example) {
		this.assetinvSecindExample = example;
	}



	public int getCount() {
		// TODO Auto-generated method stub
		getAssetinvSecindExample().clear();
		return assetinvSecindMapper.countByExample(assetinvSecindExample);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvSecindMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(AssetinvSecind alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(AssetinvSecind record) {
		// TODO Auto-generated method stub
		return assetinvSecindMapper.insert(record);
	}

	public AssetinvSecind getByID(Integer id) {
		// TODO Auto-generated method stub
		return assetinvSecindMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(AssetinvSecind record) {
		// TODO Auto-generated method stub
		return assetinvSecindMapper.updateByPrimaryKey(record);
	}

	public List<AssetinvSecind> getAll(){
		getAssetinvSecindExample().clear();
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}
	
	public List<AssetinvSecind> getBySectorID(int value){
		getAssetinvSecindExample().clear();
		getAssetinvSecindExample().createCriteria().andSecIdEqualTo(value);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

	public List<AssetinvSecind> getByIndustryID(int value){
		getAssetinvSecindExample().clear();
		getAssetinvSecindExample().createCriteria().andIndIdEqualTo(value);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

	public List<AssetinvSecind> getBySecIndID(int secid, int indid){
		getAssetinvSecindExample().clear();
		getAssetinvSecindExample().createCriteria()
			.andSecIdEqualTo(secid)
			.andIndIdEqualTo(indid);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}
	public List<AssetinvSecind> getByAssetinvID(int value){
		getAssetinvSecindExample().clear();
		getAssetinvSecindExample().createCriteria()
			.andAssetinvIdEqualTo(value);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

}
