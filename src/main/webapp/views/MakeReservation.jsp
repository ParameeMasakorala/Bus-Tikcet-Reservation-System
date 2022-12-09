<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>




<form method="post">
  
  <div class="form-group col-md-6">
    <label for="text">Passenger name</label>
    <input type="text" class="form-control" id="name" placeholder="Passenger name">
  </div>
   <div class="form-group col-md-6">
    <label for="text">Passenger mobile number</label>
    <input type="text" class="form-control" id="mobileno" placeholder="Passenger mobile number">
  </div>

    
    <div class="form-group col-md-6">
      <label for="destination">Destination</label>
      <input type="text" class="form-control" id="destination" placeholder="From">
      <input type="text" class="form-control" id="destination" placeholder="To">
    </div>
    <div class="form-group col-md-6">
      <label for="seatno">Seat no</label>
      <input type="text" class="form-control" id="seatno" placeholder="Seat no">
    </div>
  
  <div class="form-group col-md-6">
    <label for="noofPassenger">No of passenger</label>
    <input type="text" class="form-control" id="noofPassenger" placeholder="No Of Passenger">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>