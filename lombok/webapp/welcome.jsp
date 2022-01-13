<!DOCTYPE html>
<html>
<head>
<title>Watch Register</title>
</head>
<body
	style="background-repeat: no-repeat; background-size: cover; background-color: Grey; align-items: center; justify-content: center; background-attachment: fixed; margin: 0">
	<header
		style="text-align: center; background-color: Black; color: chartreuse; border-style: double; border-color: blanchedalmond; border-width: 1px; padding: 0%; display: grid;">
		<h1>Watch Registration</h1>
		<h3>Claim your Warranty Here</h3>
		<h2 style="text-align: center; color: red; border: thick;">${messageValidtion}</h2>
		<form action="xyz.done"></form>
	</header>

	<p style="text-align: center; color: red; font-size: xx-large;">${messageForName}</p>

	<table>
		<tr>
			<td>
				<table>
					<form action="xyz.done">
						<tr>
							<td><label>Name:</label></td>
							<td><input type="text" name="name" placeholder="enter name"></td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<p>${messageForEmail}</p>
							<td><input type="Email" name="email"
								placeholder="enter email"></td>

						</tr>
						<tr>
							<td><label>Address:</label></td>
							<p>${messageForAddress}</p>
							<td><input type="text" name="address"
								placeholder="enter your address"></td>
						<tr>
							<td><label>Mobile Number:</label></td>
							<p>${messageForMobile}</p>
							<td><input type="number" name="mobileNumber"
								placeholder="enter your mobile number"></td>
						</tr>

						<tr>
							<td><label>Enter ID</label></td>
							<td><input type="number" name="enterId"
								placeholder="Enter your Id number">
						<tr>

							<td><input type="reset" value="clear"></td>
						</tr>

						<tr>
							<td><input type="submit" value="submit"></td>
						</tr>



					</form>
					<form action="serach.done">
						<h2>${serachValidationMeassge}</h2>
						<label>Serach</label> <input type="text" name="serachByName">
						<input type="submit" value="Submit">
						<ol>
							<li>${ENTERID}</li>
							<li>${NAME}</li>
							<li>${EMAIL}</li>
							<li>${ADDRESS}</li>
							<li>${MOBILENUMBER}</li>
						</ol>
					</form>


				</table>
			</td>
		</tr>
	</table>
	<footer
		style="text-align: center; color: cyan; border-style: dotted; border-color: aqua; border-width: 3px; position: fixed; bottom: 0%; width: 100%;">
		<h1>All Rights are Reserved</h1>
	</footer>


</body>
</html>
