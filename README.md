
 Quequery Parameters  (URL?key=val&key=val)
  This concept is supported by web and web related (webservices) applications
  It is used to send data from Consumer(client) app to Producer(server)
  application.

=> It is used to send data in key=val format
=> Both key and values are String type
=> We can send multiple keys in any order
   by using Symbols: ? , &
=> To read this data in RestWebservices Syntax is:
     @QueryParam("key")DataType localVariable


Write the producer with RESTcontroller appliocation as it is NO need of Consumer Application ,i have written ,and run on server after open the browser and
give this uri in your search bar :-http://localhost:8080/jerseyProducerAppMultiController/satya/gst?base=5000&gstp=5 you can give ypur parameter 
