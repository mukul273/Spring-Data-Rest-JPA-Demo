Simple tutorial to use Spring JPA Data Rest

1. Create the project with web, devtools, jpa, h2(in memory database) etc,

2. Create a controller with endpoints

4. Create a repository to get data from database

5. Create model components,

6. Repository class should have business method to fetch the data from database. This method is implicitely converted into select query by JPA since we have repository returning the entity class(model class POJO) which is representing the database table row,

7. Load the data like using the Postmapping method we have defined,

8. Use {"name": "MrsChimp", "Salary": "5000"} to post the data. 