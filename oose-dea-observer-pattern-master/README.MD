# Inleiding

In deze oefening gaan we een klas en een les modelleren in Java. De klas bestaat uit een aantal studenten en een 
docent. De docent geeft een college. Iedere keer als hij wat zegt, noteren de studenten dit in hun logboek.

De docent heeft geen notie van zijn studenten. Hij geeft college en op ieder moment kan een nieuwe student de les 
binnenkomen en mee gaan luisteren.

Dit probleem vraagt om het toepassen van het Observer Pattern. In deze opdracht gaan we dit uitwerken.

## Stap 1 Snappen van de opzet
Bekijk de code en voer het uit. Wat opvalt is dat de `Teacher` zijn wijsheden doceert, zonder dat zijn studenten 
zich hier bewust van zijn.

## Stap 2 Zorg ervoor dat de studenten de docent gaan observeren
Zorg ervoor dat je de Java Interface `Observer` en de Java Klasse `Observable` op de juiste manier toepast. Iedere 
keer als de docent nu iets zegt, moeten de Studenten dit te horen krijgen en vervolgens de methode `makeNote()` 
aanroepen.

## Stap 3 Studenten verantwoordelijk maken voor het registeren 
Wat opvalt in de JAVA API is dat de Observable een lijst van Observers heeft. Nieuwe Studenten worden nu vanuit de 
`CourseApp` geregistreerd bij de `Teacher`. Pas dit zodanig aan, dat een `Student` een `setTeacher(teacher)` 
methode heeft. Wanneer deze wordt aangeroepen, registreerd de student zichzelf bij de Teacher.

## Stap 4 Studenten verlaten de les
Studenten zullen ook soms de klas tussentijds verlaten. Dit gaan we nu inbouwen.

* Zorg ervoor dat zo wanneer `setTeacher(teacher)` wordt aangeroep er een teller wordt geinstantieerd met een 
willekeurig getal tussen de 0 en 20. Hoe je een willekeurig getal tussen de 0 en 20 moet krijgen, kun je terug vinden 
in de klasse `Teachings.java`.
* Zorg ervoor dat studenten bijhouden hoeveel notities ze gemaakt hebben (verlaag de teller met 1 wanneer `makeNotes()` wordt aangeroepen).
* Zorg ervoor dat als de teller op 0 staat, de Student zichzelf deregistreerd als `Observable`.
* Zorg ervoor dat de docent stop met doceren wanneer er geen studenten meer naar hem luisteren. Merk hiervoor op dat een `Observable` de methode `countObservers()` heeft.

## Stap 5 Verlagen koppeling
In de huidige oplossing kent de observer de observable. Dit zorgt voor koppeling tussen de observers en de observable.
* Maak een klasse Les die zorgt voor de koppeling tussen de teacher en de students, zodat deze elkaar niet kennen.
* Wat vind je zelf een nettere oplossing. Met de klasse Les? Of zonder?
