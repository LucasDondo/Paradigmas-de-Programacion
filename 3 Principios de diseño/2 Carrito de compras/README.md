# 2 Carrito de compras

Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```Java
public class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.getItems().add(item);
    }
}
```

---

- [ ] KISS
- [ ] EDP
- [ ] KOP
- [ ] PoLA
- [ ] PoLC
- [x] **PoLK**: pues en `carrito.getItems().add(item)` se aplica un método al objeto retornado por otro método. Un diseño alternativo sería agregando el método `add(Item item)` a `CarritoDeCompras`. También se viola por el hecho de que el método público `getItems` devuelva un atributo privado (`items`).
- [ ] YAGNI
- [ ] SoC
- [ ] DRY
- [ ] TDA
- [ ] SOLID
- - [ ] SRP
- - [ ] OCP
- - [ ] LSP
- - [ ] ISP
- - [ ] DIP
