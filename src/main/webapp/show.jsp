<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--引入BootStrap的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <!--引入BootStrap与JQGRID整合的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot-jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <!--引入jquery的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap/js/jquery-3.3.1.min.js"></script>
    <!--引入bootstrap的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <!--引入BootStrap与JQGRID整合的国际化文件-->
    <script src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <!--引入BootStrap与JQGRID整合过后的js文件-->
    <script src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>
    <script type="application/javascript">
        $(function () {
            $("#table").jqGrid({
                styleUI:"Bootstrap",
                url:"${pageContext.request.contextPath}/user/selectAll",
                datatype:"json",
                autowidth:true,
                caption:"用户列表",
                pager:"#pager",
                rowNum:"3",
                cellEdit:true,
                rowList:["3","6","9"],
                viewrecords:true,
                editurl:"${pageContext.request.contextPath}/user/edit",
                colNames:["用户id","用户名","密码","手机号","邮箱","ip","身份","来源","状态"],
                colModel:[
                    {
                        name:"id"
                    },
                    {
                        name:"username",editable:true
                    },
                    {
                        name:"password",editable:true
                    },
                    {
                        name:"iphone",editable:true
                    },
                    {
                        name:"email",editable:true
                    },
                    {
                        name:"ip",editable:true
                    },
                    {
                        name:"position"
                    },
                    {
                        name:"source",editable:true
                    },
                    {
                        name:"status"
                    }

                ]
            }).jqGrid("navGrid","#pager",{edit:true})
        })
    </script>
</head>
<body>
    <table id="table"></table>
    <div id="pager"></div>
</body>
</html>