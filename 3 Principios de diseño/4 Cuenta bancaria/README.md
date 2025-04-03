# 4 Cuenta bancaria

Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```Java
public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        saldo -= cantidad;
    }

    public int obtenerSaldo() {
        return saldo;
    }
}

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        if (cuenta.obtenerSaldo() >= cantidad) {
            cuenta.retirar(cantidad);
            System.out.println(cantidad + " retirados exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
```

---

- [ ] KISS
- [ ] DRY
- [ ] YAGNI
- [ ] PoLK
- [ ] PoLC
- [x] **PoLA**: `retirar` retira dinero incluso cuando éste es insuficiente. Debería tener un verificador previo.
- [ ] KOP
- [ ] EDP
- [x] **TDA**: de alguna manera, se podría decir que `CajeroAutomatico` _pregunta_ a `cuenta` si tiene dinero suficiente para retirar `cantidad`, en lugar de simplemente pedirle que retire. Se resuelve eliminando el verificador previo, y en tal caso agregando un verificador posterior que chequee que `retirar` no devolvió algún error.
- [ ] SoC
- [ ] SOLID
- - [ ] SRP
- - [ ] OCP
- - [ ] LSP
- - [ ] ISP
- - [ ] DIP
