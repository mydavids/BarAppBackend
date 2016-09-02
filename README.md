# Club/Bar System Domain Model

# Introduction

Clubs and bars often have a fast paced environment, especially when it comes to sales aspect of the clubs
or bars. Any club that wants to increase it's quality and speed of customer service would need a efficient and
logical inventory and sales system.  

# Class Diagram of the Domain Model

![alt tag](https://github.com/mydavids/barsystem/blob/master/barsystemUML.png)

# Description of the Domain Model and its Invariants

According to the Domain Model, each managers waiters at least one waiter. Waiters and managers both have
contact details. Managers are allowed to add new waiters to the system and update existing ones, a waiter
does not have this ability. The administrator is the only one that can add and remove managers and 
waiters. 

Each waiter is assigned to at least one table, and each table has zero to many orders.
Orders are made up by stock and this is displayed in the Domain Model with a join table.

Orders can only be placed by waiters and must be voided by a manager if an error was made. 
A manager is the only person that can add, update and remove products from stock. They also have the ability
to change the amount of stock that is currently available. 

# Proof of Approval

![alt tag](https://github.com/mydavids/barsystem/blob/master/proof.png)
