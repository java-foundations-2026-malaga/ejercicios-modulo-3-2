# JFo 3-2 - Actividad 01

## Corrige errores con tipos enteros

Los valores no caben en byte ni short. Corrige los tipos.

## Objetivo

- Leer el codigo base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorreccion.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Habitantes: 200
Distancia: 40000
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo3_2_actividad01/Actividad01.java`.
3. Corrige o completa el codigo.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/modulo3_2_actividad01/Actividad01Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
