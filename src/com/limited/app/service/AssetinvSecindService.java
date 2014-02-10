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
public class AssetinvSecindService extends BaseService{
	
	@Autowired
	private AssetinvSecindMapper assetinvSecindMapper;
	
	@Autowired
	private AssetinvSecindExample assetinvSecindExample;
	
	public AssetinvSecindService() {
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
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}
	
	public List<AssetinvSecind> getBySecID(int value){
		getAssetinvSecindExample().createCriteria().andSecIdEqualTo(value);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

	public List<AssetinvSecind> getByIndID(int value){
		getAssetinvSecindExample().createCriteria().andIndIdEqualTo(value);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

	public List<AssetinvSecind> getBySecIndID(int secid, int indid){
		getAssetinvSecindExample().createCriteria()
			.andSecIdEqualTo(secid)
			.andIndIdEqualTo(indid);
		return assetinvSecindMapper.selectByExample(getAssetinvSecindExample());
	}

}
