
# Libraries
use of google-gson


# Problems and solutions
## Data layer

Main problem : data classes are intrisically depend on SQL
softarch.portal.data.* constructs SQL queries (ex: Book)
    -> our implementation in json uses reflection to store data
    -> the sql implementation should do the same
    -> abstract the notion of a database in an interface Database
    -> abstract the operations on Raw/Regular/User databases in interfaces
    -> define the way to store data in JSON/SQL abstract classes
    -> define Raw/Regular/User JSON/SQL databases that inherits and implements those above
    -> choose the method of storage using dsn in servlet configuration and a database factory
    -> to define a new method of storage : create an abstract class that define the way to store data, create three concrete class that inherit it and implements Raw/Regular/User and modify add method to the database factory to parse the new dsn.

We had to change to modify the facades constructor to take the dsn into account during the database construction. That is the only modification of other layers we did.

softarch.portal.data.* constructs XML (ex: Book)
    -> the UI layer should do it

softarch.portal.data.* is instantiable using a Servlet Request (ex: Book)
    -> the UI layer should deconstruct the request and instantiate with parameters directly

softarch.portal.data.* is instantiable using a SQL ResultSet (ex: Book)
    -> the database layer shoud deconstruct result sets and instantiate with parameters

softarch.portal.data.* returns http routes (ex: Administrator)
    -> the UI layer should construct the routes

softarch.portal.data regular data types could reuse some code (ex: the author attribute)

softarch.portal.data : some types do not have accessors (ex: Book)


## Application layer
The application layer does nothing except handling the session and that's very good like that

## UI layer
AdministrationPage handles query but the Application Layer should do it
InternetFrontPage handles a DatabaseException but the Application Layer should do it
Same with other pages that handle query
RegistrationPage handles the creation of different types of user but should defer it to the application layer (which could use a factory pattern for exp)
QueryPage, OperationPage, LogoutPage, LoginPage ok -> defers to application layer