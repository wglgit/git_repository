package com.wgl.mvcapp.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.management.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/custommerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String method =  request.getParameter("method");
//		switch (method) {
//		case "add":
//		{
//			add(request,response);
//			break;
//		}
//		case "query":
//			query(request,response);
//			break;
//		case "delete":
//			delete(request,response);
//			break;
//		case "update":
//			update(request,response);
//			break;
//		default:
//			break;
//		}
		//获取方法路径
		String serveltPaht = request.getServletPath();
		//去掉.do
		String methodName = serveltPaht.substring(1, serveltPaht.length() - 3);
		System.out.println(methodName);
		try {
			//利用反射获取methodName对应的方法
			Method  method= getClass().getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
			//利用放射调用对应的方法
			method.invoke(this, request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			response.sendRedirect("error.jsp");
		} 
	}

	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		System.out.println("edit");

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		System.out.println("query");

	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		System.out.println("add");

	}

}
