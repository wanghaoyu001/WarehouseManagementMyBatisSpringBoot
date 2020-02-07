package com.service;

import com.pojo.BuyIn;
import com.pojo.BuyInSearch;
import com.pojo.ProductInfo;

import java.util.List;

public interface IBuyinBiz {
	//�ɹ�������¼����
	public int save(BuyIn buyin, ProductInfo productInfo);
	
	//�ɹ�������¼����
	public int update(BuyIn buyin, ProductInfo productInfo, String BuyinProductId);
	
	//���ݲ�ƷIDɾ��
	public int delById(String ProductId);
	
	//���ݲɹ�ID����
	public BuyInSearch findById(String BuyinId);

	//��ȡ�ɹ�������Ϣ������
	public int getTotalCount();

	//��ҳ��ȡ�ɹ�������Ϣ����
	public List<BuyInSearch> getPageBuyinList(Integer pageNo, Integer pageSize);
}
