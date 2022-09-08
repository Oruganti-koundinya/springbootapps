<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Management</title>
</head>

<body>
		<div class="container">
 		 <form action="/feedback" method="post" >
		<label for="emailid">Emailid</label>
    <input type="email" id="emailid" name="emailid" placeholder="Your Emailid" required>
	<br>
	    
	<label for="rating">Rating</label>
	    <input type="text" id="rating" name="rating" placeholder="Your Rating" required>
	<br>
	    <label for="feedback">Feedback</label>
	    <textarea id="feedback" name="feedback" placeholder="Write your feedback here..." required></textarea>
	<br>
	    <input type="submit" value="Submit">

  </form>
  </div>
</body>
</html>