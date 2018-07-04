<!doctype html>
<html lang="en" class="fullscreen-bg">

<head>
    <title>Sign In</title>
    <link href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        #main{
            margin-top: 15%;
            margin-left: 40%;
        }
    </style>
</head>

<body>
<div id="main">
    <div class="row">
        <div class="col-4">
           <h2>Sign In</h2>
        </div>
    </div>
    <div class="row">

    <div class="col-4">
        <form action="/signin" method="post">
            <div class="form-group">
                <label>user name:</label>
                <input class="form-control" type="text" name="userName"><br>
            </div>
            <div class="form-group">
                <label>password:</label>
                <input class="form-control" type="password" name="password"><br>
            </div>
            <button class="btn btn-default" type="submit">submit</button>
        </form>
        <br><a href="/signup">sign up</a>
    </div>
</div>
</div>

<script src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>
</body>

</html>
