# Jets Project
 
# Description

# Technologies Used
Java
Eclipse
Git
ZSH
# Approaching and Shaping The Jets Project

# What I learned
 The DRY principle drives really good, questions of "how do I...". After creating the method for populating the array list with each aircraft other methods required the data it produced. After invoking the array list populating method for the second time, I searched for a way to not repeat myself which led to invoking the method main to ensure the aircraft list was only populated once and be accessible by all the dependent methods.
 
 Stick with answering the first level question of "why" until it's solved. My "Acquire new aircraft"  menu entered into an infinite loop where the type would never be set. I made an incorrect assumption of "why" and coded around the loop so that it would work. My workaround made me return to the base-level question of why my code was infinite loop when I thought it should work which revealed the while loop was set to never en because I reset the condition for it to run within its own block. My first assumptions of how to write the code were correct but working to late on the project the night prior contributed to the error. 
 
  
