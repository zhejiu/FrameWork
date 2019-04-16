package com.wsj.struts2.helloworld;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
public class FilterDispatcher implements Filter {

    public FilterDispatcher() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 获取servletPath
		HttpServletRequest req = (HttpServletRequest) request;
		String servletPath = req.getServletPath();
		
		String path = null;
		
		// 判断servletPath，若其等于/product-input.action,则转发到WEB/INF/pages/input.jsp
		if ("/product-input.action".equals(servletPath)) {
			path = "/WEB-INF/pages/input.jsp";
		}
		
		// 若其等于product-save.action,则转发到WEB/INF/pages/detais.jsp
		if ("/product-save.action".equals(servletPath)) {
			// 获取参数请求
			String productName = req.getParameter("productName");
			String productDesc = req.getParameter("productDesc");
			String productPrice = req.getParameter("productPrice");
			
			// 把请求信息封装成一个Product对象
			Product product = new Product(null, productName, productDesc, Double.parseDouble(productPrice));
			
			// 执行保存操作
			product.setProductId(1001);
			
			// Product对象保存到request中
			request.setAttribute("product", product);
			
			path = "/WEB-INF/pages/detais.jsp";
		}
		
		// 请求转发
		if (path != null) {
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
