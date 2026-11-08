# JFo 3-2 - Datos numericos

Esta carpeta contiene 15 actividades autocorregibles del modulo 3.

## Actividades

01. Corrige errores con tipos enteros
02. Corrige literales long y float
03. Corrige una division inesperada
04. Corrige el orden de operaciones
05. Corrige errores de modulo y division
06. Calcula el area de un rectangulo
07. Calcula el precio total
08. Convierte minutos a horas y minutos restantes
09. Calcula el promedio de tres notas
10. Calcula el perimetro y area de un circulo
11. Reparte objetos entre personas
12. Calculadora de sueldo semanal
13. Conversor de temperatura
14. Calculadora de compra con descuento
15. Simulador de puntos de videojuego

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
