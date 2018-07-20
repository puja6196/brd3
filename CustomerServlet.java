package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.DAO.CustomerDAO;
import com.nucleus.DAO.CustomerDAOImpl;
import com.nucleus.domain.UserInfo;




/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	// ################################################ new #################################################
		 if(request.getParameter("NEW") != null)
	       {  
		      response.sendRedirect("NEW.jsp");	
	       }		         
      if(request.getParameter("SubmitDetails")!=null)
	       {		
	        doNewEntry(request,response);
	       }
		
//################################## view ##################################
      if(request.getParameter("View") != null)
      {
	
	      response.sendRedirect("Viewc.jsp");	
      }
 
  if(request.getParameter("submit1")!=null)
     {		
      
	   doview(request,response);
	   
     }
	//################################## view all #######################################
  if(request.getParameter("ViewInfo") != null)
  {
	
	response.sendRedirect("Viewallc.jsp");	
  }
 
  if(request.getParameter("submit") != null)
  {
	   		
	       doviewall(request,response);		       
  
  }
	//################################## delete  ######################################
  if(request.getParameter("Delete") != null)
  {
 response.sendRedirect("delete.jsp");       
  }
if(request.getParameter("deleteentry") != null)
  {

   doDelete(request,response);

  }
  // ############################ fetch data ###################################################
if(request.getParameter("Update") != null)
{
 
  response.sendRedirect("updatec.jsp");	
}
if(request.getParameter("update")!=null)
{	
  doViewUpdate(request,response);		       
}

//################################### update ################################################
if(request.getParameter("SubmitDetails")!=null)
{
	 doUpdate(request,response);
}


if(request.getParameter("update")!=null)
{	
  doViewUpdate(request,response);		       
}








	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		

}*/
//########################################### new ###################################################################
	protected void doNewEntry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  
		
		UserInfo userInfo=new UserInfo();	
		PrintWriter out=response.getWriter();
		CustomerDAO daoUser1=new CustomerDAOImpl();
		String usercode=request.getParameter("usercode");
	    String username=request.getParameter("username");
	    String useraddress1=request.getParameter("useraddress1");	    
	    String useraddress2=request.getParameter("useraddress2");
	    String userpincode=request.getParameter("userpincode");
	    String useremailaddress=request.getParameter("useremailaddress");
	    String usercontactno=request.getParameter("usercontactno");
	    String primarycontactperson=request.getParameter("primarycontactperson");	    
	    String recordstatus=request.getParameter("recordstatus");
	    String flag=request.getParameter("flag"); 
	    String createdate=request.getParameter("createdate");
	    String createdby=request.getParameter("createdby");	    
	    String modifieddate=request.getParameter("modifieddate");
	    String modifiedby=request.getParameter("modifiedby");
	    
	    
	    
	    userInfo.setUserCode(usercode);
		userInfo.setUserName(username);
		userInfo.setUserAddress1(useraddress1);
		userInfo.setUserAddress2(useraddress2);
		userInfo.setUserPinCode(userpincode) ;
		userInfo.setUserEmailAddress(useremailaddress);
		userInfo.setUserContactNo(usercontactno);
		userInfo.setPrimaryContactPerson( primarycontactperson);
		userInfo.setRecordStatus(recordstatus);
		userInfo.setFlag(flag);
		userInfo.setCreateDate(createdate);
		userInfo.setCreatedBy(createdby);
		userInfo.setModifiedDate(modifieddate);
		userInfo.setModifiedBy(modifiedby);
		
		
		
	    
	    
		daoUser1.newUser(userInfo);
	    
        out.println("new book entry");
        out.println();
        
        
	
	}

//##################################### view ################################################################
	protected void doview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   PrintWriter out=response.getWriter();
	
		
	UserInfo userInfo=new UserInfo();	
	CustomerDAO daoUser1=new CustomerDAOImpl();
	
		String usercode=request.getParameter("usercode");
		userInfo.setUserCode(usercode);
		List<UserInfo> list1=	daoUser1.view( userInfo);
		request.setAttribute("list1", list1);
		  RequestDispatcher rd=request.getRequestDispatcher("View11.jsp");

		  rd.include(request, response);
		
		
		
		
	}
//######################################### view all ##############################################################
	protected void doviewall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  
		
		PrintWriter out=response.getWriter();
		
		UserInfo userInfo=new UserInfo();	
		CustomerDAO daoUser1=new CustomerDAOImpl();
		List<UserInfo> list=daoUser1.viewAll();
		request.setAttribute("list", list);
		  RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");

		  rd.include(request, response);
		
		
	}

//###################################### delete ##########################################################

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  CustomerDAO daoUser1=new CustomerDAOImpl();
     	UserInfo userInfo=new UserInfo();
     	
		PrintWriter out=response.getWriter();
		
		String usercode=request.getParameter("usercode");		
		userInfo.setUserCode(usercode);
	
		daoUser1.delete( userInfo);
		

		
		
		
	}
	//################################## data fetch from SQL ##################################################################

	protected void doViewUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   
		UserInfo userInfo=new UserInfo();	 // pojo object
		CustomerDAO daoUser1=new CustomerDAOImpl(); // dao object
		
		String usercode=request.getParameter("usercode");
		
		userInfo =daoUser1.viewUpdate(usercode);
		if(userInfo!=null)
		{
			System.out.println("userrinfo"+userInfo.getUserName());
		request.setAttribute("userInfo", userInfo);
	 RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
		  rd.include(request, response);
		}
		
	}

//######################################## update ######################################################################
	 
	protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   
		UserInfo userInfo=new UserInfo();	 // pojo object
		CustomerDAO daoUser1=new CustomerDAOImpl(); // dao object
		
		userInfo.setUserCode(request.getParameter("usercode"));
	
		userInfo.setUserName(request.getParameter("username"));
		userInfo.setUserAddress1(request.getParameter("useraddress1"));	    
		userInfo.setUserAddress2(request.getParameter("useraddress2"));
		userInfo.setUserPinCode(request.getParameter("userpincode"));	   
		userInfo.setUserEmailAddress(request.getParameter("useremailaddress"));
		userInfo.setUserContactNo(request.getParameter("usercontactno"));	   
		userInfo.setPrimaryContactPerson(request.getParameter("primarycontactperson"));
		userInfo.setRecordStatus(request.getParameter("recordstatus"));	   
		userInfo.setFlag(request.getParameter("flag"));	  
	    
		daoUser1.Update(userInfo);

	}}
