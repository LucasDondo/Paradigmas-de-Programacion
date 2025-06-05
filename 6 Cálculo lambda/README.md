# 6 Cálculo lambda

## 1

Escribir las siguientes expresiones con el menor número de paréntesis posible:

### 1.1

```
(λx.(λy.(λz.((x z) (y z)))))
λx.(λy.(λz.((x z) (y z))))
λxyz.x z (y z)
```

### 1.2

```
(((a b) (c d)) ((e f) (g h)))
((a b) (c d)) ((e f) (g h))
(a b) (c d) ((e f) (g h))
a b (c d) ((e f) (g h))
a b (c d) (e f (g h))
```

### 1.3

```
(λx.((λy.(y x)) (λv.v) z) u) (λw.w)
(λx.((λy.(y x)) (λv.v) z) u) λw.w
(λx.(λy.(y x)) (λv.v) z u) λw.w
(λx.(λy.y x) (λv.v) z u) λw.w
```

## 3

Para las siguientes expresiones lambda: identificar las ocurrencias de variables libres y ligadas; reducir a su forma normal aplicando las reglas alfa, beta y eta, usando orden normal y aplicativo, y comparar los resultados.

### 3.1

```
Using normal order:
(λx.(λy.y) x) z
(λy.y) z        Beta.
z               Beta.

Using aplicative order:
(λx.((λy.y) x)) z
(λx.x) z          Beta
z                 Beta
```

### 3.2

```
Using normal order:
(λxy.x y) (z y)
(λxw.x w) (z y) Alpha.
λw.z y w        Beta.
z y             Etha.

Using aplicative order:
(λxy.x y) (z y)
(λxw.x w) (z y) Alpha.
λw.z y w        Beta.
z y             Etha.
```

### 3.3

```
Using normal order:
(λxy.x) x y
(λy.x) y    Beta.
x           Beta.

Using aplicative order:
(λxy.x) x y
(λy.x) y    Beta.
x           Beta.
```

### 3.4

```
Using normal order:
(λx.((λz.z x) (λx.x))) y
(λz.z y) λx.x            Beta.
(λx.x) y                 Beta.
y                        Beta.


Using aplicative order:
(λx.((λz.z x) (λx.x))) y
(λx.(λx.x) x) y          Beta.
(λx.x) y                 Beta.
y                        Beta.
```

### 3.5

```
Using normal order:
(λx.(λy.x y) z) (λx.x y)
(λy.(λx.x y) y) z        Beta
(λx.x y) z               Beta
z y                      Beta

Using aplicative order:
(λx.(λy.x y) z) (λx.x y)
(λx.x z) (λx.x y)        Beta.
(λx.x y) z               Beta.
z y                      Beta.
```

### 3.6

```
Using normal order:
(λy.(λx.((λxy.x) x)) y) w z
(λx.((λxy.x) x)) w z        # Beta.
(λxy.x) w z                 # Beta.
w                           # Beta.

Using aplicative order:
(λy.(λx.((λxy.x) x)) y) w z
(λy.(λx.x) y) w z           Beta.
(λy.y) w z                  Beta.
w                           Beta.
```

### 3.7

```
Using normal order:
(λxyx.x y z) (λxy.y) a b
(λyx.x y z) a b          Beta.
(λx.x a z) b             Beta.
b a z                    Beta.

Using aplicative order:
(λxyx.x y z) (λxy.y) a b
(λyx.x y z) a b          Beta.
b a z                    Beta.
```

### 3.8

```
Using normal order:
(λx.(λyz.z) x) ((λx.x x x) λx.x x x) x
(λyz.z) ((λx.x x x) λx.x x x) x        Beta.
(λz.z) x                               Beta.
x                                      Beta.

Using aplicative order:
(λx.(λyz.z) x) ((λx.x x x) λx.x x x) x
(λxz.z) ((λx.x x x) λx.x x x) x              Beta.
(λxz.z) ((λx.x x x) (λx.x x x) (λx.x x x)) x Beta.
We can already see the infinite loop we're about to fall into.
```
