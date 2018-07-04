<!DOCTYPE>
<html>
<head>
    <title>sign up</title>
    <link href="/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>
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
       <h2>Sign Up</h2>
    </div>
    <div class="row">

        <div class="col-4 col-md-offset-3">

            <form action="/signupform" method="post">
                <div class="form-group">
                    <label>username:</label>
                    <input class="form-control" type="text" name="userName"><br>
                </div>
                <div class="form-group">
                    <label>password:</label>
                    <input class="form-control" type="password" name="password"><br>
                </div>
                <button class="btn btn-default" type="submit">confrim</button>
            </form>
            <a href="/">Back to Sign In</a>
        </div>

    </div>
</div>


</body>
</html>