translation(eins, one).
translation(zwei, two).
translation(drei, three).
translation(vier, four).
translation(fuenf, five).
translation(sechs, six).
translation(sieben, seven).
translation(acht, eight).
translation(neun, nine).

translateList([], []).
translateList([O|Os], [T|Ts]) :- translation(O, T), translateList(Os, Ts).