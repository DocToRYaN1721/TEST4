<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <td>您应该交纳的个人所得税为：</td>
    <td>
      <%=request.getAttribute("Tax").toString() %>元
    </td>
  </tr>
</table>
</body>
</html>
