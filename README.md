# Jets Project
 
# Description
"Jets" comes with a pre-built fleet of 5 aircraft with the options to see a current list of the aircraft, launch all aircraft, review the fastest jet and the jet with the longest range, deploy support sorties, strike sorties, acquire additional aircraft and send aircraft to the boneyard.   
# Technologies Used
Java
Eclipse
Git
ZSH

# What I learned
 The DRY principle drives really good, questions of "how do I...". After creating the method for populating the array list with each aircraft other methods required the data it produced. After invoking the array list populating method for the second time, I searched for a way to not repeat myself which led to invoking the method main to ensure the aircraft list was only populated once and be accessible by all the dependent methods.
 
Stick with answering the first level question of "why" until it's solved. My "Acquire new aircraft"  menu entered into an infinite loop where the type would never be set. I made an incorrect assumption of "why" and coded around the loop so that it would work. My workaround made me return to the base-level question of why my code was infinite loop when I thought it should work which revealed the while loop was set to never en because I reset the condition for it to run within its own block. My first assumptions of how to write the code were correct but working to late on the project the night prior contributed to the error. 
 
Interfaces: Initially the program used interfaces that the abstract class "Jet" implemented which were then passed down to all of the concrete object classes. One of the interfaces was "Stealthy" which did not apply to all of theses classes. After removing "Stealthy" from the abstract class, "Bomber" was set to be the only concrete class inheriting it. Jet threw an error when trying to invoke "Stealthy" which was resolved by invoking "Stealthy" when the appropriate, universally shared interface "StrikeSortie" was called. From there, the interfaces were refactored to be more specific to each aircraft. All aircraft fly sorties but not all aircraft fly both an attack and support sorties. The Jet class was reset to implement only the "LaunchSortie" interface which excepted an argument of true and false. If true, the attack sorties will execute (and the Bomber class will use its "Stealthy"" interface). If false, only the support sorties will launch. The fighter class has a role to play in both sortie types. Refactoring the interfaces like this was much more in line with how they are meant to be used and really cemented my understanding of them and customization of determing what the abstract classes interface means to each of the concrete classes.

Removing an object from the ArrayList: The initial attempt to remove an object from the ArrayList utilized a for-loop, the ".remove()" method and then "break" which caused an error due to iteration becoming unspecified when an element is removed while iteration is in progress. After an online search, removing elements using an Iterator loop was discovered to be the solution since it is the only method that will circumvent the error. 



