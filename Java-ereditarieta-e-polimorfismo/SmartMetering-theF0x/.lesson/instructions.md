# Smart-metering  

La società di servizi di una città lancia un progetto di _smart-metering_ con il quale intende automatizzare la lettura dei contatori di gas, elettricità e acqua delle abitazioni private.

Per ogni **contatore**, indipendentemente dal tipo, sono noti il numero di matricola univoco, la data di installazione e la data/ora dell'ultima lettura effettuata.

* **Per tutte le tipologie di contatore** deve essere possibile, da parte del sistema di lettura automatizzato, registrare una nuova lettura effettuata e acquisire il consumo da fatturare:
* per i **contatori del gas e dell'acqua** che hanno un ciclo di misurazione incrementale deve essere memorizzata la lettura precedente in modo da poter fornire la differenza.
* i **contatori elettrici** hanno invece un ciclo di misurazione che si azzera a ogni lettura per cui non è necessario, ma hanno una potenza massima istantanea che li caratterizza.

Progettare mediante un diagramma UML le classi che consentono di rappresentare lo scenario descritto e implementarle in linguaggio Java prevedendo una classe `Main` dotata di un metodo `main` di test delle funzionalità.

## Date in Java

Local date and time in Java: https://www.w3schools.com/java/java_date.asp

Esempio:

```Java
// prendo data e ora correnti
LocalDateTime now = LocalDateTime.now();
// imposto una data/ora specifica
LocalDateTime date = LocalDateTime.of(2020, 10, 25, 10, 20, 34);
Duration duration = Duration.between(date, now);
long seconds = duration.getSeconds();
```