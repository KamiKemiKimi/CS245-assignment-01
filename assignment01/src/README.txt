Part 1 and Part 2 Graphs:

https://docs.google.com/document/d/1pOWdnWUrboLunHcGK0GrCS3wpEM8qYbPWeRT6UIoucE/edit?usp=sharing


For Part 2:
My choice of sorting algorithm was selection sort (O(n^2)) and
I created a hybrid of that algorithm with randomized quick sort.
The size of array that I chose was 5000 random double entries in 
an array as similar to Part 1 for continuity. I chose selection
sort due to its runtime of (O(n^2)).
To determine my threshold array length, I decided to test out
different array sizes from part 1. I concluded that my "choice
point" was around an average of 80-100 as the values started to
intersect from both the quick sort graph and the selection sort graph. 
This had to be in nanoseconds in order to record a more precise runtime.
	See Part 2 Graph on Google Doc.
From what I can conclude it is possible for selection sort 
to have a faster runtime than quick sort when the array size is small
(around 100 entries); however quick sort eventually becomes 
the better sorting algorithm for larger arrays (in the thousands) by 
having a significantly faster runtime.



