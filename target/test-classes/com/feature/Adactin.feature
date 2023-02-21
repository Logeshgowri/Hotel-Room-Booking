Feature: Hotel Room booking

Scenario: login to the homepage
Given :Going to Url
When :Have to enter username
And :going to enter password
Then :after enter confirm, it has to enter to next page

Scenario: Going to bookHotel
Given :search hotel page is lauched
When :going to choose location
And :going to select hotel
And :going to room type
And :going to select number of rooms
And :choose checkIn date
And :choose CheckOut date
And :Going to No of Adults
And :Going to select No of Child
Then :after click search, it has to go to next page

Scenario: going to SelectHotel
Given :going to the Selecthotel page
When :going to select booked hotel
Then : after continue, it have to go to paymentpage

Scenario: going to bookHotel
Given :went to the bookHotel Page
When :enter the firstname
And :enter the lastname
And :enter the Billing Address 
And :Enter the Card Number
And :Enter the card Type
And :Enter the card ExpireMonth
And :Enter the card ExpireYear
And :Enter the Cvv Number
Then :click the Booknow Enter to the next page

Scenario: going to check my order
Given :going to select my ltinerary
When :click book Itinerary
Then :It has to display the booked order details
