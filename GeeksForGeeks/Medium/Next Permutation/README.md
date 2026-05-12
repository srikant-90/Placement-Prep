# Next Permutation

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/next-permutation5226/1)

## Solved On
12 May 2026 at 10:46 pm

<h2><a href="https://www.geeksforgeeks.org/problems/next-permutation5226/1">Next Permutation</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given an array of integers <strong>arr[]</strong> representing a permutation, implement the&nbsp;<strong>next permutation</strong>&nbsp;that rearranges the numbers into the <strong>lexicographically next greater permutation</strong>. If no such permutation exists, rearrange the numbers into the <strong>lowest</strong> possible order (i.e., sorted in ascending order).&nbsp;</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong>&nbsp; A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [2, 4, 1, 7, 5, 0]
<strong>Output:</strong> [2, 4, 5, 0, 1, 7]
<strong>Explanation:</strong> The next permutation of the given array is [2, 4, 5, 0, 1, 7].</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [3, 2, 1]
<strong>Output:</strong> [1, 2, 3]
<strong>Explanation:</strong> As arr[] is the last permutation, the next permutation is the lowest one.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [3, 4, 2, 5, 1]
<strong>Output:</strong> [3, 4, 5, 1, 2]
<strong>Explanation:</strong> The next permutation of the given array is [3, 4, 5, 1, 2].</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5<br></sup>0 ≤ arr[i] ≤ 10<sup>5</sup></span></p>