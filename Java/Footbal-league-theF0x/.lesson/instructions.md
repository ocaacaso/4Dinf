# Footbol league

Ogni squadra ha i seguenti attributi:

* numero di partite vinte (_won_)
* numero di partite perse (_lost_)
* numero di partite pareggiate (_drawn_)
* numero di gol fatti (_scored_)
* numero di gol subiti (_conceded_)

## Differenze con il C

* Quella che in C era una struttura in Java diventa una classe.

* Quelli che nelle strutture erano chiamati campi nelle classi vengono chiamati attributi.

* Ogni cosa in Java è contenuto in una classe, anche il `main` (che nel nostro caso è in una classe chiamata `Main`).

```Java
public class Main {
  public static main(String args[]) {
    ...
  }
}
```

* Per creare una classe devo usare un **costruttore**:

```Java
...
Team t1 = new Team();
...
```

* Per usare in Java una approccio _imperativo/procedurale_ (come quello che usavamo in C) devo usare metodi statici:

```Java
...
static void printTeam(Team t) {
  
}
...
```

* Per stampare su console si usano i comandi:
  * System.out.print(): stampa senza andare a capo
  * System.out.println(): stampa e va a capo
  * System.out.printf(): simile al printf di C

## Esercizio

* Scrivere un metodo statico nella classe main che calcoli il punteggio della squadra (3 punti per le vittorie e 1 per i pareggi).
* Scrivere un metodo statico nella classe main che stampi la squadra con questo formato "Manchester United: 42"

# Dalle struct alle classi

[Dalle struct alle classi](https://docs.google.com/document/d/1-mSeVxkVm_8NMNYFQd-RJXrlTGnEoQPCtdGW8tCNyQU/edit?usp=sharing)