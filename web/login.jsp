

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<head>
     <link rel="stylesheet" href="css/login.css">
</head>

       
    
<div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
                    <form action="rlservelt" method="post">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
                                        <input id="user" type="text" name="uname" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
                                        <input id="pass" type="password"  name="pass" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
                        </form>
                    <form action="rlservelt" method="get">
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
                                        <input id="user" type="text" name="uname" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
                                        <input id="pass" type="password" name="pass" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Repeat Password</label>
                                        <input id="pass" type="password" name="rpass" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Email Address</label>
                                        <input id="pass" type="text" name="mail" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
                        </form>
		</div>
	</div>
</div>