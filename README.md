# Weighted-Random-Sampling
Java Implementation of Weighted Random Sampling Algorithm

#1. Download code
````
git clone git@github.com:GaloisGun/Weighted-Random-Sampling.git
````

#2. Run in any IDE
The main method is in the Tester, you can change input by changing input ArrayList

#3. Examples
## Initialize a new input list
````
List<Element> testList = new ArrayList<>();
````

## Input testing data
````
        testList.add(new Element(1,"Bear"));
        testList.add(new Element(1, "Dog"));
        testList.add(new Element(2, "Panguin"));
````
The random rate for "Bear", "Dog" and "Panguin" is 1 : 1 : 2

The method will print the name of the random elements.