# Student's grades with arrays

L'esercizio è simile a Student's grades. In questo caso però la classe `Student` ha un array di `int` per i voti invece di avere cinque attributi distinti.

Il costruttore prenderà:
* Nome studente
* Cognome studente
* **Cinque interi per i voti (non un array)**

La classe `Student` ha ancora i metodi pubblici:
* `average`: metodo che calcola la media dei voti.
* `passed`: metodo che restituisce `true` se lo studente è promosso e `false` se è bocciato (è bocciato se la media è inferiore a 6).
* `print`: metodo che stampa lo studente con una stringa del tipo "Quincy Hernandez: voto medio 5.6, esito: bocciato".

Questi metodi ovviamente andranno adeguati ai nuovi attributi della classe (ovvero l'array invece dei 5 interi).

Inoltre, nel `main` avremo un array di studenti e dei metodi statici per:
* `average`: metodo statico che calcola la media di tutti gli studenti (che sarà la media delle medie degli studenti).
* `countPassedStudents`: metodo statico che conta il numero degli studenti promossi.