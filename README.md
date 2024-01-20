## The Purpose of the Project❕

✔ The project aimed to conduct experimental analyses of given sorting algorithms and compare their results for further analysis. Experimentally, I analyzed the algorithms using arrays consisting of sorted, reverse-sorted, and randomly generated numbers. Additionally, I varied the sizes of arrays to observe the comparison in terms of 'n' and multiples of 'n'. I wrote the code in Java and utilized Python's libraries for visualization purposes. 

## Experimental Analysis❕

✔ Selection 

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.004	0.004	0.005
10K	0.091	0.033	0.104
100K	6.459	1.459	7.108
500K	162.433	38.648	178.442

✔ Insertion

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.006	0.0	0.006
10K	0.036	0.001	0.056
100K	1.205	0.004	2.338
500K	28.447	0.006	58.122

✔ Shell Sort

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.001	0.0	0.001
10K	0.008	0.006	0.005
100K	0.032	0.02	0.02
500K	0.123	0.021	0.035

✔ Merge Sort

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.002	0.002	0.001
10K	0.004	0.004	0.005
100K	0.047	0.038	0.03
500K	0.011	0.055	0.099

✔ 3-Way Merge

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.001	0.001	0.002
10K	0.005	0.003	0.003
100K	0.031	0.019	0.022
500K	0.093	0.065	0.055

✔ Lomuto Partitioning

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.001	0.013	0.01
10K	0.004	0.045	0.097
100K	0.032	0.019	0.019
500K	0.074	0.041	0.044

❗ I had to perform my operations with a random pivot due to stack overflow errors in both 100k and 500k 'sorted and reversed'.

✔ Hoare Partitioning

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.001	0.005	0.005
10K	0.006	0.057	0.059
100K	0.036	0.031	0.017
500K	0.107	0.044	0.045

❗ I had to perform my operations with a random pivot due to stack overflow errors in both 100k and 500k 'sorted and reversed'.

✔ Heap Sort

SIZE	RANDOM	SORTED	REVERSED
<hr>
1K	0.001	0.001	0.001
10K	0.005	0.005	0.005
100K	0.024	0.027	0.02
500K	0.124	0.063	0.069

<hr>

## Result and Discussion
❕ I conducted both theoretical and experimental analyses of 8 sorting algorithms employing different techniques in my assignment. I utilized sorted, reverse-sorted, and random arrays to observe their behaviors in various scenarios.
Through my analysis, I observed that my experimental and mathematical results supported each other and were similar.
# Best Case Scenario
❕ I observed that the best-case scenario is O(n) while the worst-case scenario is O(n2). The O(n) scenario arises when the input is nearly sorted or already sorted, as exhibited by the insertion sort. Due to the nature of insertion sort, it performs very few comparisons in a sorted array, resulting in the O(n) complexity (the comparison is executed only once on every iteration of the outer loop). I have also experimentally validated this outcome.
# Worst Case Scenario
❕ The worst-case scenario, as previously mentioned, is O(n2). Selection, insertion, shell, Lomuto, and Hoare have a complexity of O(n2) in their worst-case scenarios Selection sort operates by selecting the smallest element and placing it in its appropriate position, hence scanning through and placing all remaining elements in each step. Particularly, in a reversely sorted array, I observed it exhibits the worst-case scenario during experimental analysis. It consistently delivered the highest time complexity with every iteration in a reversed array. Insertion sort, on the other hand, demonstrates its worst-case complexity of O(n2) in a reversely sorted array. This is due to the necessity of scanning previous elements to determine the position of elements in the array. Shell sort also has a worst-case scenario of O(n2). Its principle relies on intermittently sorting elements, and this worst-case scenario is observable when starting with large intervals and dealing with a limited number of elements. Lomuto and Hoare, on the other hand, sort elements based on the selected pivots. However, with a poorly chosen pivot, the time complexity can escalate up to O(n2). Additionally, if our array is reversely sorted or already sorted, our partitioning steps might not be very efficient.
# Space Efficiency
❕ Merge and 3-way Merge have a space efficiency complexity of O(n). Other algorithms, on the other hand, have a complexity of O(1). The reason for O(n) is the creation and merging of new sub-arrays during sorting operations. While the time complexity of merge algorithms being O(nlog(n)) is an advantage, the drawback stems from their high memory usage.
<br>
# 1K Size Array
❕ The best performance for arrays containing 1K elements was achieved by the heapsort algorithm. This algorithm exhibited similar performance across random, sorted, and reversed arrays due to its consistent O(nlog(n)) complexity in all scenarios. However, in the case of a sorted array, alternative options like insertion sort and shell sort emerged as more suitable choices over heapsort. The absence of the need for swap or comparison operations in a sorted array is the reason behind favoring these algorithms.
When comparing the Merge sort and 3-way Merge algorithms, minimal differences in partitioning steps were observed, resulting in nearly identical performances for arrays containing 1K elements.
On the other hand, the Lomuto and Hoare partitioning algorithms demonstrated the worst performance for 1K-element sorted and reversed arrays due to pivot selection. Pivot selection appears to be a critical factor influencing the performance of these algorithms. This underscores the critical importance of pivot selection, showing how algorithms are sensitive to this choice based on the data's arrangement. We can prevent this by selecting the pivot randomly, however, for a small value like 1K, using other algorithms might be more sensible. Because Hoare and Lomuto are not highly preferred algorithms for smaller sizes.
If I have an almost sorted array of size 1K, I would sort it using insertion and shell sort. For a 1K reversed array, I might consider using heapsort, shell sort, merge, and 3-way. If I have a 1K random array, opting for Lomuto, Hoare, and heapsort would be a reasonable choice.
# 10K Size Array
❕ Merge, 3-way Merge, and heapsort gave me the best result for a 10K random array. I had already calculated their time complexities as O(nlog(n)), hence the array was sorted quickly. The reason for Lomuto also performing well is due to the pivot consistently dividing the array in half each time, given that it's a random array.
 Similarly, Hoare and Lomuto again demonstrated poor performance in both sorted and reversed arrays. Selection sort and insertion sort also provided the worst-case scenario in reversed arrays. The reason is that there are a lot of elements in the array, and the selection sort algorithm traverses the entire list. 
