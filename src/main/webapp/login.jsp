

<!DOCTYPE html>
<html lang="en">



<div class="menu-block pull-right no-pad">

    <li class="dropdown">
        <ul id="login-dp" class="dropdown-menu">

            <div class="row">
                <div class="col-md-12" id="login">
                    <form class="form" role="form" method="post" action="j_security_check" id="login-nav" autocomplete="on">
                        <div class="form-group">
                            <label for="j_username">Username</label>
                            <input type="text" class="form-control" id="j_username" name = "j_username" placeholder="Username"  aria-required="true" autocomplete="username" required>
                        </div>
                        <div class="form-group">
                            <label for="j_password">Password</label>
                            <input type="password" class="form-control" name="j_password" id="j_password" placeholder="Password" aria-required="true" autocomplete="current-password" required>
                            <!--   <div class="help-block text-right"><a href="#">Forget password?</a></div> TODO-->
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary btn-block">Sign in</button>
                        </div>
                    </form>
                </div>
                <div class="bottom text-center col-sm-12">
                    <a href="">Register new account</a>
                </div>
            </div>

        </ul>
    </li>
</div>