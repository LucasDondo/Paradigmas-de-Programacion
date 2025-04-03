# 1 Auto

Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```Java
public class Auto {
    private boolean moviendo;

    public void mover() {
        moviendo = !moviendo;
    }

    public boolean enMovimiento() {
        return moviendo;
    }
}
```

---

- [ ] TDA: Tell, Don't Ask!
- [x] **PoLA: Principle of Least Astonishment**: pues al supuestamente mover el auto, en realidad cambia el estado del movimiento. Es decir, si se estaba moviendo, lo frena, contrario a lo que uno esperaría del método `mover`. Para resolver esto, propondría tener una función `start` y una `stop`.
- [ ] PoLC: Principle of Least Commitment
- [ ] PoLK: Principle of Least Knowledge
- [ ] KISS: Keep It Simple, Stupid!
- [ ] YAGNI: You Ain't Gonna Need It
- [ ] KOP: Knuth's Optimization Principle
- [ ] DRY: Don't Repeat Yourself
- [x] **EDP: Explicit Dependency Principle**: mentira, esta la seleccioné pero estaba mal. No se considera al objeto `moviendo` como una dependencia implícita se ve. Supongo que por el hecho de que es un atributo de la clase.
- [ ] SoC: Separation of Concerns Principle
- [ ] SOLID
- - [ ] SRP: Single Responsibility Principle
- - [ ] OCP: Open/Close Principle
- - [ ] LSP: Liskov Substitution Principle
- - [ ] ISP: Interface Segregation Principle
- - [ ] DIP: Dependency Inversion Principle
