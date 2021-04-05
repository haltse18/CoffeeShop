<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="loginForm/fonts/icomoon/style.css">

        <link rel="stylesheet" href="loginForm/css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="loginForm/css/bootstrap.min.css">

        <!-- Style -->
        <link rel="stylesheet" href="loginForm/css/style.css">
        <meta name="google-signin-client_id" content="870337553536-vbjn7gf7fjchbtbnou42m3c3u7hknuuc.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <script>
            function onSignIn(googleUser) {
                var profile = googleUser.getBasicProfile();
                console.log("ID: " + profile.getId()); // Don't send this directly to your server!
                console.log('Full Name: ' + profile.getName());
                console.log('Given Name: ' + profile.getGivenName());
                console.log('Family Name: ' + profile.getFamilyName());

                console.log("Email: " + profile.getEmail());

                var id = profile.getId();
                var GivenName = profile.getName()
                var FamilyName = profile.getFamilyName()
                var Email = profile.getEmail()

                var redirectUrl = 'MainController?btnAction=loginGG';

                //using jquery to post data dynamically
                var form = $('<form action="' + redirectUrl + '" method="post">' +
                        '<input type="text" name="id" value="' + id + '" />' +
                        '<input type="text" name="GivenName" value="' + GivenName + '" />' +
                        '<input type="text" name="FamilyName" value="' + FamilyName + '" />' +
                        '<input type="text" name="Email" value="' + Email + '" />' +
                        '</form>');
                $('body').append(form);
                form.submit();

            }
            function signOut() {
                gapi.auth2.getAuthInstance().signOut()
            }

            function alertLoginError(msg) {
                alert(msg);
            }


        </script>


        <title>Login</title>
    </head>
    <body>


        <div class="d-lg-flex half">
            <div class="bg order-1 order-md-2" style="background-image: url('img/bg.jpg');"></div>
            <div class="contents order-2 order-md-1">

                <div class="container">
                    <div class="row align-items-center justify-content-center">
                        <div class="col-md-7">
                            <div class="mb-4">
                                <h3>Sign In</h3>

                            </div>
                            <form action="MainController" method="post">
                                <div class="form-group first">
                                    <label for="username">Username</label>
                                    <input type="text"  class="form-control" id="username" name="txtUsername">

                                </div>
                                <div class="form-group last mb-3">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password" name="txtPassword">

                                </div>

                                

                                <input type="submit" value="Log In" name="btnAction" class="btn btn-block btn-primary"/>

                                <span class="d-block text-center my-4 text-muted">&mdash; or &mdash;</span>

                                <div class="social-login">                
                                    <!--                                    <div class="g-signin2" data-onsuccess="onSignIn" >
                                                                        </div>
                                                                        <button onclick="signOut();">Log out</button>-->
                                    <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8084/LAB1_COFFEESHOP/LoginGoogleController&response_type=code
                                       &client_id=870337553536-vbjn7gf7fjchbtbnou42m3c3u7hknuuc.apps.googleusercontent.com" class="google btn d-flex justify-content-center align-items-center">
                                        <span class="icon-google mr-3"></span> Login with  Google</a>


                                </div>
                                <c:if test="${not empty requestScope.LOGINERROR}">
                                        <script>
                                            alertLoginError('${requestScope.LOGINERROR}');
                                        </script>
                                </c:if>

                            </form>
                        </div>
                    </div>
                </div>
            </div>


        </div>



        <script src="loginForm/js/jquery-3.3.1.min.js"></script>
        <script src="loginForm/js/popper.min.js"></script>
        <script src="loginForm/js/bootstrap.min.js"></script>
        <script src="loginForm/js/main.js"></script>
    </body>
</html>