If I have a random array of size 10K, I would prefer Lomuto or heapsort. The reason I avoid Merge and 3-way Merge is because they are not in-place algorithms. If I have an almost sorted array of size 10K, my preference would be insertion sort. This way, I can sort my array with minimal comparisons. In the case of a reversed sorted array of size 10K, I would opt for heapsort due to its space efficiency. However, depending on the situation, I might also consider using Merge and 3-way Merge. For instance, if we have no concerns regarding memory, they can be quite valid algorithms.

# 100K Size Array
(Since I received a stack overflow error in Lomuto and Hoare for reversed and sorted arrays in a 100K array, I performed my operations by randomly selecting the pivot element in my Lomuto and Hoare algorithms in 100K)
❕ As the size increased to 100K, I gained a better understanding of the difference between O(n2) and O(nlogn) by working with a larger array. Due to the seconds' difference among sorting algorithms, I even had to take the y-axis as logarithmic in Figure 2.3. For a 100K random array, heapsort provided the best result, followed closely by shellsort, 3-way merge, merge, Lomuto, and Hoare. In the sorted array, as usual, insertion sort had by far the best time. In the reversed array, Hoare, merge, shell, and 3-way are good choices. Lomuto and Hoare also provided good results in the reversed array, but since the pivot was taken randomly, the results arrived in this manner. We had seen that they had the worst performance in sorted and reversed for 1K and 10K. 
If I have an almost sorted array of size 100K, I would use insertion sort. For a 100K reversed or sorted array, using heapsort and shellsort would be a more reasonable choice.
# 500K Size Array
(Since I received a stack overflow error in Lomuto and Hoare for reversed and sorted arrays in a 500K array, I performed my operations by randomly selecting the pivot element in my Lomuto and Hoare algorithms in 500K)
❕ My 500K and 100K datasets yielded similar results, as observed from the graph. There was only an increase in time based on dataset size. In sorted data, as with every size, insertion sort performed the best. For random data, Lomuto achieved the fastest sorting time, followed closely by 3-way merge, merge, Hoare, shell, and heapsort. Among the 500K reversed datasets, shellsort provided the best sorting results. Shellsort leverages fast sorting operations on small sublists, turning this into an advantage.
If I have a nearly sorted array of 500K, I would use insertion sort. For random arrays, I'd opt for Lomuto, and for reversed ones, I'd prefer shellsort.








