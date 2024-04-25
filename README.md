Some Intro

In Sandship, the warehouse is a place where players can store their materials. It’s like an inventory. Players can have multiple warehouses, and each warehouse has a list of materials and their quantities.
Each material in the warehouse is of a certain material type, for example - iron, copper, bolt and so on. Each material type has some information about it like name, description, icon (all strings). Additionally, the material type knows its max capacity. (How much of that material can be ever held in a single warehouse as a max cap).
Materials can be added to the warehouse, or removed from it. Materials can also be moved from one warehouse to another as one transaction. Note that due to max material caps, moving a material can be either partial or fail altogether. So it needs a method that gets a warehouse reference to move items from (or to).

Task:

Make classes and methods to handle this logic in terms of data. 
Come up with an ideal set of data structures for this task. 
Make a list of proper API methods in order to work with this data.Warehouse class should be intuitive and easy to use by another engineer.
Have some ways of outputting current warehouse data so you can debug and test your results. Just a text output is fine.
Make sure your lookup operations are fast and optimal. How costly is it to add or remove a material or query warehouse to know how much you have for each? Imagine this operation happening 100 times per second per material, is your code leaking memory or making GC crunch? Make sure things are optimal. 


