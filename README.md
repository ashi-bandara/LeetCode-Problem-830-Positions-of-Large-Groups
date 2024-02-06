
# LeetCode Challenge D46
## Achievements
[![image.png](https://i.postimg.cc/Prcv0qxX/image.png)](https://postimg.cc/XpfvC4dm)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [830. Positions of Large Groups](https://leetcode.com/problems/positions-of-large-groups/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
In a string  `s` of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like  `s = "abbxxxxzyy"`  has the groups  `"a"`,  `"bb"`,  `"xxxx"`,  `"z"`, and `"yy"`.

A group is identified by an interval `[start, end]`, where `start` and `end` denote the start and end indices (inclusive) of the group. In the above example, `"xxxx"` has the interval `[3,6]`.
A group is considered **large** if it has 3 or more characters.

Return _the intervals of every  **large**  group sorted in **increasing order by start index**_.

**Example**
>**Input:** s = "abbxxxxzzy"
>
>**Output:** [[3,6]]
>
>**Explanation:** `"xxxx" is the only` large group with start index 3 and end index 6.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The algorithm begins by iterating through the provided lowercase string, character by character. At each step, the algorithm examines the current character and checks whether it is identical to its two consecutive neighbors. This is crucial for identifying potential groups of three or more consecutive identical characters.

When the algorithm identifies such a group, it records the starting index of the group. To accurately determine the end index of the group, the algorithm dynamically iterates through the consecutive characters following the starting index until a different character is encountered. This iterative process ensures that the algorithm precisely identifies the interval encompassing the entire large group of consecutive identical characters.

Once the algorithm has successfully identified and recorded the intervals for all the large groups in the string, it organizes this information into a list. This list contains sublists, where each sublist represents the start and end indices of a large group. Finally, this list of intervals is returned as the output, providing a comprehensive representation of the consecutive character groups in the given string.
