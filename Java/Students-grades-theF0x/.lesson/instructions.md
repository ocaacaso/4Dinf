# Student's grades
  
Realizzare la classe `Student` che rappresenta uno studente. La classe avrà i seguenti campi:

* nome studente
* cognome studente
* voto per italiano
* voto per storia
* voto per matematica
* voto per informatica
* voto per inglese

## Prima parte

Scrivere nel `main` i seguenti metodi statici:

* `average`: metodo statico che calcola la media dei voti.
* `passed`: metodo statico che restituisce `true` se lo studente è promosso e `false` se è bocciato (è bocciato se la media è inferiore a 6).
* `print`: metodo statico che stampa lo studente con una stringa del tipo "Quincy Hernandez: voto medio 5.6, esito: bocciato".

## Seconda parte

* Rendere gli attributi della classe `Student` privati.
* Trasformare i tre metodi statici del `main` in metodi della classe `Student` e modificare il `main` di conseguenza.