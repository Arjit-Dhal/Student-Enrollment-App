<!DOCTYPE html>
<html lang="en"
      xmlns:th="http://www.thymeleaf.org"
>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<!-- <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">"Welcome To Back to Your Learning Journey!"</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav> -->
<br /><br />
<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
        
            <div class="card">
                <div class="card-header">
                    <h2 class="text-center">login Fortm</h2>
                </div>
                <div class="card-body">
                    <form
                            method="post"
                            role="form"
                            action="/login"
                            class="form-horizontal"
                    >
                        <div class="form-group mb-3">
                            <label class="control-label">Username:</label>
                            <input
                                    type="text"
                                    id="username"
                                    name="username"
                                    class="form-control"
                                    placeholder="Enter login username"
                            />
                        </div>

                        <div class="form-group mb-3">
                            <label class="control-label">Password:</label>
                            <input
                                    type="password"
                                    id="password"
                                    name="password"
                                    class="form-control"
                                    placeholder="Enter login password"
                            />
                        </div>
                        <div class="form-group mb-3">
                            <button type="submit" class="btn btn-primary" >Submit</button>
                            <span> Not registered ?
                                <a href="/register/form">Register/Signup here</a>
                            </span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>