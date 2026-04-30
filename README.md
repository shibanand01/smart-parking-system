Parking management System :-

Costumer side :-
	•	Gets a platform to book parking tickets.
	•	When booked user gets parking slots and place and also a map direction till the parking spot.
	•	Gets to register the client and its vehicles.
	•	Gets a Maps Api to look out for parking places nearby.
	•	Booking on spot—> through app or through the service provider.
	•	Advance slot booking before 5 - 10 mins of arrival at the parking spot.
	•	Payment at the time of departure on the basis of hours booked for.(payment page)
	•	Check in- check out page.(payment options -> in app or on spot).
	•	Generates QR code / Digit Code to be scanned by the service provider.(Mainly to check the details of car, security and payment status.
	•	The app pre- registers vehicles under your user name to book for the vehicle.
	•	If booked in an unmanned multi-level parking lot then the a device will scan your booking QR /Digit Code along with Driver image to keep for security.
	•	Gets online slip as a proof of facility usage.

Service Provider side :- 
	•	Gets a platform to register your parking lot and its location.
	•	Adds details of parking lot total no. Of car/bike that can be stored.
	•	Adds payment details, to receive payment.
	•	Has to categorise the parking facility under the predefined categories.
	•	Uses a scanner to check for car details like -> the vehicle no.(for customer security), Hours parked, Total price. 
	•	Gets interface to receive payment of the parking.
	•	Can check for daily collection, no. of vehicles in a day and their details.
	•	But cant get the customer details except for the name and vehicle registration number under which it was booked for future reference.
	•	At the gates at the time of entry automated gates for entrance and exit to check for the vehicle booking status. When scanned here the vehicle gets checked-in/ checked -out

Server Features:- 
	•	The parking spot to be categorised under outdoor/ indoor parking.
	•	The parking charges to be decided at the end on the basis of hours parked.
	•	When a User books a slot marks it as filled until checked out.
	•	Calculates the total collection of a Parking lot and the total no.of vehicles it handled.(needs to be stored DB)
	•	As Users register stores their and their vehicle details in the DB
	•	Generates QR assigning to the event at the time of booking.(asks for the driver name to be shown and phone.)
	•	Gives payment interface and billing interface after the payment is done.(for customer)
	•	Similarly the Service provider gets the payment receiving interface.
	•	Gives the Service provider and scanner interface to scan the QR and scanning that it retrieves the booking details.

Database Features :- 
	•	Stores the user id, password, and vehicle details.
	•	upon booking stores the driver phone. And name, along with time of booking.. which parking lot and the parking slot no., hour of parking.
	•	Stores the parking lot details and location( price, vacancy, location)-> changes everytime booked-> checkin increases and checkout decreases
	•	stores the parking lot names and there location.
