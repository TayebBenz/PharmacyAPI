# PharmacyAPI
A simple Pharmacy API that is gonna be upgraded overtime with security and more features


Simple REST API for Medicine Management
This is a simple REST API designed for managing medicines in a small website. The API provides basic functionalities such as adding, retrieving, and searching for medicines.


Endpoints


1. Find Medicine by ID
Endpoint: /medicine/id/{id}
Method: GET
Description: Retrieves a medicine by its unique ID.
Parameters:
id: The ID of the medicine to retrieve.


Example:


Copy code
GET /medicine/id/123



3. Find Medicine by Name
Endpoint: /medicine/name/{name}
Method: GET
Description: Retrieves a medicine by its name.
Parameters:
name: The name of the medicine to retrieve.


Example:


Copy code
GET /medicine/name/Paracetamol




5. Add Medicine
Endpoint: /medicine/add
Method: POST
Description: Adds a new medicine.
Request Body: Medicine object.


Example:


Copy code
POST /medicine/add


{

  "name": "Ibuprofen",
  
  "medicineBase": "Houda's existence",
  
  "medicineManufacturer": "Generic Pharma",  
  
  "description": "The life juice that brought us all to life the essence of life itself.",
  
  "sideEffects": "None"
  
}





6. Get All Medicines
Endpoint: /medicines
Method: GET
Description: Retrieves all medicines.


Example:


Copy code
GET /medicines




8. Search for Medicines
Endpoint: /medicine/search
Method: GET
Description: Searches for medicines based on given parameters.
Request Body: Medicine object (fields to search for) you don't have to include other fields and they are going to be ignored when searching.


Example:


Copy code
POST /medicine/search

{

  "name": "Ibuprofen",
  
  "manufacturer": "Generic Pharma"
  
}
