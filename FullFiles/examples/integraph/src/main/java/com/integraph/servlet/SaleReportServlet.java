package com.integraph.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coreapi.service.ManageSalesService;

@WebServlet(urlPatterns = {"/ytdSaleReport"})
public class SaleReportServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManageSalesService manageSalesService = new ManageSalesService();
		double ytdNetSale = manageSalesService.getYTDNetSale(2021);
		req.setAttribute("ytdNetSale", ytdNetSale);
		req.getRequestDispatcher("/netSaleReport.jsp").forward(req, resp);
	}

}
