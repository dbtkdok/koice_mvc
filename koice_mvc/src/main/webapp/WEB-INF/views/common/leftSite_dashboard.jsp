<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<aside class="left-sidebar">
	     <!-- Sidebar scroll-->
		<div>
		  <div class="brand-logo d-flex align-items-center justify-content-between">
		    <a href="/dashboard.do" class="text-nowrap logo-img">
		      <img src="${contextPath}/resources/static/img/icon/koice 3koice.png" width="180" alt="" />
		    </a>
		    <div class="close-btn d-xl-none d-block sidebartoggler cursor-pointer" id="sidebarCollapse">
		      <i class="ti ti-x fs-8"></i>
		    </div>
		  </div>
		  <!-- Sidebar navigation-->
		 <nav class="sidebar-nav scroll-sidebar" data-simplebar="">
		   <ul id="sidebarnav">
		     <li class="nav-small-cap">
		       <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
		       <span class="hide-menu">Home</span>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link active" href="/dashboard.do" aria-expanded="false">
		         <span>
		           <i class="ti ti-layout-dashboard"></i>
		         </span>
		         <span class="hide-menu">Dashboard</span>
		       </a>
		     </li>
		     <li class="nav-small-cap">
		       <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
		       <span class="hide-menu">프로그램 관라</span>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="/schedule.do" aria-expanded="false">
		         <span>
		           <i class="ti ti-article"></i>
		         </span>
		         <span class="hide-menu">일정관리</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-alert-circle"></i>
		         </span>
		         <span class="hide-menu">교육자료</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="/consultation.do" aria-expanded="false">
		         <span>
		           <i class="ti ti-cards"></i>
		         </span>
		         <span class="hide-menu">상담자료</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-file-description"></i>
		         </span>
		         <span class="hide-menu">첨부자료</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-typography"></i>
		         </span>
		         <span class="hide-menu">평가지표</span>
		       </a>
		     </li>
		     <li class="nav-small-cap">
		       <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
		       <span class="hide-menu">빅데이터 분석</span>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-align-box-bottom-center"></i>
		         </span>
		         <span class="hide-menu">차트 분석</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-adjustments"></i>
		         </span>
		         <span class="hide-menu">트랜드 분석</span>
		       </a>
		     </li>
		     <li class="nav-small-cap">
		       <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
		       <span class="hide-menu">사용자 관리</span>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-user"></i>
		         </span>
		         <span class="hide-menu">학생관리</span>
		       </a>
		     </li>
		     <li class="sidebar-item">
		       <a class="sidebar-link" href="javascript:void(0)" aria-expanded="false">
		         <span>
		           <i class="ti ti-seeding"></i>
		         </span>
		         <span class="hide-menu">과제관리</span>
		       </a>
		     </li>
		   </ul>
		 </nav>
		 <!-- End Sidebar navigation -->
		</div>
	<!-- End Sidebar scroll-->
	</aside>
  
</body>
</html>