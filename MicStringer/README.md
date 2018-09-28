#Oefening week 4

1. Maak een JEE opdracht met maven aan. Het artifactid = Stringer
2. Zorg dat als je in de browser naar http://localhost:8081/stringer gaat, dat de tekst "Mijn eigen stringer" wordt getoond.
3. Maak een klasse Stringer. Deze heeft als attributen "string" en "reverse". Laat deze Stringer IStringer implementeren
4. Als je http://localhost:8081/stringer/reverse?string=hallo aanroept, dan wordt er ollah naar de browser geschreven. Implementeer hiervoor een reverse functie in de klasse Stringer.
5. Als je een POST doet naar //localhost:8081/stringer/reverse dan krijg je op basis van een meegegeven string het hele object in json terug. Inclusief de http Ok status.
6. Neem de klasse StringCalc in je applicatie op.
7. Gebruik het adapter pattern om de StringCalc te converten naar IStringer. Uiteraard mag je de StringCalc niet aanpassen, behalve de package.
8. Zorg ervoor dat als je http://localhost:8081/stringer/reverse/27+5 aanroept, deze adapter gebruikt om de reverse van de optelling in json terug te sturen. Het bericht ziet er als volgt uit: {"Reverse calced":"585"}
9. Controleer of er in de bij 8 gebruikte parameter wel een +, - of * zit. Zo niet, retourneer dan een error code 400.