palindrome([]).
palindrome([_]).
palindrome([A, A]).
palindrome([A | Z]) :- append(M, [A], Z), palindrome(M).