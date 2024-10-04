# InfiniteIntArray

Abbiamo visto che gli array sono un po' scomodi perché hanno dimensione fissa. Vogliamo realizzare una classe che implementi un array infinito di interi.

Inizialmente l'array avrà 10 celle e size = 0. Ogni volta che viene aggiunto un nuovo elemento, size sarà incrementato. Ogni volta che un elemento sarà rimosso, size sarà decrementato. Quando non c'è più spazio per nuovi elementi, verrà creato un nuovo array che rimpiazzerà l'array precedente (copiandone tutti gli elementi precedenti). Il tutto in modo trasparente per l'utente.

Viene già fornito un main di test.