---
layout: post
title: "Inserting values into an Array List"
date: 2016-08-13 13:30:00
categories: code tutorial
---
Array Lists are simple data structures in object-oriented programming (OOP) languages. Let's implement one in Java along with some basic algorithms for working on it.

Start with the class template and add the necessary data members.

{%highlight java%}
public class ArrayList {
    //Our array list works as a wrapper class around the array object
    String [] array;
    //Keeps track of the size
    int size;
    //Max capacity
    int capacity = 1000;
}
{% endhighlight %}

Go ahead and declare a default constructor.

{%highlight java%}
public ArrayList() {
    this.size = 0;
    array = new String[this.capacity];
}
{% endhighlight %}

Now let's write a method for adding data to the end of the Array List. Start with a public method signature that takes a String as a parameter. That's what we'll add to our Array List. We increment the size variable to keep track of how many items are in the Array List. Then we decrement the capacity variable to keep track of how much memory we've used (if the capacity equals the size, we'll have to do something about it.)

{%highlight java%}
public void addToEnd(String val)
    this.array[this.size] = val;
    this.size++;
    capacity--;
{% endhighlight %}

That wasn't too bad. But things get trickier when we want to add to the front of the Array List. We want to accomplish two things:

* Keep an Array List without any holes.
* Avoid overwriting an existing data.

So if we insert any data in the front of the list, all of the items in the list will need to be shifted up (or to the right) one spot. This makes room for the first item in the list.

Take a close look at the for loop below. Our loop variable, i, effectively "opens up" a space **after** the last item in the list. The algorithm copies the value from the left into the empty space on the right.

{%highlight java%}
public void addToFront(String val) {
    //Consider throwing an error here if size and capacity are equal
    this.size++;
    for (int i = this.size; i >= 1; i--) {
        array[i] = array [i - 1];
    }
    array[0] = val;
    capacity--;
}
{% endhighlight %}

This operation may seem computationally expensive, but it's not too bad. If there are *n* items in the list, the algorithm will require *n* shifts. Hence the operation has a time complexity function of *O(n)*. In other words, the amount of operations is exactly proportional to the number of items in the list.
