package com.nucleus.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nucleus.Connection.ConnectionSetup;
import com.nucleus.domain.UserInfo;



public class CustomerDAOImpl implements CustomerDAO
{
	  
	
	
			ConnectionSetup connectionSetup=new  ConnectionSetup();
		    Connection con= connectionSetup.getConnection();	

//########################################## new #############################################################			
			public void newUser(UserInfo userInfo)
			{  
				
				  PreparedStatement pstmt=null;
					try {
						 pstmt = con.prepareStatement("insert into pujauser values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						 pstmt.setString(1,userInfo.getUserCode());
						 pstmt.setString(2,userInfo.getUserName());
						 pstmt.setString(3,userInfo.getUserAddress1());
						 pstmt.setString(4,userInfo.getUserAddress2());
						 pstmt.setString(5,userInfo.getUserPinCode());
						 pstmt.setString(6,userInfo.getUserEmailAddress());
						 pstmt.setString(7,userInfo.getUserContactNo());
						 pstmt.setString(8,userInfo.getPrimaryContactPerson());
						 pstmt.setString(9,userInfo.getRecordStatus());
						 pstmt.setString(10,userInfo.getFlag());
						 pstmt.setString(11,userInfo.getCreateDate());
						 pstmt.setString(12,userInfo.getCreatedBy());
						 pstmt.setString(13,userInfo.getModifiedDate());
						 pstmt.setString(14,userInfo.getModifiedBy());
						
						 pstmt.executeUpdate();
				        
					}
					catch (SQLException e) 
					{
			           
						e.printStackTrace();
					}
					finally
					{
						try {
							connectionSetup.closeConnection(); 
							pstmt.close();
						} catch (SQLException e) {

							e.printStackTrace();
						}
						
			
				
			}

		}
 //##################################################### delete ##############################################
			public void delete(UserInfo userInfo)
			{   
				ConnectionSetup connectionSetup=new  ConnectionSetup();
			    Connection con= connectionSetup.getConnection();
			    
				 PreparedStatement pstmt=null;
					try {
						 pstmt = con.prepareStatement("delete from pujauser where usercode=?");
						 pstmt.setString(1,userInfo.getUserCode());
						 pstmt.executeUpdate();
				        
					}
					catch (SQLException e) 
					{
			           
						e.printStackTrace();
					}
					finally
					{
						try {
							connectionSetup.closeConnection(); 
							pstmt.close();
						} catch (SQLException e) {

							e.printStackTrace();
						}
						
			
				
			}
				
			}
//######################################### data fetch from sql  ###################################################################			
			public 	UserInfo viewUpdate(String usercode)
			{  
					System.out.println("1");
					UserInfo userInfo=new UserInfo();
					PreparedStatement pstmt=null;
					System.out.println("2");
			  try { System.out.println(" 3");
					 pstmt = con.prepareStatement("select * from pujauser where usercode=?");
					 pstmt.setString(1,usercode);
					ResultSet rs= pstmt.executeQuery();
					System.out.println(" in query");
						
						if (rs.next())
						{ System.out.println(" in while");
							userInfo.setUserCode(rs.getString(1));
							userInfo.setUserName(rs.getString(2) );
							userInfo.setUserAddress1(rs.getString(3));
							userInfo.setUserAddress2(rs.getString(4) );
							userInfo.setUserPinCode(rs.getString(5) );	
							userInfo.setUserEmailAddress(rs.getString(6) );
							userInfo.setUserContactNo(rs.getString(7) );
							userInfo.setPrimaryContactPerson(rs.getString(8));
							userInfo.setRecordStatus(rs.getString(9) );
							userInfo.setFlag(rs.getString(10) );	
							userInfo.setCreateDate(rs.getString(11) );
							userInfo.setCreatedBy(rs.getString(12));
							userInfo.setModifiedDate(rs.getString(13) );
							userInfo.setModifiedBy(rs.getString(14) );	
							System.out.println(" aa gaye");
							return userInfo;
							
							
						} 
			
					}
					catch (SQLException e) 
					{
			           
						e.printStackTrace();
					}
					finally
					{
						try 
						{
							connectionSetup.closeConnection(); 
							pstmt.close();
						} catch (SQLException e) 
						{

							e.printStackTrace();
						}	
				
		}
				return null;
			
				
			}	
		
		

			
			
//########################################### update ##################################################			
			
			
			
		public	 void Update (UserInfo userInfo) 
		{
			PreparedStatement pstmt=null; 
			
				try {
					
					 pstmt = con.prepareStatement("update pujauser set usercode=?,username=?,useraddress1=?,useraddress2=?,"
					 		+ "userpincode=?,useremailaddress=?,usercontactno=?,primarycontactperson=?,recordstatus=?,flag=?" );
					 pstmt.setString(1,userInfo.getUserCode());
					 pstmt.setString(2,userInfo.getUserName() );
					 pstmt.setString(3,userInfo.getUserAddress1());
					 pstmt.setString(4,userInfo.getUserAddress2());
					 pstmt.setString(5,userInfo.getUserPinCode() );
					 pstmt.setString(6,userInfo.getUserEmailAddress());
					 pstmt.setString(7,userInfo.getUserContactNo() );
					 pstmt.setString(8,userInfo.getPrimaryContactPerson());
					 pstmt.setString(9,userInfo.getRecordStatus());
					 pstmt.setString(10,userInfo.getFlag() );				
					 pstmt.executeUpdate();
					 
					 con.commit();
				}
				
			
				catch (SQLException e) 
				{
		           
					e.printStackTrace();
				}
				finally
				{
					try {
						connectionSetup.closeConnection(); 
						pstmt.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
					

			
		}
				
			
				
			}	
			
			
			
			
			
//####################################################### view ############################################################		
			
			
			public 	List<UserInfo> view(UserInfo userInfo)
			{  
			List<UserInfo> list1=new ArrayList<UserInfo>();
				  PreparedStatement pstmt=null;
					try {
						 pstmt = con.prepareStatement("select * from pujauser where usercode=?");
						 pstmt.setString(1,userInfo.getUserCode());
						ResultSet rs= pstmt.executeQuery();
						while(rs.next())
						{
							userInfo.setUserCode(rs.getString(1));
							userInfo.setUserName(rs.getString(2) );
							userInfo.setUserAddress1(rs.getString(3));
							userInfo.setUserAddress2(rs.getString(4) );
							userInfo.setUserPinCode(rs.getString(5) );	
							userInfo.setUserEmailAddress(rs.getString(6) );
							userInfo.setUserContactNo(rs.getString(7) );
							userInfo.setPrimaryContactPerson(rs.getString(8));
							userInfo.setRecordStatus(rs.getString(9) );
							userInfo.setFlag(rs.getString(10) );	
							userInfo.setCreateDate(rs.getString(11) );
							userInfo.setCreatedBy(rs.getString(12));
							userInfo.setModifiedDate(rs.getString(13) );
							userInfo.setModifiedBy(rs.getString(14) );	
							
						} 
						list1.add(userInfo);
					}
					catch (SQLException e) 
					{
			           
						e.printStackTrace();
					}
					finally
					{
						try 
						{
							connectionSetup.closeConnection(); 
							pstmt.close();
						} catch (SQLException e) 
						{

							e.printStackTrace();
						}	
				
			        }
					return list1;
		}
	//##################################################### view all ######################################################		
			public List<UserInfo> viewAll() 
			{  
				List<UserInfo> list=new ArrayList<UserInfo>();
				 PreparedStatement pstmt=null;
					try {
						 
						 pstmt = con.prepareStatement("select * from pujauser");				
						 ResultSet rs= pstmt.executeQuery();
						 System.out.println("sdhs");
						 int size=rs.getFetchSize();
						 System.out.println(size);
						while(rs.next())
						{
						UserInfo userInfo=new UserInfo();
						userInfo.setUserCode(rs.getString(1));
					
						userInfo.setUserName(rs.getString(2) );
						userInfo.setUserAddress1(rs.getString(3));
						userInfo.setUserAddress2(rs.getString(4) );
						userInfo.setUserPinCode(rs.getString(5) );	
						userInfo.setUserEmailAddress(rs.getString(6) );
						userInfo.setUserContactNo(rs.getString(7) );
						userInfo.setPrimaryContactPerson(rs.getString(8));
						userInfo.setRecordStatus(rs.getString(9) );
						userInfo.setFlag(rs.getString(10) );
						userInfo.setCreateDate(rs.getString(11) );
						userInfo.setCreatedBy(rs.getString(12));
						userInfo.setModifiedDate(rs.getString(13) );
						userInfo.setModifiedBy(rs.getString(14) );		
						list.add(userInfo);
						
						} 
				         
					}
					catch (SQLException e) 
					{
			           
						e.printStackTrace();
					}
					finally
					{
						try 
						{
							connectionSetup.closeConnection(); 
							pstmt.close();
						} catch (SQLException e) 
						{

							e.printStackTrace();
						}	
				
			        }
					return list;
				
			}
		
		
			
		}



