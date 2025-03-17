# 1 FIUBA

## Enunciado

Diseñar e implementar un sistema que permita contabilizar las materias aprobadas de un plan de estudios de FIUBA.

Cada materia de FIUBA tiene un código, un nombre y una cantidad de créditos, y puede ser obligatoria u optativa.

Una carrera está compuesta por un listado de materias (que pueden ser obligatorias u optativas), y una cantidad mínima de créditos. Para terminar la carrera hay que aprobar todas las materias obligatorias y además cumplir la cantidad de créditos.

El sistema ofrece sus servicios a múltiples usuarios. Cada usuario puede cursar cero, una o más carreras. El sistema debe permitir al usuario inscribirse a una carrera, marcar materias como aprobadas y consultar el estado de cada una de sus carreras.

## UML

```plantuml
@StartUML

class Faculty {
    createDegree() : void
    signInOrUp() : int
}

class Student {
    id : int

    enrollToDegree() : void
    markCourseAsApproved() : void
}

class Degree {
    id : String
    name : String
    minOptionalCredits : Int
}

class Course {
    id : String
    name : String
    credits : Int
    obligatory : Bool
}

Faculty *--> "*" Student
Faculty *--> "*" Degree
Student o--> "*" Degree
Student o--> "*" Course : approved
Degree  o--> "*" Course

@EndUML
```

## Visibles mejoras a futuro

- [ ] La unión entre un curso y una carrera debería ser de composición cuando esa es la única carrera que tiene ese curso, y de agregación cuando más de una carrera tiene ese curso.
- [ ] Hacer que las entradas del usuario se muestren en la misma línea que la pregunta/el pedido que se le está haciendo.