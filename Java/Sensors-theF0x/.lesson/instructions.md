# Eccezioni

Le eccezioni in Java sono eventi anomali che si verificano durante l'esecuzione di un programma. Gestire correttamente le eccezioni è essenziale per scrivere codice robusto e prevenire il fallimento del programma in caso di situazioni impreviste. Una delle caratteristiche fondamentali delle eccezioni è la capacità di interrompere normalmente il flusso di esecuzione del programma quando si verificano problemi, dando modo al programmatore di affrontare tali situazioni in modo controllato.

## Esempio di eccezione personalizzata
Supponiamo di voler gestire un'eccezione personalizzata chiamata `MyException` che estende `RuntimeException`. Questa eccezione potrebbe essere utilizzata per rappresentare un errore specifico nel tuo programma. Ecco un esempio di come potrebbe apparire:

```Java
public class MyException extends RuntimeException {
  public MyException(String message) {
    super(message);
  }
}
```
Nel codice sopra, `MyException` estende `RuntimeException` e accetta un parametro `message` nel costruttore, consentendo di fornire un messaggio dettagliato quando l'eccezione viene lanciata.

## Try-catch
Ora, vediamo come utilizzare un blocco `try-catch` per gestire un'eccezione. Supponiamo di voler dividere due numeri inseriti dall'utente e gestire l'eccezione `ArithmeticException` che si verifica quando si tenta di dividere per zero. Ecco un esempio:

```Java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Inserisci il numeratore: ");
      int numeratore = scanner.nextInt();

      System.out.print("Inserisci il denominatore: ");
      int denominatore = scanner.nextInt();

      int risultato = numeratore / denominatore;

      System.out.println("Risultato: " + risultato);
    } catch (ArithmeticException e) {
      System.out.println("Errore: Impossibile dividere per zero. Assicurati che il denominatore non sia zero.");
    } catch (Exception e) {
      System.out.println("Errore generico: " + e.getMessage());
    } finally {
      // Eventuali operazioni da eseguire sempre, indipendentemente dal fatto che ci sia stata un'eccezione o meno.
      System.out.println("Operazioni di pulizia o finalizzazione");
    }
  }
}
```

n questo esempio, il blocco `try-catch` gestisce l'eccezione `ArithmeticException` e fornisce un messaggio appropriato in caso di divisione per zero. Il blocco `finally` viene eseguito indipendentemente dal fatto che un'eccezione sia stata lanciata o meno, ed è spesso utilizzato per eseguire operazioni di pulizia o finalizzazione.

# Esercizio: Sensors

## Obiettivo
Gestione delle eccezioni nei sensori di temperatura

## Descrizione
Si vuole simulare un ambiente in cui sono presenti diversi sensori di temperatura. Ogni sensore può essere funzionante o guasto. Nel caso in cui un sensore sia guasto, verrà lanciata un'eccezione di tipo `SensorMalfunctionException` quando si tenta di ottenere la temperatura.

## Versione 1

* All'interno del metodo main, creare un array di 100 sensori.
Utilizzare un loop per iterare attraverso i sensori e raccogliere le temperature. Se un sensore è guasto, gestire l'eccezione in modo appropriato (ad esempio, stampare un messaggio e segnalare il sensore come non funzionante).
* Calcolare la temperatura media solo per i sensori funzionanti.
* Stampare la temperatura media ottenuta.
* Stampare il numero di sensori guasti

## Versione 2

Invece di avere questa logica nel `main` creeremo una classe `SensorSystem` che conterrà al suo interno l'array di 100 sensori. Avrà inoltre un array di 10 `double` per tenere uno storico di 10 medie e un array di 10 `int` per tenere traccia dei sensori rotti.

Verrà implementato quindi un metodo `calculateAverageTemperatures` che per 10 volte chiederà le temperature ai sensori e le inserirà nell'array. Nell'altro array verrano inseriti i numeri di sensori rotti.

Alla fine quindi verranno stampati i risultati dei 10 giri.