# 3 Cubo

Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```Java
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

public class Cuboide extends Rectangulo {
    private int profundidad;

    public Cuboid(int ancho, int alto, int profundidad) {
        super(ancho, alto);
        this.profundidad = profundidad;
    }

    public int getVolumen() {
        return ancho * alto * profundidad;
    }
}
```

---

- [ ] KISS
- [ ] EDP
- [ ] KOP
- [ ] YAGNI
- [ ] TDA
- [ ] SoC
- [x] **PoLA**: `Cuboide` no puede ser inicializado pues en el intento de crear su método constructor, le pusieron de nombre `Cuboid` en vez de `Cuboide`. Se arregla cambiando ese nombre.
- [ ] PoLC
- [ ] PoLK
- [x] **DRY**: en `getVolumen` se hace `ancho * alto`, multiplicación que puede ser reemplazada por `getArea`.
- [ ] SOLID
- - [ ] SRP
- - [ ] OCP
- - [ ] LSP
- - [ ] ISP
- - [ ] DIP
