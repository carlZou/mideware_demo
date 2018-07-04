<!DOCTYPE>
<html>
<head>
    <title>mideware_demo</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css">
</head>
<body>
<div class="row">
    <div class="col-6">
        <ul class="nav">
            <li class="nav-item">
                <a class="nav-link active" href="#">Query</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Add Info</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Add account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
    </div>
</div>

<div class="row">
    <div class="col-8">
        <#--<#list user.items>-->
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">g_name</th>
                <th scope="col">dept_no</th>
                <th scope="col">email</th>
                <th scope="col">tel</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td>###</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                <td>###</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Larry the Bird</td>
                <td>####</td>
                <td>@twitter</td>
                <td>###</td>
            </tr>
            </tbody>
        </table>
        <#--</#list>-->
    </div>
</div>

<div class="row">
    <div class="col">
        <nav aria-label="Page navigation example">
            <ul class="pagination justify-content-center">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
        </nav>
    </div>
</div>

<script src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>
</body>
</html>