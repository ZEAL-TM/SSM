<%--
  Created by IntelliJ IDEA.
  User: 田晓梦
  Date: 2021/9/17
  Time: 下午 7:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表————修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
       <%--前端传递隐藏域--%>
        <input type="hidden" name="bookId" value="${books.bookId}">
        <div class="form-group">
            <label >书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${books.bookName}" required >
        </div>
        <div class="form-group">
            <label >书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${books.bookCounts}" required >
        </div>
        <div class="form-group">
            <label >书籍描述</label>
            <input type="text" name="detail" class="form-control" value="${books.detail}" required >
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>


    </form>
</div>

</body>
</html>
