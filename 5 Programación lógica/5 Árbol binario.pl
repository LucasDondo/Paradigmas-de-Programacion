mirrored(leaf(A), leaf(A)).
mirrored(tree(L, R), tree(ML, MR)) :- mirrored(R, ML), mirrored(L, MR).

% ?- mirrored(tree(tree(leaf(1), leaf(2)), leaf(4)), T).