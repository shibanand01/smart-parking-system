{\rtf1\ansi\ansicpg1252\cocoartf2869
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid101\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid2}
{\list\listtemplateid3\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid201\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid3}
{\list\listtemplateid4\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid301\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid4}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}{\listoverride\listid3\listoverridecount0\ls3}{\listoverride\listid4\listoverridecount0\ls4}}
\paperw11900\paperh16840\margl1440\margr1440\vieww29200\viewh17100\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs34 \cf0 Parking management System :-\
\
Costumer side :-\
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls1\ilvl0\cf0 {\listtext	\uc0\u8226 	}Gets a platform to book parking tickets.\
{\listtext	\uc0\u8226 	}When booked user gets parking slots and place and also a map direction till the parking spot.\
{\listtext	\uc0\u8226 	}Gets to register the client and its vehicles.\
{\listtext	\uc0\u8226 	}Gets a Maps Api to look out for parking places nearby.\
{\listtext	\uc0\u8226 	}Booking on spot\'97> through app or through the service provider.\
{\listtext	\uc0\u8226 	}Advance slot booking before 5 - 10 mins of arrival at the parking spot.\
{\listtext	\uc0\u8226 	}Payment at the time of departure on the basis of hours booked for.(payment page)\
{\listtext	\uc0\u8226 	}Check in- check out page.(payment options -> in app or on spot).\
{\listtext	\uc0\u8226 	}Generates QR code / Digit Code to be scanned by the service provider.(Mainly to check the details of car, security and payment status.\
{\listtext	\uc0\u8226 	}The app pre- registers vehicles under your user name to book for the vehicle.\
{\listtext	\uc0\u8226 	}If booked in an unmanned multi-level parking lot then the a device will scan your booking QR /Digit Code along with Driver image to keep for security.\
{\listtext	\uc0\u8226 	}Gets online slip as a proof of facility usage.\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
Service Provider side :- \
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls2\ilvl0\cf0 {\listtext	\uc0\u8226 	}Gets a platform to register your parking lot and its location.\
{\listtext	\uc0\u8226 	}Adds details of parking lot total no. Of car/bike that can be stored.\
{\listtext	\uc0\u8226 	}Adds payment details, to receive payment.\
{\listtext	\uc0\u8226 	}Has to categorise the parking facility under the predefined categories.\
{\listtext	\uc0\u8226 	}Uses a scanner to check for car details like -> the vehicle no.(for customer security), Hours parked, Total price. \
{\listtext	\uc0\u8226 	}Gets interface to receive payment of the parking.\
{\listtext	\uc0\u8226 	}Can check for daily collection, no. of vehicles in a day and their details.\
{\listtext	\uc0\u8226 	}But cant get the customer details except for the name and vehicle registration number under which it was booked for future reference.\
{\listtext	\uc0\u8226 	}At the gates at the time of entry automated gates for entrance and exit to check for the vehicle booking status. When scanned here the vehicle gets checked-in/ checked -out\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
Server Features:- \
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls3\ilvl0\cf0 {\listtext	\uc0\u8226 	}The parking spot to be categorised under outdoor/ indoor parking.\
{\listtext	\uc0\u8226 	}The parking charges to be decided at the end on the basis of hours parked.\
{\listtext	\uc0\u8226 	}When a User books a slot marks it as filled until checked out.\
{\listtext	\uc0\u8226 	}Calculates the total collection of a Parking lot and the total no.of vehicles it handled.(needs to be stored DB)\
{\listtext	\uc0\u8226 	}As Users register stores their and their vehicle details in the DB\
{\listtext	\uc0\u8226 	}Generates QR assigning to the event at the time of booking.(asks for the driver name to be shown and phone.)\
{\listtext	\uc0\u8226 	}Gives payment interface and billing interface after the payment is done.(for customer)\
{\listtext	\uc0\u8226 	}Similarly the Service provider gets the payment receiving interface.\
{\listtext	\uc0\u8226 	}Gives the Service provider and scanner interface to scan the QR and scanning that it retrieves the booking details.\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 \
Database Features :- \
\pard\tx220\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\li720\fi-720\pardirnatural\partightenfactor0
\ls4\ilvl0\cf0 {\listtext	\uc0\u8226 	}Stores the user id, password, and vehicle details.\
{\listtext	\uc0\u8226 	}upon booking stores the driver phone. And name, along with time of booking.. which parking lot and the parking slot no., hour of parking.\
{\listtext	\uc0\u8226 	}Stores the parking lot details and location( price, vacancy, location)-> changes everytime booked-> checkin increases and checkout decreases\
{\listtext	\uc0\u8226 	}stores the parking lot names and there location.\
}