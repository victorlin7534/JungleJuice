//StillCold (Fiona Cai, Kevin Feng, Alexia Leong)
//APCS2 pd1
//QQKachoo Driver
/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeTester{
  public static void main(String[] args) {
    QQKachoo<String> iscream = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    iscream.enqueueFront("Chocolate");
    System.out.println(iscream.peekFront()); //Chocolate
    iscream.enqueueFront("Vanilla");
    System.out.println(iscream.peekFront()); //Vanilla
    iscream.enqueueFront("Strawberry");
    System.out.println(iscream.peekFront()); //Strawberry
    iscream.enqueueFront("Mint");
    System.out.println(iscream.peekFront()); //Mint

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.enqueueEnd("Pistachio");
    System.out.println(iscream.peekEnd()); //Pistachio
    iscream.enqueueEnd("Coffee");
    System.out.println(iscream.peekEnd()); //Coffee
    iscream.enqueueEnd("S'mores");
    System.out.println(iscream.peekEnd()); //S'mores

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("-----Removing from front-----");
    iscream.dequeueFront(); //Mint  dies
    System.out.println(iscream.peekFront()); //Strawberry

    System.out.println("");

    System.out.println("-----Removing from end-----");
    iscream.dequeueEnd(); //S'mores dies
    System.out.println(iscream.peekEnd()); //Coffee

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    iscream.dequeueFront();
    System.out.println(iscream);
    iscream.dequeueEnd();
    System.out.println(iscream);
    iscream.dequeueFront();
    System.out.println(iscream);
    iscream.dequeueEnd();
    System.out.println(iscream);
    iscream.dequeueFront();
    System.out.println(iscream);
    System.out.println("Empty now?: "+iscream.isEmpty()); //true
    iscream.dequeueFront();
    iscream.dequeueFront();
    System.out.println(iscream);
  }





}
