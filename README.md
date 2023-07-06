## Introduction and purpose
This project is developed for Java101 course on <a href="https://patika.dev">patika.dev</a>. Aim of the project is print inverse triangle to screen with ```*``` symbols.

## Algorithm
Task is achieved by three loops. First loop is the most outer loop, used to construct horizontal lines. And two others are used to construct shape of triangle and they are inner loops.<br/>
Assume that user enter value as 5. (Consider this number as ```numberOfHorizontalLines```) Outest loop  loops ```i``` times. Number of stars can be calculated as:
```((2 * i) - 1)```. It means that, inner second loops upper limit set to ```((2 * i) - 1)``` and ```*``` character is print inside this loop.<br/>
To print spaces correctly, first inner loop's upper limit must be dependent with ```i```. So relevant loop repeats ```numberOfHorizontalLines - i``` times and spaces are printed in this loop.

