
 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SGCMS-错误信息提示</title>
<link rel="stylesheet" href="<%=basePath %>img/style.css" type="text/css" />
<link rel="stylesheet" href="<%=basePath %>img/style2.css" type="text/css" />
<link rel="stylesheet" href="<%=basePath %>img/error.css" type="text/css" />
</head>
<style type="text/css"> 

</style>
<body >

<%-- <div id="Main">
	<div id="Banner">
				<div class="index_banner"><img src="<%=basePath %>img/login.gif"/></div>
		
		<div class="index_bg">
对不起，没有找到您想要的网页!
<br>
<a href="javascript:history.go(-1);">返回上一页</a> | <a href="<%=basePath %>">返回首页</a>

	  </div>
		
	</div>
	
</div> --%>

<div id="container">
	<img class="png" src="/img/404.png" />
	<img class="png msg" src="/img/404_msg.png" />
	<p> <a href="<%=basePath %>" target="_blank"><img class="png" src="/img/404_to_index.png" /></a> </p>
</div>

<div id="cloud" class="png"></div>



<jsp:include page="inc/foot.jsp"></jsp:include>
</body>
</html>