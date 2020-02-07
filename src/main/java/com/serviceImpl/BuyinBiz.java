package com.serviceImpl;

import com.mapper.BuyinMapper;
import com.pojo.BuyIn;
import com.pojo.BuyInSearch;
import com.pojo.ProductInfo;
import com.service.IBuyinBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BuyinBiz implements IBuyinBiz {
	@Autowired
	private BuyinMapper buyinmapper;
	
    public BuyinMapper getBuyinmapper() {
		return buyinmapper;
	}

	public void setBuyinmapper(BuyinMapper buyinmapper) {
		this.buyinmapper = buyinmapper;
	}

	
    //�ɹ�������Ϣ����
	public int save(BuyIn buyin, ProductInfo productInfo) {
		
		return buyinmapper.save(buyin, productInfo);
	}
	
	
	//�ɹ�������Ϣ����
	public int update(BuyIn buyin, ProductInfo productInfo, String BuyinProductId) {
		
		return buyinmapper.update(buyin, productInfo, BuyinProductId);
	}
	
	//�ɹ�����ɾ��
	public int delById(String ProductId) {
		
		return buyinmapper.delById(ProductId);
	}
	
	//���ݲɹ�ID����
	public BuyInSearch findById(String BuyinId) {
		
		Map<String,Object> param=new HashMap<String, Object>();
		param.put("pageNo", null);
		param.put("pageSize", null);
		param.put("BuyinId", BuyinId);
		return buyinmapper.find(param).get(0);
	}
	
	//��ȡ�ɹ�������Ϣ������
	public int getTotalCount() {
		
		return buyinmapper.getTotalCount();
	}
	
	//��ȡ��ҳ�б�
	public List<BuyInSearch> getPageBuyinList(Integer pageNo, Integer pageSize) {
		Map<String,Object> param=new HashMap<String, Object>();
		param.put("pageNo", (pageNo-1)*pageSize);
		param.put("pageSize", pageSize);
		param.put("BuyinId", null);
		return buyinmapper.find(param);
	}

}
