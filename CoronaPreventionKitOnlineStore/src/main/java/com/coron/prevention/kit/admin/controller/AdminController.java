package com.coron.prevention.kit.admin.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.corona.prevention.kit.admin.dao.AdminDao;
import com.corona.prevention.kit.admin.model.AdminModel;


@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private AdminDao objDao;
   
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		
		String jdbcDriver=config.getServletContext().getInitParameter("jdbcDriver");
		String jdbcUrl=config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername=config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword=config.getServletContext().getInitParameter("jdbcPassword");
		this.objDao=new AdminDao(jdbcDriver,jdbcUrl,jdbcUsername,jdbcPassword);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action=request.getParameter("action");
		String ViewName="";
		
		
		try {
			
			switch(action) {
			
			case "login":
					ViewName=adminLogin(request,response);
					break;
			case "listproducts":
				ViewName=showDashboard(request,response);
				break;
			case "newproduct":
				ViewName=showNewProductForm(request,response);
				break;
			case "save":
				ViewName=saveNewProduct(request,response);
				break;
			case "saveproduct":break;
			case "delete":
			ViewName=deleteRecord(request,response);
			break;
			case "edit":
			ViewName=showEditProductForm(request,response);
			break;
			case "Update":
				ViewName=SaveUpdateProductForm(request,response);
				break;
			case "logout":
				ViewName=adminLogout(request,response);
				break;
			case "newuser":
				ViewName=showNewUserForm(request,response);
				break;
			case "insertuser":
				ViewName = insertnewuser(request, response);
				break;	
			case "showproducts":
				ViewName = showAllProducts(request, response);
				break;
			case "addnewitem":
				ViewName = addNewItemToKit(request, response);
				break;
			case "showkit":
				ViewName = showKitDetails(request, response);
				break;
			case "placeorder":
				ViewName = showPlaceOrderForm(request, response);
				break;
			case "saveorder":
				ViewName = saveOrderForDelivery(request, response);
				break;	
			case "ordersummary":
				ViewName = showOrderSummary(request, response);
				break;	
			default : ViewName = "notfound.jsp"; break;	
			}
			}
			
		}catch(private String showOrderSummary(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}


		private String saveOrderForDelivery(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}


		private String showPlaceOrderForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

		Exception ex) {
			
			throw new ServletException(ex.getMessage());
			
			
		}
		
		if (ViewName==null || ViewName.equals("") ) {
			
			response.sendError(response.SC_NOT_FOUND);
		}else {
			
			RequestDispatcher dispatch=request.getRequestDispatcher(ViewName);
			dispatch.forward(request, response);
		}
		
		
	}	
	
	
	
		private String showKitDetails(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}


		private String addNewItemToKit(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
			List<AdminModel>	objadminmodel3 =this.objDao.getProductsListRecords();
			request.setAttribute("objadminmodel3", objadminmodel3);
					
			return "showkit.jsp";
	}


		private String insertnewuser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
			
			String username=request.getParameter("userpname");
			String useremail=request.getParameter("userpemail");
			String usercontact=request.getParameter("userpcontact");
			this.objDao.addNewUser(username,useremail,usercontact);
			return "admin?action=showproducts";
	}


		private String showAllProducts(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
			List<AdminModel>	objadminmodel =this.objDao.getProductsListRecords();
			request.setAttribute("objadminmodel", objadminmodel);
			
			
			return "showproductstoadd.jsp";
	}


		private String showNewUserForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
			return "newuser.jsp";
	}


		private String adminLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(false);
			if(session != null)
			    session.invalidate();
			return "index.html";
	}


		
		
		
		
		private String adminLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String uname = request.getParameter("uname");
			String password = request.getParameter("password");
			if(uname.equals("admin") && password.equals("admin")) {
				// put the data into a container to ship to JSP page
				// container : session
				
				request.getSession().setAttribute("username", uname);
				// add more data
				return "admin?action=listproducts";
			}
			else
				return "admin?action=login";
			
					
			}
			
			
			
	


		private String SaveUpdateProductForm(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
			String id=request.getParameter("id");
			String name=request.getParameter("pname");
			String cost=request.getParameter("pcost");
			String desc=request.getParameter("pdesc");
			this.objDao.SaveUpdateProductForm2(id,name,cost,desc);
						
			
		return "admin?action=listproducts";		
			
	}


		private String showEditProductForm(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
			
			        
		        
			return "editproduct.jsp";
	}


		private String deleteRecord(HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, ClassNotFoundException, SQLException {
		String id=request.getParameter("id");
		this.objDao.deleteProduct(id);
		return "admin?action=listproducts";
	}


		private String saveNewProduct(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		
			String name=request.getParameter("pname");
			String cost=request.getParameter("pcost");
			String desc=request.getParameter("pdesc");
			this.objDao.addNewProduct(name,cost,desc);
						
			
		return "admin?action=listproducts";
	}


		private String showNewProductForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "newproduct.jsp";
	}


		private String  showDashboard (HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, SQLException {
			List<AdminModel>	objadminmodel =this.objDao.getProductsListRecords();
		request.setAttribute("objadminmodel", objadminmodel);
		
		
		return "listproducts.jsp";
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
