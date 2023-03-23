// Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
// Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
// Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
// Passo 5: Repita os passos 2 e 3. 
// Passo 6: Exiba todos os números que foram inseridos na fila. 
 
// Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 

import java.util.*;

public class Main {

@SuppressWarnings("empty-statement")

public static void main(String[] args) {

ArrayList lista = new ArrayList<>(5);

  System.out.println("Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma LISTA - com 5 células;");

  for (int i=1;i<=5;i++){

   lista.add(i);

}

 System.out.println(lista);

System.out.println("--------------------------------------------");

 

  System.out.println("Passo 2: Remova todos os dados da LISTA");

   System.out.println("Deve-se sempre remover os dados da célula inicial da lista");

  while(!lista.isEmpty()) {

    lista.remove(0);

       System.out.println(lista);

}

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 2: insira-os em uma PILHA - com 5 células");

  Stack<Integer> pilha = new Stack<Integer>();

for (int i=1;i<=5;i++){

   pilha.push(i);

}

   System.out.println(pilha);

   System.out.println("--------------------------------------------");

   System.out.println("Passo 3: Remove os dados da PILHA");

   pilha.clear();

   System.out.println(pilha);

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 3: insira-os em uma FILA - com 10 células)");

   ArrayDeque fila = new ArrayDeque<>(10);

  for (int i=1;i<=5;i++){

   fila.push(i);

}

   System.out.println(fila);

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 4: Insira os números [6, 7, 8, 9 e 10] na LISTA");

  for (int i=6;i<=10;i++){

   lista.add(i);

}

   System.out.println(lista);

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 5: Repita os passos 2 e 3");

  System.out.println("Passo 2: Remova todos os dados da LISTA");

   System.out.println("Deve-se sempre remover os dados da célula inicial da lista");

  while(!lista.isEmpty()) {

    lista.remove(0);

    System.out.println(lista);

}

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 2: insira-os em uma PILHA - com 5 células");

for (int i=6;i<=10;i++){

   pilha.push(i);

}

   System.out.println(pilha);

   System.out.println("--------------------------------------------");

   System.out.println("Passo 3: Remove os dados da PILHA");

   pilha.clear();

   System.out.println(pilha);

   System.out.println("--------------------------------------------");

   

   System.out.println("Passo 3: insira-os em uma FILA - com 10 células)");

  for (int i=6;i<=10;i++){

   fila.push(i);

}

   System.out.println("Passo 6: Exiba todos os números que foram inseridos na FILA");

   System.out.println(fila);

   System.out.println("--------------------------------------------");

}

}