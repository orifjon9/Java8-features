Employee class override own equals(Object o) function, it works correct but
function of removeDuplicates did not remove duplicates because
function uses HashMap for checking data, but for checking used containsKey() function,
this function is base and checked hashcode data every object.

I implemented hachCode() method in Employee