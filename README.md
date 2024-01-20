## The Purpose of the Project❕

✔ The project aimed to conduct experimental analyses of given sorting algorithms and compare their results for further analysis. Experimentally, I analyzed the algorithms using arrays consisting of sorted, reverse-sorted, and randomly generated numbers. Additionally, I varied the sizes of arrays to observe the comparison in terms of 'n' and multiples of 'n'. I wrote the code in Java and utilized Python's libraries for visualization purposes. 

## Experimental Analysis❕

✔ Selection 

SIZE	RANDOM	SORTED	REVERSED
1K	0.004	0.004	0.005
10K	0.091	0.033	0.104
100K	6.459	1.459	7.108
500K	162.433	38.648	178.442

✔ Insertion

SIZE	RANDOM	SORTED	REVERSED
1K	0.006	0.0	0.006
10K	0.036	0.001	0.056
100K	1.205	0.004	2.338
500K	28.447	0.006	58.122

✔ Shell Sort

SIZE	RANDOM	SORTED	REVERSED
1K	0.001	0.0	0.001
10K	0.008	0.006	0.005
100K	0.032	0.02	0.02
500K	0.123	0.021	0.035

✔ Merge Sort

SIZE	RANDOM	SORTED	REVERSED
1K	0.002	0.002	0.001
10K	0.004	0.004	0.005
100K	0.047	0.038	0.03
500K	0.011	0.055	0.099

✔ 3-Way Merge

SIZE	RANDOM	SORTED	REVERSED
1K	0.001	0.001	0.002
10K	0.005	0.003	0.003
100K	0.031	0.019	0.022
500K	0.093	0.065	0.055

✔ Lomuto Partitioning

SIZE	RANDOM	SORTED	REVERSED
1K	0.001	0.013	0.01
10K	0.004	0.045	0.097
100K	0.032	0.019	0.019
500K	0.074	0.041	0.044

❗ I had to perform my operations with a random pivot due to stack overflow errors in both 100k and 500k 'sorted and reversed'.

✔ Hoare Partitioning

SIZE	RANDOM	SORTED	REVERSED
1K	0.001	0.005	0.005
10K	0.006	0.057	0.059
100K	0.036	0.031	0.017
500K	0.107	0.044	0.045

❗ I had to perform my operations with a random pivot due to stack overflow errors in both 100k and 500k 'sorted and reversed'.

✔ Heap Sort

SIZE	RANDOM	SORTED	REVERSED
1K	0.001	0.001	0.001
10K	0.005	0.005	0.005
100K	0.024	0.027	0.02
500K	0.124	0.063	0.069

<hr>





