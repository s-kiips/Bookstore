# Bookstore Application
Sudin's Bookstore application is based on Java, Thymeleaf, Mysql, JPA in which user can look out and buy those books if they want. 

Based on Spring Boot and secured with Spring Security.

For mailing part Javax.mail of Java is used

Basically there are two modules in this project:
1) Client Portal

Client Portal is where user can look out list of books and can place an order if they want.

Client(User) can search book by names or type of book.

User can make account and only after making an account user can place an order otherwise they can only search.

User can get detail of every books.

User must give their card(VISA,MASTERCARD) details which will not be disclosed to anyone.

User can retrieve Password if they forget their current one, an email will be sent to the registered email by the system automatically.

User-friendly UI, location and contact info are given for ease and support.

2) Admin Portal

In the Admin Portal there is one super user who can add, update and delete the list of books.

Whatever the Admin does is directly reflected on the User Portal.

Admin handles all the picture and description of the books.


#Important Notes:

To run this project both modules must be started in any order.

Need Mysql for Database. XAMPP or Mysql workbench.

Make database name as "bookstoredatabase" case sensitive.

For super admin there will be one user already set at the runtime and will be saved in database.

One User will also be there when the project starts.

Check the Main file of both modules for more details.

User will get email as new user to the registered email. If not available in the inbox check for spam section of email.

User will also get emails for order confirmation with all the details.





 



