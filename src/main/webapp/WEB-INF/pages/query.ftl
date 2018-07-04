<!DOCTYPE>
<html>
<head>
    <title>query</title>
    <link rel="stylesheet" href="webjars/layui/2.3.0/css/layui.css">
</head>
<body>

<div id="nav">
    <ul class="layui-nav" lay-filter="">
        <li class="layui-nav-item layui-this"><a href="/query">Query</a></li>
        <li class="layui-nav-item"><a href="/addinfo">Add Info</a></li>
        <li class="layui-nav-item"><a href="/adduser">Add User</a></li>
    </ul>
</div>
<div>
    <fieldset class="layui-elem-field layui-field-title site-title">
        <legend>Query Info</legend>
    </fieldset>
</div>
<div id="form">
    <form action="/queryinfo" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">Name</label>
            <div class="layui-input-block">
                <input type="text" name="gName" required  lay-verify="required" placeholder="name" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">DeptNO</label>
            <div class="layui-input-block">
                <input type="text" name="deptNo" required  lay-verify="required" placeholder="deptNo" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">Email</label>
            <div class="layui-input-block">
                <input type="email" name="email" required  lay-verify="required" placeholder="email" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">Tel</label>
            <div class="layui-input-block">
                <input type="text" name="tel" required  lay-verify="required" placeholder="tel" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo" type="submit">查询</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<div id="test1">
    <table id="querylist" lay-filter="test"></table>
</div>
<script src="webjars/layui/2.3.0/layui.js"></script>
<script>
    layui.use(['table'], function () {

        var table = layui.table;

        table.render({
            elem: '#querylist'
            , height: 315
            , url: '/query' //数据接口
            , page: true //开启分页
            , cols: [[ //表头
                // {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'},
                {field: 'gName', title: '用户名'}
                , {field: 'deptNo', title: '编号', sort: true}
                , {field: 'email', title: 'email'}
                , {field: 'tel', title: 'tel'}
            ]]
        });
    });
</script>
</body>
</html>