package com.controller;


import com.pojo.BuyIn;
import com.pojo.BuyInSearch;
import com.pojo.ProductInfo;
import com.service.IBuyinBiz;
import com.util.Pageutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class BuyinController implements IBuyinController {
	@Autowired
	private IBuyinBiz buyinbiz;

	public IBuyinBiz getBuyinbiz() {
		return buyinbiz;
	}

	public void setBuyinbiz(IBuyinBiz buyinbiz) {
		this.buyinbiz = buyinbiz;
	}

	
	@RequestMapping(value = "BuyinSave.do",method=RequestMethod.POST)
	public String save(HttpServletRequest request, HttpServletResponse response,BuyInSearch buyinsearch) {
		BuyInSearch buyinsearch1 = buyinsearch;
		System.out.println(buyinsearch1.toString());
		
		BuyIn buyin=new BuyIn();
		buyin.setBuyinProductId(buyinsearch1.getProductId());
		buyin.setBuyinNum(buyinsearch1.getBuyinNum());
		buyin.setBuyinPrice(buyinsearch1.getBuyinPrice());
		buyin.setBuyinTotal(buyinsearch1.getBuyinTotal());
		buyin.setBuyinPay(buyinsearch1.getBuyinPay());
		buyin.setBuyinDebt(buyinsearch1.getBuyinDebt());
		buyin.setBuyinWarehouse(buyinsearch1.getBuyinWarehouse());
		buyin.setBuyinSupplier(buyinsearch1.getBuyinSupplier());
		buyin.setBuyinTime(buyinsearch1.getBuyinTime());
		buyin.setBuyinUser(buyinsearch1.getBuyinUser());
		buyin.setBuyinRemarks(buyinsearch1.getBuyinRemarks());
		
		ProductInfo productInfo=new ProductInfo();
		productInfo.setProductId(buyinsearch1.getProductId());
		productInfo.setProductName(buyinsearch1.getProductName());
		productInfo.setProductSpecs(buyinsearch1.getProductSpecs());
		productInfo.setProductType(buyinsearch1.getProductType());
		
		int flag = buyinbiz.save(buyin,productInfo);
		if (flag > 0) {
			return "1";
		} else {
			return "0";
		}
	}

	
	@RequestMapping(value = "BuyinUpdate.do",method=RequestMethod.POST)
	public String update(HttpServletRequest request, HttpServletResponse response,BuyInSearch buyinsearch) {
		BuyInSearch buyinsearch1 = buyinsearch;
		BuyIn buyin=new BuyIn();
		buyin.setBuyinId(buyinsearch1.getBuyinId());
		buyin.setBuyinProductId(buyinsearch1.getBuyinProductId());
		buyin.setBuyinNum(buyinsearch1.getBuyinNum());
		buyin.setBuyinPrice(buyinsearch1.getBuyinPrice());
		buyin.setBuyinTotal(buyinsearch1.getBuyinTotal());
		buyin.setBuyinPay(buyinsearch1.getBuyinPay());
		buyin.setBuyinDebt(buyinsearch1.getBuyinDebt());
		buyin.setBuyinWarehouse(buyinsearch1.getBuyinWarehouse());
		buyin.setBuyinSupplier(buyinsearch1.getBuyinSupplier());
		buyin.setBuyinTime(buyinsearch1.getBuyinTime());
		buyin.setBuyinUser(buyinsearch1.getBuyinUser());
		buyin.setBuyinRemarks(buyinsearch1.getBuyinRemarks());
		
		ProductInfo productInfo=new ProductInfo();
		productInfo.setProductId(buyinsearch1.getProductId());
		productInfo.setProductName(buyinsearch1.getProductName());
		productInfo.setProductSpecs(buyinsearch1.getProductSpecs());
		productInfo.setProductType(buyinsearch1.getProductType());
		int updateflag = buyinbiz.update(buyin, productInfo, buyinsearch1.getBuyinProductId());
		if (updateflag > 0) {
			return "1";
		} else {
			return "0";
		}
	}

	
	@RequestMapping(value = "BuyinDelById.do")
	public String delById(HttpServletRequest request, HttpServletResponse response, String buyinProductId) {
		int delflag=buyinbiz.delById(buyinProductId);
		if (delflag > 0) {
			return "1";
		} else {
			return "0";
		}
	}

	
	@RequestMapping(value = "findById.do")
	public BuyInSearch findById(HttpServletRequest request, HttpServletResponse response, String BuyinId) {
		BuyInSearch bSearch=buyinbiz.findById(BuyinId);
		return bSearch;
	}


	
	@RequestMapping(value = "BuyinPageList.do")
	public Pageutil getPageBuyinList(HttpServletRequest request, HttpServletResponse response,  String currentPageNo, String pageSize) {
		
		HttpSession session=request.getSession();
		// 创建分页类对象
		Pageutil pgbuyin = (Pageutil) session.getAttribute("pgbuyin");
		pgbuyin = pgbuyin == null ? new Pageutil() : pgbuyin;
		// 设置记录总页数
		int totalCount = buyinbiz.getTotalCount();
		System.out.println("totalCount:" + totalCount);
		pgbuyin.setTotalCount(totalCount);

		// 获取当前页码
		int nowpageIndex = Integer.parseInt(currentPageNo);
		// 获取每页显示数量
		int nowpageSize = Integer.parseInt(pageSize);

		if (nowpageSize < 1) {
			nowpageSize = 1;
		} else if (nowpageSize > totalCount) {
			nowpageSize = totalCount;
		}
		pgbuyin.setPageSize(nowpageSize);
		pgbuyin.setTotalPageCount();
		System.out.println("TotalPageCount:" + pgbuyin.getTotalPageCount());
		if (nowpageIndex < 1) {
			nowpageIndex = 1;
		} else if (nowpageIndex > pgbuyin.getTotalPageCount()) {
			nowpageIndex = pgbuyin.getTotalPageCount();
		}
		pgbuyin.setCurrentPageNo(nowpageIndex);
		System.out.println("nowpageIndex:" + nowpageIndex);
		System.out.println("nowpageSize:" + nowpageSize);
		// 获取记录集合并封装
		List<BuyInSearch> listPage = buyinbiz.getPageBuyinList(nowpageIndex, nowpageSize);
		pgbuyin.setPagelist(listPage);
		// 计算出总页数
		pgbuyin.setTotalPageCount();
		return pgbuyin;
	}

}
