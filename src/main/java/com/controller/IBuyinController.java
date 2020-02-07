package com.controller;

import com.pojo.BuyInSearch;
import com.util.Pageutil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IBuyinController {
	//??????????????
		public String save(HttpServletRequest request, HttpServletResponse response, BuyInSearch buyinsearch);
		
		//??????????????
		public String update(HttpServletRequest request, HttpServletResponse response, BuyInSearch buyinsearch);
		
		//??????ID???
		public String delById(HttpServletRequest request, HttpServletResponse response, String ProductId);
		
		//??????ID????
		public BuyInSearch findById(HttpServletRequest request, HttpServletResponse response, String BuyinId);

		//????????????????????
		public Pageutil getPageBuyinList(HttpServletRequest request, HttpServletResponse response, String currentPageNo, String pageSize);
}
