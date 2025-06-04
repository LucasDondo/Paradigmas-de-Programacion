trenDirecto(saarbruecken,dudweiler).
trenDirecto(forbach,saarbruecken).
trenDirecto(freyming,forbach).
trenDirecto(stAvold,freyming).
trenDirecto(fahlquemont,stAvold).
trenDirecto(metz,fahlquemont).
trenDirecto(nancy,metz).

trenDirecto(A, A).
viajar(A, C) :-
                trenDirecto(A, B),
                trenDirecto(B, C).

% Use `?- once(viajar(A, C)).` to get a single path.