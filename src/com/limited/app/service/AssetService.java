package com.limited.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Asset;
import com.limited.app.bean.AssetExample;
import com.limited.app.db.dao.AssetMapper;
@Service
@Transactional
public class AssetService  extends BaseService{
	@Autowired
	private AssetMapper assetMapper;
	@Autowired
	private AssetExample assetExample;

	public AssetService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		// TODO Auto-generated method stub
		getAssetExample().clear();
		return assetMapper.countByExample(assetExample);
	}

	public AssetMapper getAssetMapper() {
		return assetMapper;
	}

	public void setAssetMapper(AssetMapper assetMapper) {
		this.assetMapper = assetMapper;
	}

	public AssetExample getAssetExample() {
		return assetExample;
	}

	public void setAssetExample(AssetExample assetExample) {
		this.assetExample = assetExample;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteByID(Integer id) {
		// TODO Auto-generated method stub
		return assetMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int delete(Asset alloc) {
		// TODO Auto-generated method stub
		return deleteByID(alloc.getId());
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int insert(Asset record) {
		// TODO Auto-generated method stub
		return assetMapper.insert(record);
	}

	public Asset getByID(Integer id) {
		// TODO Auto-generated method stub
		return assetMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int update(Asset record) {
		// TODO Auto-generated method stub
		return assetMapper.updateByPrimaryKey(record);
	}
	
	public List<Asset> getAll(){
		getAssetExample().clear();
		return assetMapper.selectByExample(getAssetExample());
	}
	
	public List<Asset> getByHeldAt(int instID){
		getAssetExample().clear();
		AssetExample.Criteria c = getAssetExample().createCriteria();
		c.andHeldatEqualTo(instID);
		return assetMapper.selectByExample(getAssetExample());
	}
	public List<Asset> getByInstitutionID(int instID){
		getAssetExample().clear();
		AssetExample.Criteria c = getAssetExample().createCriteria();
		c.andHeldatEqualTo(instID);
		return assetMapper.selectByExample(getAssetExample());
	}

	public List<Asset> getByBenchmark(String value){
		getAssetExample().clear();
		AssetExample.Criteria c = getAssetExample().createCriteria();
		c.andBenchmarkEqualTo(value);
		return assetMapper.selectByExample(getAssetExample());
	}
	
	public List<Asset> getByTemplateID(int value){
		getAssetExample().clear();
		AssetExample.Criteria c = getAssetExample().createCriteria();
		c.andTemplateidEqualTo(value);
		return assetMapper.selectByExample(getAssetExample());
	}
}
