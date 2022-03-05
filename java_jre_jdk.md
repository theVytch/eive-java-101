### O que é Bytecode ?

- O código de um programa escrito na linguagem java é compilado para uma forma intermediária de código denominada bytecide, que é interpretada pelas maquinas virtuais java(JVMs).
-  *The code of a program written in the java language is compiled into an intermediate form of code called bytecode, which is interpreted by java virtual machines (JVMs.)*

### O que é JVM ?

- Máquina virtual Java(JVM) é um programa que carrega e executa os aplicativos Java, convertendo os bytecodes em código executável de máquina.
- *Java Virtual Machine(JVM) is a program that loads and executes Java applications, converting the bytecodes into machine executable code.*

### O que é JRE ?

- Java Runtime Environment(JRE) significa Ambiente de Tempo de Execução Java, e é utilizado para executar as aplicações da plataforma Java.
- *Java Runtime Environment is used to run Java platform applications.*

### O que é JDK ?

- Java Development Kit(JDK) significa Kit de Desenvolvimento Java, e é um conjunto de utilitários que permitem criar sistemas de software para a plataforma Java. É composto por compilador e bibliotecas.
- *Java Development Kit is a set of utilities that allow you to create software systems for the Java platform. It consists of compiler and libraries.*

### Quais as diferenças entre um tipo primitivo e uma classe Wrapper ?

- As classes wrapper são objetos e são mantidas no heap enquanto que as variáveis locais são preservadas na pilha.

- As variáveis primitivas são mais rápidas e consomem menos memória já os objetos permitem operações mais complexas como conversão de tipo, “key” em HashMap.

  

- *Wrapper classes are objects and are kept on the heap while local variables are preserved on the stack.*

- *Primitive variables are faster and consume less memory while objects allow more complex operations such as type conversion, “key” in HashMap.*

### O que é e como utilizar o Type Casting  ?

- Na linguagem Java, é possível se atribuir o valor de um tipo de variável a outro tipo de variável, porém para tal é necessário que esta operação seja apontada ao compilador. A este apontamento damos o nome de casting.

- Para fazer um casting, basta sinalizar o tipo para o qual se deseja converter entre parênteses, da seguinte forma:

- ```java
  //Conversão do double 5.0 para float.
  float a  = (float) 5.0;
  
  //Conversão de double para int.
  int b = (int) 5.1987;
  
  //Conversão de int para float é implícito, não precisa de casting.
  float c = 100;
  
  //Conversão de char para int é implícito, não precisa de casting.
  int d = 'd';
  ```

### Quando e por que utilizar o comando break ?

- O comando break tem uma ótima utilidade para sair de um laços de repetição quando nos já conseguimos encontrar o que queríamos, fazendo com que o programa não precise percorrer o resto do laço, isso ajuda na velocidade de resposta do programa.
- *The break command is very useful to get out of a loop when we have already found what we wanted, making the program not need to go through the rest of the loop, which helps the program's response speed.*

