
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>查找</title>
    <style type="text/css">
        tbody {
            font-size: 25px;
            color: #3e8e41;
            background: EBD3E8;
            height: 50px;
            width: 500px;
        }

        .button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
    </style>
</head>

<body topmargin="7%">
<center>
    <form action="/search" method="post">
        <table>
            <tbody>
            <tr>
                <td>搜索:</td>
                <td><input type="text" name="name"></input></td>
            </tr>
            <tr>
                <td></td>
                <td><button class="button" type="submit" value="确定">确认</button></td>
            </tr>
            </tbody>
        </table>
    </form>
    <br />
    <br />
    <a href="index.jsp">跳转到首页</a>
</center>
</body>

</html>