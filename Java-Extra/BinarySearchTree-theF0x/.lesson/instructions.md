# Binary Search Tree

La struttura nodo diventa:

```Java
public class Node {
  public int data;
  public Node left;
  public Node right;

  public Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Node(int data) {
    this(data, null, null);
  }

}
```

per cui ogni nodo ha due figli, da cui il nome di albero binario. Un albero binario si dice albero binario di ricerca (binary search tree), se vengono mantenute sempre queste regole:

1. il nodo sinistro è più piccolo del padre
2. il nodo destro è più grande del padre

I metodi `add` e `remove` devono quindi mantenere questa regola.

Per informazioni extra, consultare https://www.freecodecamp.org/news/how-linked-lists-work/