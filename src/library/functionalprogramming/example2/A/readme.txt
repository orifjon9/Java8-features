Suppose we sort using the sort method in the EmployeeInfo class together with the NameComparator.
Look at the compare method in the NameComparator: If two Employee objects have the same name, what is the return value of compare?
This tells us that these Employee objects should be equal, but is this always true?
Give an example of two Employee objects having the same name but that should not be considered equal.
Rewrite the compare method so that, if compare does return 0, the Employee objects are indeed equal.
(This issue is known as consistency with equals.)