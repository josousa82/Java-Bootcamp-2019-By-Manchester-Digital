## O — Open/closed principle
* Classes we create should only be open to be extended, 
but not available for modification. In doing so we stop 
ourselves from modifying existing code and causing potential 
bugs (in an application that may run happily).

* Because we can not guarantee the class Phone is not being used 
by other classes, best way is to 