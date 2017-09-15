# dea-week-2-vrijdag

## Deel 1 opzet

* Creeer een Java project met Maven
    * Kies een groupId die zinnig is en aan de conventies voldoet
    * Kies een artifactId die zinnig is.
* Zorg ervoor dat je JUnit versie 4.12 als dependency in je pom hebt staan
* Plaats de drie bestanden die in dit project zetten op de juiste plek in je nieuwe project.

## Deel 2 Project werkend maken

Het project bevat nu een klein programmatje waarmee je kunt testen of getallen
een priemgetal zijn. Er mist nog een belangrijk onderdeel, namelijk de methode die test of een getal priem is. Deze gaan we niet zelf schrijven.

* Importeer mbv Maven de dependency `org.apache.commons.commons-math3`, versie 3.6.1.
* Deze dependency bevat een klasse `Primes` met een methode `isPrime()`. Deze zie je terug op regel 23 van `PrimeTester`. Zorg dat hij het doet.
* Met een beetje geluk heb je nu een werkende applicatie. Run hem via de commandline met Maven

## Deel 3 Multithreaded maken
We gaan er nu voor zorgen dat je vanuit de `PrimeTestingApp` meerdere threads opstart met een `PrimeTester`. Deze zullen gelijktijdig naar priemgetallen gaan zoeken. Vier threads is genoeg.

* Verhoog de stopconditie tot 2000. Deze kun je vinden op regel 8 van `PrimeTestingApp`.
* Zorg ervoor dat je `PrimeTesters` als Threads kunt opstarten. (Pas hierbij de methode `startTesting` niet aan. Maar laat hem zoals hij is en roep hem aan vanuit de nieuwe `run()` methode)
* Maak in `PrimeTestingApp` vier instanties van `PrimeTesters` en start deze op in afzonderlijke threads.
* Maak je applicatie ThreadSafe

## Deel 4 Omgaan met het getal 37
We gaan de code nu zo aanpassen dat de Thread die het getal 37 ontdekt als priemgetal zal sterven.

* Maak een Checked Exception met de naam `OuchIFoundThirtySevenAndHenceMustDieException`. Zet hem ook in de juiste package.
* Zorg ervoor dat zo snel een 'PrimeTester' erachter komt dat hij 37 aan het testen is, hij de Exceptie gooit.
* Deze exceptie al gegooit worden door de methode `startTesting` en opgevangen moeten worden door
de `run()` methode. Wanneer hij de exceptie vangt moet hij de volgende regel naar `console.log` printen:

``` 13 found Thirty Seven and must die. ```

Dus eerst de id van de thread en dan het bericht dat hij zal sterven.

## Deel 5 Unittesten
Je hebt nu drie klassen en nul unittests.

* Zorg ervoor dat je voor alle publieke methodes een zinnige unittest hebt. 


