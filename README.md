# Read Me
This is spring boot application and, it is a maven project.
# Spring boot project
How to install the application
TODO

#### Overview - Portfolio
User | Fund \
Abc  | Sbi Mutual Fund


# APi Documentation
## Operations by rest calls
### Portfolio
#### List Portfolios
    curl localhost:8080/rest/portfolio
#### Add Portfolio
    curl -X POST localhost:8080/rest/add/portfolio -H "Accept: application/json" -H 'Content-type:application/json' -d '{"username":"abc"}'   
#### List Portfolio
#### Delete Portfolio by ID

### Fund
#### List Funds
    curl localhost:8080/rest/fund
#### Add Fund
    curl -X POST localhost:8080/rest/add/fund -H "Accept: application/json" -H 'Content-type:application/json' -d '{"fundName":"SBI", "fundType":"MutualFund"}'
#### Delete Fund by ID
     
### Person
#### List Persons
    curl localhost:8080/rest/persons
#### Add Person
    curl -X POST localhost:8080/rest/add -H "Accept: application/json" -H 'Content-type:application/json' -d '{"firstName":"abc","lastName":"bbc"}'
#### Delete Person by ID
    curl -X DELETE localhost:8080/rest/delete/1
### Investor
#### Add Investor
#### List Investor
#### Delete Investor by ID