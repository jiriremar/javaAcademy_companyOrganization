# Company Organization Structure

## Task Description
Create a system that models a company's organizational structure. The goal is to practice object composition by creating a hierarchical structure representing a company's organization.

## System Structure
The company structure should have following hierarchy:
- Company (top level)
- Department
- Team
- Employee (basic unit)

## Core Requirements
1. Model each level of the hierarchy as a separate class
2. Use appropriate properties to establish relationships between levels
3. Create methods to display information about each level
4. Use ArrayList to store collections of objects
5. Follow proper encapsulation principles

## Example Output
```
=== TechCorp Inc. ===
CEO: John Smith

Department: Software Development
Department Head: Alice Johnson
  Team: Backend Development
  Team Leader: Bob Wilson
  Members:
    - Carol Brown (Developer)
    - Dave Miller (Developer)
    
  Team: Frontend Development
  Team Leader: Eve Davis
  Members:
    - Frank White (Developer)
    - Grace Lee (Designer)
```

## Bonus Tasks (Optional)
1. Add salary tracking and total salary calculation for each level
2. Add method to find an employee in the company
3. Add basic validation

## Tips
- Start with the Employee class and build up
- Test each level of the hierarchy separately
- Think about what properties and methods make sense at each level
- Consider how objects at each level relate to each other

---
---
---
---
---
### Employee (basic unit) - zamestnanec
- Properties
  - name of employee
  - specialization (Designer, Developer)
- Method
  - Constructor to initialize all properties
  - Method to print Employee information  

### Team - tym
- Properties
  - name of team ( java frontend, java backend )
  - list employee 
  - name of team leader 
- Method
  - Constructor to initialize team
  - Method add a employee
  - Method add a teamleader
  - Method to print Team information

### Department - oddeleni
- Properties
  - name of department ( Java, Python, Php)
  - list team
  - name of department leader
- Method
  - Constructor to initialize department
  - Method add team
  - Method print Department information

### Company - spolecnost
- Properties  
  - name of company
  - list departments 
  - mame of company leader
- Method
  - Constructor to initialize company 
  - Method add Departments
  - Method to print entire company structure