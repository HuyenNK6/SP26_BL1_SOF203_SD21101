<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 1/9/2026
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${school}</h1>
    <%--    Form Control
     @action: địa chỉ URL nhận dữ liệu form khi nhấp nút submit
     @method: hình thức gửi dữ liệu form, có 2 giá trị
          -   GET: Tạo chuỗi truy vấn và đính kèm URL của @action
          -   POST: Mở kênh truyền thông ngầm gửi dữ liệu lên server
 --%>
    <form action="/ket-qua-login" method="post">
        <label>Username</label>
        <input type="text" name="username" placeholder="Enter username" required><br>
        <label>Password</label>
        <input type="password" name="password" placeholder="Enter password" required><br>
        <input type="checkbox" id="cb" name="check">
        <label for="cb"> Remember me?</label><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
