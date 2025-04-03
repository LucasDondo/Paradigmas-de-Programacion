# 1 Figuras

```Java
public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(3));       // Un círculo de radio 3.
        figuras.add(new Cuadrado(5));      // Un cuadrado de lado 5.
        figuras.add(new Rectangulo(2, 4)); // Un rectángulo de 2x4.
        System.out.println("El área total es: %f", (areaTotal(figuras)));
    }

    private static double areaTotal(List<Figura> figuras) {
        double total = 0;
        for (Figura f : figuras) {
            total += f.area();
        }
        return total;
    }
}
```

## 1 ¿`Figura` debe ser una clase, una clase abstracta o una interfaz?

`Figura` no debe ser una clase no abstracta, pues no tendría sentido instanciar `Figura` sin saber de qué tipo de figura estamos hablando.

`Figura` podría ser tanto una interfaz como una clase abstracta. Ahora bien, yo prefiero interfaz, pues no veo sentido que contenga implementaciones universales de métodos para que hereden todas sus subclases (como podría ocurrir si fuese una clase/clase abstracta).

## 2 ¿Dónde hay comportamiento polimórfico? ¿De qué tipo es?

Hay comportamiento polimórfico por herencia en las clases que implementan la interfaz `Figura`.

## 3 Dibujar el diagrama de clases

```plantuml

interface Figura {
    area() : double
}

class Círculo
class Rectángulo
class Cuadrado

Figura <|.. Círculo
Figura <|.. Rectángulo
Rectángulo <|-- Cuadrado

```
